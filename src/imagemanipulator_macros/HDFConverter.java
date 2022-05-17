package imagemanipulator_macros;

public class HDFConverter extends ImageMacroPython {
	public HDFConverter(String imgPath, String saveToPath) {
		super(imgPath,saveToPath,true);
		arguments.put("-c","\"filetype-converter hdf "+"\"");
	}
}
