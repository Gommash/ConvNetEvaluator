package imagemanipulator_macros;

public class GaussianBlur extends ImageMacroPython {
	
	public GaussianBlur(String imgPath, String saveToPath,int width, int height,boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"gaussian-blur "+ width+","+height+"\"");
	}
}
