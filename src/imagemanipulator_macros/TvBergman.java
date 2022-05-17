package imagemanipulator_macros;

public class TvBergman extends ImageMacroPython{
	public TvBergman(String imgPath, String saveToPath,float weight, int nIterations, boolean isotropic, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"tv-bergman "+ weight+" "+nIterations+" "+isotropic+"\"");
	}
}
