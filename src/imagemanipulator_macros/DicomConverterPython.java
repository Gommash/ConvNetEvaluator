package imagemanipulator_macros;

public class DicomConverterPython extends ImageMacroPython {
	public DicomConverterPython() {
		super(false);
		arguments.put("-c","\"filetype-converter dicom "+"\"");
	}
}
