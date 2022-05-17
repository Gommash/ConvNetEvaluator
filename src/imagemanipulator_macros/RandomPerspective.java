package imagemanipulator_macros;

public class RandomPerspective extends ImageMacro {
	public RandomPerspective(float distortionScale, float propability, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"random-perspective "+ distortionScale+" "+propability+"\"");
	}
}
