package imagemanipulator_macros;

public class RandomPerspective extends ImageMacroPython {
	public RandomPerspective(String imgPath, String saveToPath,float distortionScale, float propability, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"random-perspective "+ distortionScale+" "+propability+"\"");
	}
}
