package imagemanipulator_macros;

public class NLMeansDenoise extends ImageMacroPython {
	
	public NLMeansDenoise(int patchSize,int patchDistance, float h,boolean fastMode, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"nl-means-denoise "+ patchSize+" "+patchDistance+" "+h+" "+fastMode+"\"");
	}
}