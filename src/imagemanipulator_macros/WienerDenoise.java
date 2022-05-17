package imagemanipulator_macros;

public class WienerDenoise extends ImageMacroPython {
	public WienerDenoise(int balance, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"wiener "+ balance+"\"");
	}
}
