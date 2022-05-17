package imagemanipulator_macros;

import configurator.Configurator;

public class DicomConverterJava extends ImageMacroJava {
	public DicomConverterJava() {
		super();
		this.scriptPath=Configurator.getPropertyValue("imagetoolset.properties", "script-path2");
	}
}
