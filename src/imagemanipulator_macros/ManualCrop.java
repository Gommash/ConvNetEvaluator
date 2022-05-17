package imagemanipulator_macros;

public class ManualCrop extends ImageMacro {
	public ManualCrop(int width,boolean addOnTop) {
		super(addOnTop);
		arguments.put("-c","\"crop-width "+ width+"\"");
	}
	
	public ManualCrop(int left,int top,int right, int bottom,boolean addOnTop) {
		super(addOnTop);
		arguments.put("-c","\"crop "+ left+","+top+","+right+","+bottom+"\"");
	}
}
