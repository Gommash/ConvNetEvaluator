package imagemanipulator_macros;

public class SharpnessFilter extends ImageMacroPython {
	
	public SharpnessFilter(float value, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"sharpness "+ value+"\"");
	}
}
