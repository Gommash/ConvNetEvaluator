package imagemanipulator_macros;

public class WaveletDenoise extends ImageMacroPython {
	public WaveletDenoise(String imgPath, String saveToPath,float sigmaColor, boolean sigmaSpatial, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"wavelet "+ sigmaColor+" "+sigmaSpatial+"\"");
	}
}
