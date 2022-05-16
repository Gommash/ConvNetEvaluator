package configurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class Configurator {
	private static final String DIR = "config/";

	public static void setProperty(String filename,Map<String, String> properties) {
		properties.forEach((key, value) -> setProperty(filename,key, value));
	}

	public static void setProperty(String filename,String key, String value) {
		try {
			File f = new File(DIR + filename);
			if (!f.exists()) {
				new File(DIR).mkdirs();
				f.createNewFile();
			}
			FileInputStream propsInput = new FileInputStream(f.getPath());
			FileOutputStream propsoutput = new FileOutputStream(f.getPath());
			Properties props = new Properties();
			props.load(propsInput);

			if (props.getProperty(key) == null) {
				props.setProperty(key, value);
				props.save(propsoutput, f.getPath());
				propsoutput.close();
			}
			propsInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getPropertyValue(String filename,String key) {
		try {
			File f = new File(DIR + filename);
			FileInputStream propsInput = new FileInputStream(f.getPath());
			Properties props = new Properties();
			props.load(propsInput);
			return props.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
