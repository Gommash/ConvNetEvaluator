package imagemanipulator_macros;

public class Clahe extends ImageMacro {
	
	public Clahe(int tilegridwidth, int tilegridheight,int cliplimit, boolean addOnTop) {
		this(tilegridwidth,tilegridheight,cliplimit,0,addOnTop);
	}
	
	public Clahe(int tilegridwidth, int tilegridheight,int cliplimit,int factor, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"clahe "+cliplimit+" "+ tilegridwidth+","+tilegridheight+" "+factor+"\"");
	}
}
