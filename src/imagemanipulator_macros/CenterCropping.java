package imagemanipulator_macros;

public class CenterCropping extends ImageMacroPython {
	public CenterCropping(int width, int height, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"center-crop "+ width+","+height+"\"");
	}
}
