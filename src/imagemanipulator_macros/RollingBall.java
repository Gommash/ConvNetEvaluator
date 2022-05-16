package imagemanipulator_macros;

public class RollingBall extends ImageMacro {
	
	public RollingBall(int ballSize,boolean grayscale, boolean invert, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"rolling-ball "+ ballSize+" "+grayscale+" "+invert+"\"");
	}
}
