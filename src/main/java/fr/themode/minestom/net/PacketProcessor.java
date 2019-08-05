package fr.themode.minestom.net;

import fr.adamaq01.ozao.net.Buffer;
import fr.adamaq01.ozao.net.packet.Packet;
import fr.adamaq01.ozao.net.server.Connection;
import fr.themode.minestom.entity.Player;
import fr.themode.minestom.net.packet.client.ClientPlayPacket;
import fr.themode.minestom.net.packet.client.ClientPreplayPacket;
import fr.themode.minestom.net.packet.client.handler.ClientLoginPacketsHandler;
import fr.themode.minestom.net.packet.client.handler.ClientPlayPacketsHandler;
import fr.themode.minestom.net.packet.client.handler.ClientStatusPacketsHandler;
import fr.themode.minestom.net.packet.client.handshake.HandshakePacket;
import fr.themode.minestom.net.player.PlayerConnection;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import static fr.themode.minestom.net.protocol.MinecraftProtocol.PACKET_ID_IDENTIFIER;

public class PacketProcessor {

    private Map<Connection, PlayerConnection> connectionPlayerConnectionMap = new HashMap<>();

    private ConnectionManager connectionManager;

    // Protocols
    private ClientStatusPacketsHandler statusPacketsHandler;
    private ClientLoginPacketsHandler loginPacketsHandler;
    private ClientPlayPacketsHandler playPacketsHandler;

    public PacketProcessor(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;

        this.statusPacketsHandler = new ClientStatusPacketsHandler();
        this.loginPacketsHandler = new ClientLoginPacketsHandler();
        this.playPacketsHandler = new ClientPlayPacketsHandler();
    }

    public void process(Connection connection, Packet packet) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        int id = packet.get(PACKET_ID_IDENTIFIER);
        System.out.println("RECEIVED ID: " + id);
        Buffer buffer = packet.getPayload();
        connectionPlayerConnectionMap.get(connection);
        PlayerConnection playerConnection = connectionPlayerConnectionMap.computeIfAbsent(connection, c -> new PlayerConnection(c));
        ConnectionState connectionState = playerConnection.getConnectionState();

        if (connectionState == ConnectionState.UNKNOWN) {
            // Should be handshake packet
            if (id == 0) {
                HandshakePacket handshakePacket = new HandshakePacket();
                handshakePacket.read(buffer);
                handshakePacket.process(playerConnection, connectionManager);
            }
            return;
        }

        switch (connectionState) {
            case PLAY:
                Player player = connectionManager.getPlayer(playerConnection);
                if (playPacketsHandler.getPacketClass(id) == null) {
                    System.out.println("Packet not implemented !");
                    return;
                }
                ClientPlayPacket playPacket = (ClientPlayPacket) playPacketsHandler.getPacketClass(id).getDeclaredConstructor().newInstance();
                playPacket.read(buffer);
                playPacket.process(player);
                break;
            case LOGIN:
                ClientPreplayPacket loginPacket = (ClientPreplayPacket) loginPacketsHandler.getPacketClass(id).getDeclaredConstructor().newInstance();
                loginPacket.read(buffer);
                loginPacket.process(playerConnection, connectionManager);
                break;
            case STATUS:
                ClientPreplayPacket statusPacket = (ClientPreplayPacket) statusPacketsHandler.getPacketClass(id).getDeclaredConstructor().newInstance();
                statusPacket.read(buffer);
                statusPacket.process(playerConnection, connectionManager);
                break;
            case UNKNOWN:
                // Ignore packet (unexpected)
                break;
        }
    }
}
