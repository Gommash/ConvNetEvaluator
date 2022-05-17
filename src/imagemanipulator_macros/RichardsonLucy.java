package imagemanipulator_macros;

public class RichardsonLucy extends ImageMacroPython{
	public RichardsonLucy(int nIterations, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"richardson-lucy "+ nIterations+"\"");
	}
}
