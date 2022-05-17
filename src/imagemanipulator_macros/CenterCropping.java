package imagemanipulator_macros;

public class CenterCropping extends ImageMacroPython {
	public CenterCropping(String imgPath, String saveToPath,int width, int height, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"center-crop "+ width+","+height+"\"");
	}
}
