package imagemanipulator_macros;

public class TvChambolle extends ImageMacroPython{
	public TvChambolle(String imgPath, String saveToPath,float weight, int nIterations, boolean isotropic, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"tv-chambolle "+ weight+" "+nIterations+" "+isotropic+"\"");
	}
}
