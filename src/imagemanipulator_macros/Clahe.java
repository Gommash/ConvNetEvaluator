package imagemanipulator_macros;

public class Clahe extends ImageMacroPython {
	
	public Clahe(String imgPath, String saveToPath,int tilegridwidth, int tilegridheight,int cliplimit, boolean addOnTop) {
		this(imgPath,saveToPath,tilegridwidth,tilegridheight,cliplimit,0,addOnTop);
	}
	
	public Clahe(String imgPath, String saveToPath,int tilegridwidth, int tilegridheight,int cliplimit,int factor, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"clahe "+cliplimit+" "+ tilegridwidth+","+tilegridheight+" "+factor+"\"");
	}
}
