package imagemanipulator_macros;

public class RandomPerspective extends ImageMacroPython {
	public RandomPerspective(float distortionScale, float propability, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"random-perspective "+ distortionScale+" "+propability+"\"");
	}
}
