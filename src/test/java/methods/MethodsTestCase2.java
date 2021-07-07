package methods;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;

import objects.ObjectsTestCase2;


public class MethodsTestCase2 extends ObjectsTestCase2{
	
	WebDriver driver;                                                 
	
	   public MethodsTestCase2 (WebDriver driver)
	   {                                                                 
	  	 this.driver=driver; 
	   }  
	   
//	   // ClickCompany button
//	   public void ClickCompany() throws InterruptedException
//	   {
//	   	  driver.findElement(clickCompany).click();
//	   	  System.out.println("CompanyBtn_Clicked");
//	   	  Thread.sleep(10000);
//	   	  
//	   }
	   
	   //ClickCompany button
	   public void ClickCompany()
	   {
	   WebElement ClickCompany = driver.findElement(clickCompany);
	   JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", ClickCompany);
	   System.out.println("CompanyBtn_Clicked");
	   }
	   
	    //assertion URL
	      public String VerifyCorrectURLCompany() throws InterruptedException
	      {
	    	  String actualURL = driver.getCurrentUrl();
				Assert.assertEquals(actualURL, "https://www.musala.com/company/");
				System.out.println("The URL on Company Page is " + actualURL);
				return actualURL;
				
	      }
	      
	      //assertion Title
	      public String VerifyCorrectTitle() throws InterruptedException
	      {
	    	  String actualTitle = driver.getTitle();
				Assert.assertEquals(actualTitle, "Musala Soft | Musala Soft");
				System.out.println("The title  is " + actualTitle);
				return actualTitle;
				
	      }
	      
	      // VerifyLeadership section is present
	      public void VerifyLeadership() throws InterruptedException
		   {
		   	  driver.findElement(verifyLeadership).isDisplayed();
		   	  System.out.println("Leadership Section is visible");
		   	  Thread.sleep(1000);
		   	  
		   }
	      
	      
	      //VerifyCEO section is present
	      public void VerifyCEO() throws InterruptedException
		   {
		   	  driver.findElement(verifyCEO).isDisplayed();
		   	  System.out.println("CEO Section is Displayed");
		   	  Thread.sleep(1000);
		   	  
		   }
	      
	      //VerifyPresident section is present
	      public void VerifyPresident() throws InterruptedException
		   {
		   	  driver.findElement(verifyPresident).isDisplayed();
		   	  System.out.println("President Section is Displayed");
		   	  Thread.sleep(1000);
		   	  
		   }
	      
	      //VerifyCOO section is present
	      public void VerifyCOO() throws InterruptedException
		   {
		   	  driver.findElement(verifyCOO).isDisplayed();
		   	  System.out.println("COO Section is Displayed");
		   	  Thread.sleep(1000);
		   	  
		   }
	      
	      //ClickFacebookLink from footer
	      public void ClickFacebookLink() throws InterruptedException
		   {
		   	  driver.findElement(clickFacebookLink).click();  
		   	  Thread.sleep(3000);
		   	  for(String winHandle:driver.getWindowHandles()){
		   	   driver.switchTo().window(winHandle);
		   	   
		   	}
		  
		   }
	      
	      //assertion FacebookURL
	      public String VerifyCorrectURLFacebook() throws InterruptedException
	      {
	    	  
	    	String actualURLFb = driver.getCurrentUrl();
			Assert.assertEquals(actualURLFb, "https://www.facebook.com/MusalaSoft?fref=ts");
			System.out.println("The URL on Facebook Page is " + actualURLFb);
			return actualURLFb;
				
		      }	



}
 