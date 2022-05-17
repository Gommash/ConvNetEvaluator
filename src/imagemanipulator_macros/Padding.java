package imagemanipulator_macros;

public class Padding extends ImageMacroPython {
	public Padding(int paddingLeft,int paddingDown,int paddingRight, int paddingTop,int width, int height,boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"padding "+ paddingLeft+","+paddingDown+" "+ paddingRight+","+paddingTop+" "+width+","+height+"\"");
	}
}
