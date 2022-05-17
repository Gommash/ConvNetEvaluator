package imagemanipulator_macros;

public class HueFilter extends ImageMacroPython {
	
	public HueFilter(String imgPath, String saveToPath,float value, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"color "+ value+"\"");
	}
}
