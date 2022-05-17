package imagemanipulator_macros;

public class SharpnessFilter extends ImageMacroPython {
	
	public SharpnessFilter(String imgPath, String saveToPath,float value, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"sharpness "+ value+"\"");
	}
}
