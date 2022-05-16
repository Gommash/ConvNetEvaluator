package imagemanipulator_macros;

public class SharpnessFilter extends ImageMacro {
	
	public SharpnessFilter(float value, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"sharpness "+ value+"\"");
	}
}
