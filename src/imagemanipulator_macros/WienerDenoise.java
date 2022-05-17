package imagemanipulator_macros;

public class WienerDenoise extends ImageMacroPython {
	public WienerDenoise(String imgPath, String saveToPath,int balance, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"wiener "+ balance+"\"");
	}
}
