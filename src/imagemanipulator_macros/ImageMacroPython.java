package imagemanipulator_macros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import configurator.Configurator;
import consolecommunicator.ConsoleCommunicator;

public class ImageMacroPython implements IMacro {
	protected Map<String,String> arguments;
	
	public ImageMacroPython() {
		this("","",true);
	}
	
	public ImageMacroPython(String imgPath, String saveToPath, boolean isFirstMacro) {
		arguments = new HashMap<String,String>();
		if(isFirstMacro)
			arguments.put("-i",imgPath);
		else
			arguments.put("-i",saveToPath);
		arguments.put("-o",saveToPath);
	}

	@Override
	public void execute() {
		List<String> args = new ArrayList<String>();
		args.add("python");
		args.add(Configurator.getPropertyValue("imagetoolset.properties", "script-path"));
		for(Map.Entry<String, String> argument : arguments.entrySet()) {
			args.add(argument.getKey());
			args.add(argument.getValue());
		}
		ConsoleCommunicator.invokePythonScript(args.toArray(new String[0]));
	}
}
