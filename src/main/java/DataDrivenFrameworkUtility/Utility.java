package DataDrivenFrameworkUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public static String fetchProperty(String Key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(Key).toString();
	}

	public static String fetchLocator(String Key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/elements.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(Key).toString();
	}
}
