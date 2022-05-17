package imagemanipulator_macros;

public class HistogramEqualization extends ImageMacroPython {
	
	public HistogramEqualization(String imgPath, String saveToPath,float value, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"histogram-equalization"+"\"");
	}
}