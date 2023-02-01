package Generic;

import java.io.FileInputStream;
import java.util.Properties;



public class Property {

	/**
	 * This method is used to launch the application
	 * @param Key
	 * @return
	 * @throws Throwable
	 * @author Shobha
	 */
	public String getPropertyKeyValue(String Key) throws Throwable

	{
		FileInputStream fis=new FileInputStream("./Common_Data.properties.txt");
		
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(Key);
		return value;
		
	}

}
