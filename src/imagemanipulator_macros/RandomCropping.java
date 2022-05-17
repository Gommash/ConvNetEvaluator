package imagemanipulator_macros;

public class RandomCropping extends ImageMacroPython {
	
	public RandomCropping(int width, int height, boolean addOnTop) {
		this(width,height,0,addOnTop);
	}
	
	public RandomCropping(int width, int height, int padding, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"random-crop "+ width+","+height+" "+padding+"\"");
	}
}
