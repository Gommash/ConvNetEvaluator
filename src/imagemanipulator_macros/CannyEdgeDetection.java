package imagemanipulator_macros;

public class CannyEdgeDetection extends ImageMacro{
	public CannyEdgeDetection(int thresholdX, int thresholdY, int apertureSize,boolean l2gradient,boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"canny "+ thresholdX+","+thresholdY+" "+apertureSize+" "+l2gradient+"\"");
	}
}
