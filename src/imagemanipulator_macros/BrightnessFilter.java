package imagemanipulator_macros;

public class BrightnessFilter extends ImageMacro {
	
	public BrightnessFilter(float value, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"brightness "+ value+"\"");
	}
}
