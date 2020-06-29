package net.minestom.server.instance.block.states;
import net.minestom.server.instance.block.BlockAlternative;
import static net.minestom.server.instance.block.Block.*;
/**
 * Completely internal. DO NOT USE. IF YOU ARE A USER AND FACE A PROBLEM WHILE USING THIS CODE, THAT'S ON YOU.
 */
@Deprecated(forRemoval = false, since = "forever")
public class Tripwire {
	public static void initStates() {
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5259, "attached=true", "disarmed=true", "east=true", "north=true", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5260, "attached=true", "disarmed=true", "east=true", "north=true", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5261, "attached=true", "disarmed=true", "east=true", "north=true", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5262, "attached=true", "disarmed=true", "east=true", "north=true", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5263, "attached=true", "disarmed=true", "east=true", "north=true", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5264, "attached=true", "disarmed=true", "east=true", "north=true", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5265, "attached=true", "disarmed=true", "east=true", "north=true", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5266, "attached=true", "disarmed=true", "east=true", "north=true", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5267, "attached=true", "disarmed=true", "east=true", "north=false", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5268, "attached=true", "disarmed=true", "east=true", "north=false", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5269, "attached=true", "disarmed=true", "east=true", "north=false", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5270, "attached=true", "disarmed=true", "east=true", "north=false", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5271, "attached=true", "disarmed=true", "east=true", "north=false", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5272, "attached=true", "disarmed=true", "east=true", "north=false", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5273, "attached=true", "disarmed=true", "east=true", "north=false", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5274, "attached=true", "disarmed=true", "east=true", "north=false", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5275, "attached=true", "disarmed=true", "east=false", "north=true", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5276, "attached=true", "disarmed=true", "east=false", "north=true", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5277, "attached=true", "disarmed=true", "east=false", "north=true", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5278, "attached=true", "disarmed=true", "east=false", "north=true", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5279, "attached=true", "disarmed=true", "east=false", "north=true", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5280, "attached=true", "disarmed=true", "east=false", "north=true", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5281, "attached=true", "disarmed=true", "east=false", "north=true", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5282, "attached=true", "disarmed=true", "east=false", "north=true", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5283, "attached=true", "disarmed=true", "east=false", "north=false", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5284, "attached=true", "disarmed=true", "east=false", "north=false", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5285, "attached=true", "disarmed=true", "east=false", "north=false", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5286, "attached=true", "disarmed=true", "east=false", "north=false", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5287, "attached=true", "disarmed=true", "east=false", "north=false", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5288, "attached=true", "disarmed=true", "east=false", "north=false", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5289, "attached=true", "disarmed=true", "east=false", "north=false", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5290, "attached=true", "disarmed=true", "east=false", "north=false", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5291, "attached=true", "disarmed=false", "east=true", "north=true", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5292, "attached=true", "disarmed=false", "east=true", "north=true", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5293, "attached=true", "disarmed=false", "east=true", "north=true", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5294, "attached=true", "disarmed=false", "east=true", "north=true", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5295, "attached=true", "disarmed=false", "east=true", "north=true", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5296, "attached=true", "disarmed=false", "east=true", "north=true", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5297, "attached=true", "disarmed=false", "east=true", "north=true", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5298, "attached=true", "disarmed=false", "east=true", "north=true", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5299, "attached=true", "disarmed=false", "east=true", "north=false", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5300, "attached=true", "disarmed=false", "east=true", "north=false", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5301, "attached=true", "disarmed=false", "east=true", "north=false", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5302, "attached=true", "disarmed=false", "east=true", "north=false", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5303, "attached=true", "disarmed=false", "east=true", "north=false", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5304, "attached=true", "disarmed=false", "east=true", "north=false", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5305, "attached=true", "disarmed=false", "east=true", "north=false", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5306, "attached=true", "disarmed=false", "east=true", "north=false", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5307, "attached=true", "disarmed=false", "east=false", "north=true", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5308, "attached=true", "disarmed=false", "east=false", "north=true", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5309, "attached=true", "disarmed=false", "east=false", "north=true", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5310, "attached=true", "disarmed=false", "east=false", "north=true", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5311, "attached=true", "disarmed=false", "east=false", "north=true", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5312, "attached=true", "disarmed=false", "east=false", "north=true", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5313, "attached=true", "disarmed=false", "east=false", "north=true", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5314, "attached=true", "disarmed=false", "east=false", "north=true", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5315, "attached=true", "disarmed=false", "east=false", "north=false", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5316, "attached=true", "disarmed=false", "east=false", "north=false", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5317, "attached=true", "disarmed=false", "east=false", "north=false", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5318, "attached=true", "disarmed=false", "east=false", "north=false", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5319, "attached=true", "disarmed=false", "east=false", "north=false", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5320, "attached=true", "disarmed=false", "east=false", "north=false", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5321, "attached=true", "disarmed=false", "east=false", "north=false", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5322, "attached=true", "disarmed=false", "east=false", "north=false", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5323, "attached=false", "disarmed=true", "east=true", "north=true", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5324, "attached=false", "disarmed=true", "east=true", "north=true", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5325, "attached=false", "disarmed=true", "east=true", "north=true", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5326, "attached=false", "disarmed=true", "east=true", "north=true", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5327, "attached=false", "disarmed=true", "east=true", "north=true", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5328, "attached=false", "disarmed=true", "east=true", "north=true", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5329, "attached=false", "disarmed=true", "east=true", "north=true", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5330, "attached=false", "disarmed=true", "east=true", "north=true", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5331, "attached=false", "disarmed=true", "east=true", "north=false", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5332, "attached=false", "disarmed=true", "east=true", "north=false", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5333, "attached=false", "disarmed=true", "east=true", "north=false", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5334, "attached=false", "disarmed=true", "east=true", "north=false", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5335, "attached=false", "disarmed=true", "east=true", "north=false", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5336, "attached=false", "disarmed=true", "east=true", "north=false", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5337, "attached=false", "disarmed=true", "east=true", "north=false", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5338, "attached=false", "disarmed=true", "east=true", "north=false", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5339, "attached=false", "disarmed=true", "east=false", "north=true", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5340, "attached=false", "disarmed=true", "east=false", "north=true", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5341, "attached=false", "disarmed=true", "east=false", "north=true", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5342, "attached=false", "disarmed=true", "east=false", "north=true", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5343, "attached=false", "disarmed=true", "east=false", "north=true", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5344, "attached=false", "disarmed=true", "east=false", "north=true", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5345, "attached=false", "disarmed=true", "east=false", "north=true", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5346, "attached=false", "disarmed=true", "east=false", "north=true", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5347, "attached=false", "disarmed=true", "east=false", "north=false", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5348, "attached=false", "disarmed=true", "east=false", "north=false", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5349, "attached=false", "disarmed=true", "east=false", "north=false", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5350, "attached=false", "disarmed=true", "east=false", "north=false", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5351, "attached=false", "disarmed=true", "east=false", "north=false", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5352, "attached=false", "disarmed=true", "east=false", "north=false", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5353, "attached=false", "disarmed=true", "east=false", "north=false", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5354, "attached=false", "disarmed=true", "east=false", "north=false", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5355, "attached=false", "disarmed=false", "east=true", "north=true", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5356, "attached=false", "disarmed=false", "east=true", "north=true", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5357, "attached=false", "disarmed=false", "east=true", "north=true", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5358, "attached=false", "disarmed=false", "east=true", "north=true", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5359, "attached=false", "disarmed=false", "east=true", "north=true", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5360, "attached=false", "disarmed=false", "east=true", "north=true", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5361, "attached=false", "disarmed=false", "east=true", "north=true", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5362, "attached=false", "disarmed=false", "east=true", "north=true", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5363, "attached=false", "disarmed=false", "east=true", "north=false", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5364, "attached=false", "disarmed=false", "east=true", "north=false", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5365, "attached=false", "disarmed=false", "east=true", "north=false", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5366, "attached=false", "disarmed=false", "east=true", "north=false", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5367, "attached=false", "disarmed=false", "east=true", "north=false", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5368, "attached=false", "disarmed=false", "east=true", "north=false", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5369, "attached=false", "disarmed=false", "east=true", "north=false", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5370, "attached=false", "disarmed=false", "east=true", "north=false", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5371, "attached=false", "disarmed=false", "east=false", "north=true", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5372, "attached=false", "disarmed=false", "east=false", "north=true", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5373, "attached=false", "disarmed=false", "east=false", "north=true", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5374, "attached=false", "disarmed=false", "east=false", "north=true", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5375, "attached=false", "disarmed=false", "east=false", "north=true", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5376, "attached=false", "disarmed=false", "east=false", "north=true", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5377, "attached=false", "disarmed=false", "east=false", "north=true", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5378, "attached=false", "disarmed=false", "east=false", "north=true", "powered=false", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5379, "attached=false", "disarmed=false", "east=false", "north=false", "powered=true", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5380, "attached=false", "disarmed=false", "east=false", "north=false", "powered=true", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5381, "attached=false", "disarmed=false", "east=false", "north=false", "powered=true", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5382, "attached=false", "disarmed=false", "east=false", "north=false", "powered=true", "south=false", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5383, "attached=false", "disarmed=false", "east=false", "north=false", "powered=false", "south=true", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5384, "attached=false", "disarmed=false", "east=false", "north=false", "powered=false", "south=true", "west=false"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5385, "attached=false", "disarmed=false", "east=false", "north=false", "powered=false", "south=false", "west=true"));
		TRIPWIRE.addBlockAlternative(new BlockAlternative((short) 5386, "attached=false", "disarmed=false", "east=false", "north=false", "powered=false", "south=false", "west=false"));
	}
}
