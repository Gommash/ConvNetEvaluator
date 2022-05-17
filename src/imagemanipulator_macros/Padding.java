package imagemanipulator_macros;

public class Padding extends ImageMacroPython {
	public Padding(String imgPath, String saveToPath,int paddingLeft,int paddingDown,int paddingRight, int paddingTop,int width, int height,boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"padding "+ paddingLeft+","+paddingDown+" "+ paddingRight+","+paddingTop+" "+width+","+height+"\"");
	}
}
