package imagemanipulator_macros;

public class Resize extends ImageMacroPython {
	public Resize(int width, int height,boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"resize "+ width+","+height+"\"");
	}
}
