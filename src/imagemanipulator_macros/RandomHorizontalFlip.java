package imagemanipulator_macros;

public class RandomHorizontalFlip extends ImageMacro{
	public RandomHorizontalFlip(float probability,boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"random-horizontal-flip "+ probability+"\"");
	}
}
