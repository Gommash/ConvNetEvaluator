package imagemanipulator_macros;

public class RichardsonLucy extends ImageMacroPython{
	public RichardsonLucy(String imgPath, String saveToPath,int nIterations, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"richardson-lucy "+ nIterations+"\"");
	}
}
