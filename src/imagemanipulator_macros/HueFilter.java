package imagemanipulator_macros;

public class HueFilter extends ImageMacroPython {
	
	public HueFilter(float value, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"color "+ value+"\"");
	}
}
