package imagemanipulator_macros;

public class CannyEdgeDetection extends ImageMacroPython{
	public CannyEdgeDetection(String imgPath, String saveToPath,int thresholdX, int thresholdY, int apertureSize,boolean l2gradient,boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"canny "+ thresholdX+","+thresholdY+" "+apertureSize+" "+l2gradient+"\"");
	}
}
