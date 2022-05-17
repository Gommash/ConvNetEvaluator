package imagemanipulator_macros;

public class BrightnessFilter extends ImageMacroPython {
	
	public BrightnessFilter(float value, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"brightness "+ value+"\"");
	}
}
