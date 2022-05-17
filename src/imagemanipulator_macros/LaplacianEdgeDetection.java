package imagemanipulator_macros;

public class LaplacianEdgeDetection extends ImageMacroPython {
	public LaplacianEdgeDetection(String imgPath, String saveToPath,int kSize, int delta, int scale, boolean addOnTop) {
		super(imgPath,saveToPath,!addOnTop);
		arguments.put("-c","\"laplacian "+ kSize+" "+delta+" "+scale+"\"");
	}
}
