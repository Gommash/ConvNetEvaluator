package imagemanipulator_macros;

public class GaussianBlur extends ImageMacroPython {
	
	public GaussianBlur(int width, int height,boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"gaussian-blur "+ width+","+height+"\"");
	}
}
