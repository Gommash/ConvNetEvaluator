package imagemanipulator_macros;

public class LaplacianEdgeDetection extends ImageMacro {
	public LaplacianEdgeDetection(int kSize, int delta, int scale, boolean addOnTop) {
		super(!addOnTop);
		arguments.put("-c","\"laplacian "+ kSize+" "+delta+" "+scale+"\"");
	}
}
