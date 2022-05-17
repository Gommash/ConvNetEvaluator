package imagemanipulator_macros;

public class RandomHorizontalFlip extends ImageMacroPython{
	public RandomHorizontalFlip(float probability,boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"random-horizontal-flip "+ probability+"\"");
	}
}
