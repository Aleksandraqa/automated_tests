package browserEnv_andCommon;

import org.openqa.selenium.JavascriptExecutor;


import org.openqa.selenium.WebDriver;


public class Scroll { 
	
WebDriver driver; 

 public Scroll(WebDriver driver)
 {
	 this.driver=driver;
 }


 public void ScrollDown() throws InterruptedException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(10000);
	js.executeScript("window.scrollBy(0,1000)");
	}
 
 public void ScrollUp() throws InterruptedException
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(1000,0)");
	}


}




