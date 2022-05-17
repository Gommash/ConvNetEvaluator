package imagemanipulator_macros;

public class RandomCropping extends ImageMacroPython {
	
	public RandomCropping(String imgPath, String saveToPath,int width, int height, boolean addOnTop) {
		this(imgPath,saveToPath,width,height,0,addOnTop);
	}
	
	public RandomCropping(String imgPath, String saveToPath,int width, int height, int padding, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"random-crop "+ width+","+height+" "+padding+"\"");
	}
}
