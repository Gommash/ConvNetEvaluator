package imagemanipulator_macros;

public class RandomVerticalFlip extends ImageMacroPython{
	public RandomVerticalFlip(String imgPath, String saveToPath,float probability,boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"random-horizontal-flip "+ probability+"\"");
	}
}