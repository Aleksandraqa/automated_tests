package config;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.InputStream;
//import java.io.OutputStream;
import java.util.Properties;

import browserEnv_andCommon.BrowserEnv;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		
		readPropertiesFile();
		//writePropertiesFile();
		
	}
	
	public static void readPropertiesFile() {
		
		
		try {
			InputStream input = new FileInputStream("src\\test\\java\\config\\config.properties"); 
			prop.load(input);
			prop.getProperty("browser");
			BrowserEnv.browser = prop.getProperty("browser");
			System.out.println("Browser-" + BrowserEnv.browser);
			
			prop.getProperty("driverPath");
			BrowserEnv.driverPath = prop.getProperty("driverPath");
			System.out.println(BrowserEnv.driverPath);
			
			prop.getProperty("webUrl");
			BrowserEnv.webUrl = prop.getProperty("webUrl");
			System.out.println("URL-" + BrowserEnv.webUrl);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	
//	public static void writePropertiesFile()  {
//		
//		
//		try {
//			OutputStream output = new FileOutputStream("D:\\old\\Local Disk D\\Eclipse_Workspace\\MusalaTestCucumber\\src\\test\\java\\config\\config.properties");
//			prop.setProperty("browser", "firefox");
//			prop.setProperty("driverPath","D:\\Eclipse_Workspace\\chromedriver.exe");
//			prop.setProperty("webUrl", "http://www.musala.com/");
//			prop.store(output, null);
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//	}
	
}

