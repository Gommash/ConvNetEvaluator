package imagemanipulator_macros;

public class DicomConverterPython extends ImageMacroPython {
	public DicomConverterPython(String imgPath, String saveToPath) {
		super(imgPath, saveToPath,false);
		arguments.put("-c","\"filetype-converter dicom "+"\"");
	}
}
