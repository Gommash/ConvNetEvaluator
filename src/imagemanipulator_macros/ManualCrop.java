package imagemanipulator_macros;

public class ManualCrop extends ImageMacroPython {
	public ManualCrop(String imgPath, String saveToPath,int width,boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"crop-width "+ width+"\"");
	}
	
	public ManualCrop(String imgPath, String saveToPath,int left,int top,int right, int bottom,boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"crop "+ left+","+top+","+right+","+bottom+"\"");
	}
}
