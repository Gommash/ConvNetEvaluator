package imagemanipulator_macros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import configurator.Configurator;
import consolecommunicator.ConsoleCommunicator;

public class DicomConverterJavaMacro implements IMacro {
	protected Map<String,String> arguments;
	protected String scriptPath;
	
	public DicomConverterJavaMacro() {
		arguments = new HashMap<String,String>();
		arguments.put("-s",Configurator.getPropertyValue("imagetoolset.properties","imgpath"));

	}

	@Override
	public void execute() {
		List<String> args = new ArrayList<String>();
		args.add("java");
		args.add(Configurator.getPropertyValue("imagetoolset.properties", "script-path2"));
		for(Map.Entry<String, String> argument : arguments.entrySet()) {
			args.add(argument.getKey());
			args.add(argument.getValue());
		}
		ConsoleCommunicator.invokePythonScript(args.toArray(new String[0]));
	}
}
