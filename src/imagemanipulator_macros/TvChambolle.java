package imagemanipulator_macros;

public class TvChambolle extends ImageMacroPython{
	public TvChambolle(float weight, int nIterations, boolean isotropic, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"tv-chambolle "+ weight+" "+nIterations+" "+isotropic+"\"");
	}
}
