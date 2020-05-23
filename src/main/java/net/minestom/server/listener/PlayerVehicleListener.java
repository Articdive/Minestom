package net.minestom.server.listener;

import net.minestom.server.entity.Entity;
import net.minestom.server.entity.Player;
import net.minestom.server.entity.type.EntityBoat;
import net.minestom.server.network.packet.client.play.ClientSteerBoatPacket;
import net.minestom.server.network.packet.client.play.ClientSteerVehiclePacket;
import net.minestom.server.network.packet.client.play.ClientVehicleMovePacket;
import net.minestom.server.network.packet.server.play.VehicleMovePacket;
import net.minestom.server.utils.Position;

public class PlayerVehicleListener {

    public static void steerVehicleListener(ClientSteerVehiclePacket packet, Player player) {
        byte flags = packet.flags;
        boolean jump = (flags & 0x1) != 0;
        boolean unmount = (flags & 0x2) != 0;
        player.refreshVehicleSteer(packet.sideways, packet.forward, jump, unmount);
    }

    public static void vehicleMoveListener(ClientVehicleMovePacket packet, Player player) {
        Entity vehicle = player.getVehicle();

        if (vehicle == null)
            return;

        Position newPosition = new Position((float) packet.x, (float) packet.y, (float) packet.z);
        vehicle.refreshPosition(newPosition);
        vehicle.refreshView(packet.yaw, packet.pitch);
        vehicle.askSynchronization();

        VehicleMovePacket vehicleMovePacket = new VehicleMovePacket();
        vehicleMovePacket.x = packet.x;
        vehicleMovePacket.y = packet.y;
        vehicleMovePacket.z = packet.z;
        vehicleMovePacket.yaw = packet.yaw;
        vehicleMovePacket.pitch = packet.pitch;
        player.getPlayerConnection().sendPacket(vehicleMovePacket);

    }

    public static void boatSteerListener(ClientSteerBoatPacket packet, Player player) {
        Entity vehicle = player.getVehicle();

        if (vehicle == null || !(vehicle instanceof EntityBoat))
            return;

        EntityBoat boat = (EntityBoat) vehicle;
        boat.refreshPaddle(packet.leftPaddleTurning, packet.rightPaddleTurning);
    }

}
