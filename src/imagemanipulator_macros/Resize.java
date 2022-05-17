package imagemanipulator_macros;

public class Resize extends ImageMacroPython {
	public Resize(String imgPath, String saveToPath,int width, int height,boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"resize "+ width+","+height+"\"");
	}
}
