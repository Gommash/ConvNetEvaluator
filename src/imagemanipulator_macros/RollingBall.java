package imagemanipulator_macros;

public class RollingBall extends ImageMacroPython {
	
	public RollingBall(float ballSize, boolean invert, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"rolling-ball "+ ballSize+" "+invert+"\"");
	}
}
