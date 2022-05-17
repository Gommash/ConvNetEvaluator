package imagemanipulator_macros;

public class BrightnessFilter extends ImageMacroPython {
	
	public BrightnessFilter(String imgPath, String saveToPath,float value, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"brightness "+ value+"\"");
	}
}
