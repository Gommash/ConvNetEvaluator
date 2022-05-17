package imagemanipulator_macros;

public class BilateralDenoise extends ImageMacroPython {
	public BilateralDenoise(String imgPath, String saveToPath,float sigmaColor, boolean sigmaSpatial, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"bilateral "+ sigmaColor+" "+sigmaSpatial+"\"");
	}
}
