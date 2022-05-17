package imagemanipulator_macros;

public class HistogramEqualization extends ImageMacroPython {
	
	public HistogramEqualization(float value, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"histogram-equalization"+"\"");
	}
}