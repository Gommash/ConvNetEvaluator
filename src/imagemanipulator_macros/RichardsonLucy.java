package imagemanipulator_macros;

public class RichardsonLucy extends ImageMacro{
	public RichardsonLucy(int nIterations, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"richardson-lucy "+ nIterations+"\"");
	}
}
