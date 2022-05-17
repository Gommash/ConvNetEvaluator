package imagemanipulator_macros;

public class RandomHorizontalFlip extends ImageMacroPython{
	public RandomHorizontalFlip(String imgPath, String saveToPath,float probability,boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"random-horizontal-flip "+ probability+"\"");
	}
}
