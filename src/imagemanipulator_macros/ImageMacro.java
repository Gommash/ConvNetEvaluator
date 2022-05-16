package imagemanipulator_macros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import configurator.Configurator;
import consolecommunicator.ConsoleCommunicator;

public class ImageMacro implements IMacro {
	protected Map<String,String> arguments;
	
	public ImageMacro() {
		this(true);
	}
	
	public ImageMacro(boolean isFirstMacro) {
		arguments = new HashMap<String,String>();
		if(isFirstMacro)
			arguments.put("-i",Configurator.getPropertyValue("imagetoolset.properties","imgpath"));
		else
			arguments.put("-i",Configurator.getPropertyValue("imagetoolset.properties","outputpath"));
		arguments.put("-o",Configurator.getPropertyValue("imagetoolset.properties","outputpath"));
	}

	@Override
	public void execute() {
		List<String> args = new ArrayList<String>();
		args.add(Configurator.getPropertyValue("imagetoolset.properties", "scriptype"));
		args.add(Configurator.getPropertyValue("imagetoolset.properties", "script-path"));
		for(Map.Entry<String, String> argument : arguments.entrySet()) {
			args.add(argument.getKey());
			args.add(argument.getValue());
		}
		ConsoleCommunicator.invokePythonScript(args.toArray(new String[0]));
	}
}
