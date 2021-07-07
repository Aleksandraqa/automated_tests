package browserEnv_andCommon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.PropertiesFile;



public class BrowserEnv {
	protected static WebDriver driver; 
	public static String webUrl ;// = "http://www.musala.com/";  
	public static int DRIVER_WAIT_SECONDS = 10;
	public static String browser;
	public static WebDriverWait waitDriver;
	public static String driverPath;
	
		
	protected static  WebDriver setDriver() {  
			
			
			PropertiesFile.readPropertiesFile();
			if (browser.toLowerCase().contains("firefox")) {
				System.setProperty("webdriver.gecko.driver", driverPath);
//				D:\old\Local Disk D\Eclipse_Workspace\MusalaTestCucumber
				 driver=new FirefoxDriver();  
				 driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(DRIVER_WAIT_SECONDS, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.get(webUrl);
			} else if (browser.toLowerCase().contains("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\a.\\SeleniumIEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get(webUrl);
			} else if (browser.toLowerCase().contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", driverPath);
			    driver = new ChromeDriver();
			    driver.manage().deleteAllCookies();
			    driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(DRIVER_WAIT_SECONDS, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			    driver.get(webUrl);
			} else if (browser.toLowerCase().contains("safari")) {
				driver = new SafariDriver();
				driver.get(webUrl);
			} else {
				System.out
						.println("[INFO] YOUR BROWSER IS CURRENTLY NOT SUPPORTED!");
			}
			
			return driver;
		}
}
	
		





