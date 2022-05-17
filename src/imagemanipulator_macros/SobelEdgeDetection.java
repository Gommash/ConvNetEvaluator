package imagemanipulator_macros;

public class SobelEdgeDetection extends ImageMacroPython{
	public SobelEdgeDetection(String imgPath, String saveToPath,boolean xaxis, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"sobel "+ xaxis+"\"");
	}
}