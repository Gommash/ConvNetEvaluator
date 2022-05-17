package imagemanipulator_macros;

public class NLMeansDenoise extends ImageMacroPython {
	
	public NLMeansDenoise(String imgPath, String saveToPath,int patchSize,int patchDistance, float h,boolean fastMode, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"nl-means-denoise "+ patchSize+" "+patchDistance+" "+h+" "+fastMode+"\"");
	}
}