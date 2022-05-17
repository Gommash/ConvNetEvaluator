package imagemanipulator_macros;

public class RollingBall extends ImageMacroPython {
	
	public RollingBall(String imgPath, String saveToPath,float ballSize, boolean invert, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"rolling-ball "+ ballSize+" "+invert+"\"");
	}
}
