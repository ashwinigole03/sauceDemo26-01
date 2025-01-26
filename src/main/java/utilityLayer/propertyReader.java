package utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertyReader {
	
	public static String getProperty(String keyname) throws Exception {
		
		Properties prop=new Properties();
		
		String path=System.getProperty("user.dir") + "/src/main/java/configurationLayer/config.properties";
		
		FileInputStream file=new FileInputStream(path);
		
		prop.load(file);
		
		return prop.getProperty(keyname);
	}

}
