package imagemanipulator_macros;

public class BilateralDenoise extends ImageMacroPython {
	public BilateralDenoise(float sigmaColor, boolean sigmaSpatial, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"bilateral "+ sigmaColor+" "+sigmaSpatial+"\"");
	}
}
