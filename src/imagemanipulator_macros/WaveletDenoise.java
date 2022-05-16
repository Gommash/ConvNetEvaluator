package imagemanipulator_macros;

public class WaveletDenoise extends ImageMacro {
	public WaveletDenoise(float sigmaColor, boolean sigmaSpatial, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"wavelet "+ sigmaColor+" "+sigmaSpatial+"\"");
	}
}
