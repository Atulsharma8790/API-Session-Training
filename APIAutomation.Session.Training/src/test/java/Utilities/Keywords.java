package Utilities;

import java.io.FileReader;
import java.util.Properties;

public class Keywords {


	public static void setURL(String env, String ver) {


		Properties properties = new Properties();
		String fileName = "application-settings-" + env + ".properties";
		try {
			FileReader reader = new FileReader(fileName);
			properties.load(reader);

			GlobalVars.BASE_URL = properties.getProperty("BASE_URL");
			GlobalVars.LOGIN_URL = properties.getProperty("LOGIN_URL");
			
			System.out.println(GlobalVars.BASE_URL);
			System.out.println(GlobalVars.LOGIN_URL);


		} catch (Exception e1) {
			e1.printStackTrace();
		}


	}
	
}
