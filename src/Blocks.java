
public class Blocks {

	public static Block BlockArray[];
	public static Block rubyblock = new Block("Ruby Block", "blockruby.png");
	public static Block amethystblock = new Block("Amethyst Block", "blockamethyst.png");
	public static final int blocksMAX = 15381;
	
	Blocks(){
		int i;
		BlockArray = new Block[blocksMAX];
		for(i=0;i<blocksMAX;i++){
			BlockArray[i] = null;
		}
	}
	
	public int registerBlock(Block b) {
		int i;
		for(i=0;i<blocksMAX;i++){
			if(BlockArray[i] == null) {
				BlockArray[i] = b;
				b.id = i;
				return i;
			}
		}
		return 0;
	}
	
}
