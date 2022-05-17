package imagemanipulator_macros;

public class RandomVerticalFlip extends ImageMacro{
	public RandomVerticalFlip(float probability,boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"random-horizontal-flip "+ probability+"\"");
	}
}