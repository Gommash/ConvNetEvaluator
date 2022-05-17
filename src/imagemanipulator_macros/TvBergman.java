package imagemanipulator_macros;

public class TvBergman extends ImageMacro{
	public TvBergman(float weight, int nIterations, boolean isotropic, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"tv-bergman "+ weight+" "+nIterations+" "+isotropic+"\"");
	}
}