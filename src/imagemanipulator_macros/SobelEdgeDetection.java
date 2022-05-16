package imagemanipulator_macros;

public class SobelEdgeDetection extends ImageMacro{
	public SobelEdgeDetection(boolean xaxis, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"sobel "+ xaxis+"\"");
	}
}