package imagemanipulator_macros;

public class ContrastFilter extends ImageMacro {
	
	public ContrastFilter(float value, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"contrast "+ value+"\"");
	}
}