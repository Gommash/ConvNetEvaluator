package imagemanipulator_macros;

public class RollingBall extends ImageMacro {
	
	public RollingBall(float ballSize, boolean invert, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"rolling-ball "+ ballSize+" "+invert+"\"");
	}
}
