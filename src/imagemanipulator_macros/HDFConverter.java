package imagemanipulator_macros;

public class HDFConverter extends ImageMacroPython {
	public HDFConverter() {
		super(true);
		arguments.put("-c","\"filetype-converter hdf "+"\"");
	}
}
