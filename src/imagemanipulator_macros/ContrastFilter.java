package imagemanipulator_macros;

public class ContrastFilter extends ImageMacroPython {
	
	public ContrastFilter(String imgPath, String saveToPath,float value, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"contrast "+ value+"\"");
	}
}