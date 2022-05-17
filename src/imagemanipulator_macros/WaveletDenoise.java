package imagemanipulator_macros;

public class WaveletDenoise extends ImageMacroPython {
	public WaveletDenoise(float sigmaColor, boolean sigmaSpatial, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"wavelet "+ sigmaColor+" "+sigmaSpatial+"\"");
	}
}
