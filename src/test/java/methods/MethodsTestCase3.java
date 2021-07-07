package methods;

import java.util.UUID;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import objects.ObjectsTestCase3;


public class MethodsTestCase3 extends ObjectsTestCase3 {
	
	WebDriver driver;                                                 
	
	   public MethodsTestCase3 (WebDriver driver)
	   {                                                                 
	  	 this.driver=driver; 
	   }  
	   
	   //MouseOverCareers
	   public void MouseOverCareers()
	     {
	     WebElement MouseOverCareers = driver
					.findElement(clickCareers);
			String strJavaScript = "var element = arguments[0];"
					+ "var mouseEventObj = document.createEvent('MouseEvents');"
					+ "mouseEventObj.initEvent( 'mouseover', true, true );"
					+ "element.dispatchEvent(mouseEventObj);";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(strJavaScript, MouseOverCareers);
			
	     }
	   
	   //ClickCareers
	   public void ClickCareers()
	   {
	   WebElement ClickCareers = driver.findElement(clickCareers);
	   JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", ClickCareers);
	   System.out.println("CareersBtn_Clicked");
	   }
//	   
//	   public void ClickCareers() throws InterruptedException
//	   {
//	   	  driver.findElement(clickCareers).click();
//	   	  System.out.println("CareersBtn_Clicked");
//	   	  Thread.sleep(1000);
//	   	  
//	   }
	   
	   //ClickCheckOpenPositions
	   public void ClickCheckOpenPositions() throws InterruptedException
	   {
	   	  driver.findElement(clickCheckOpenPositions).click();
	   	  System.out.println("CheckOpenPositionsBtn_Clicked");
	   	  Thread.sleep(1000);
	   	  
	   }
	   
	   
	   //assertion URLJoin Us
	   public String VerifyCorrectURLJoinUs() throws InterruptedException
	   {
		   String actualURL = driver.getCurrentUrl();
		   Thread.sleep(1000);
		   Assert.assertEquals(actualURL, "https://www.musala.com/careers/join-us/");
		   System.out.println("The URL on Join Us Page is " + actualURL);
		   return actualURL;
		
}
	   //DropDown element
	   public void AllLocations()  throws InterruptedException
	  	{
	  		WebElement AllLocations = driver.findElement (allLocations);
	  		Select se = new Select (AllLocations);
	  		se.selectByValue("Anywhere");
	  		System.out.println("Anywhere_Selected");
	  		Thread.sleep(1000);

	  	}
	   //SelectSofia from Drop Down
	   public void SelectSofia()  throws InterruptedException
	  	{
	  		WebElement AllLocations = driver.findElement (allLocations);
	  		Select se = new Select (AllLocations);
	  		se.selectByValue("Sofia");
	  		System.out.println("Sofia_Selected");
	  		Thread.sleep(1000);

	  	}
	   
	 //SelectSkopje from Drop Down
	   public void SelectSkopje()  throws InterruptedException
	  	{
	  		WebElement AllLocations = driver.findElement (allLocations);
	  		Select se = new Select (AllLocations);
	  		se.selectByValue("Skopje");
	  		System.out.println("Skopje_Selected");
	  		Thread.sleep(1000);

	  	}
	   
	   //ClickExperiencedQA
	   public void ClickExperiencedQA() throws InterruptedException
	  	{
		   driver.findElement(clickExperiencedQA).click();
		   System.out.println("ExperiencedQA_Clicked");
		   Thread.sleep(1000);

	  	}
	   
	   
	   // ValidateGeneralDescription is visible
	   public void ValidateGeneralDescription() throws InterruptedException
	   {
	   	  driver.findElement(validateGeneralDescription).isDisplayed();
	   	  Thread.sleep(1000);
	   	  System.out.println("GeneralDescription_Displayed");
	   	  Thread.sleep(1000);
	   	  
	   }
	   
	   
	   //ValidateRequirements is visible
	   public void ValidateRequirements() throws InterruptedException
	   {
	   	  driver.findElement(validateRequirements).isDisplayed();
	   	  System.out.println("Requirements_Displayed");
	   	  Thread.sleep(1000);
	   	  
	   }
	   
	   //ValidateResponsibilities is visible
	   public void ValidateResponsibilities() throws InterruptedException
	   {
	   	  driver.findElement(validateResponsibilities).isDisplayed();
	   	  System.out.println("Responsibilities_Displayed");
	   	  Thread.sleep(1000);
	   	  
	   }
	   
	   
	   //ValidateOffer is visible
	   public void ValidateOffer() throws InterruptedException
	   {
	   	  driver.findElement(validateOffer).isDisplayed();
	   	  System.out.println("Offer_Displayed");
	   	  Thread.sleep(1000);  	  
	   }
	   
	   // VerifyApplyIsPresent button is present
	   public void VerifyApplyIsPresent() throws InterruptedException
	   {
	   	  driver.findElement(apply).isDisplayed();
	   	  System.out.println("ApplyBtn_Displayed");
	   	  Thread.sleep(1000);  	  
	   }
	   
	   //ClickApply button
	   public void ClickApply()
	   {
	   WebElement ClickApply = driver.findElement(clickApply);
	   JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", ClickApply);
	   System.out.println("ApplyBtn_Clicked");
	   }

	   
	   //Populate input fields and enter InvalidEmail 
	   public void EnterInvalidEmail(String emailInvalid, String name, String mobile, String uploadPDF) throws InterruptedException
	   {
		  driver.findElement(nameApply).sendKeys(name);
		  Thread.sleep(1000);
		  System.out.println("Name-" + name);
	   	  driver.findElement(emailApply).sendKeys(emailInvalid);
	   	  Thread.sleep(1000);
	   	  System.out.println("emailInvalid-" + emailInvalid);
	   	  driver.findElement(mobileApply).sendKeys(mobile);
		  Thread.sleep(1000);
		  System.out.println("Mobile-" + mobile);
		  driver.findElement(uploadCVApply).sendKeys(uploadPDF);
	   	  Thread.sleep(1000);
	   	  System.out.println("uploadPDF-" + uploadPDF);
	   	  
	   }
	   
	 //assertion - verify error message - email
	   public String  Message_Invalid_EmailTest3() throws InterruptedException
	   {
	   	 driver.findElement(message_Invalid_EmailTest3).isDisplayed();
	   	 Thread.sleep(1000);
	   	 return driver.findElement(message_Invalid_EmailTest3).getText();
	   }
	   
	   
	   // generate random  email
	 	final String randomEmail = randomEmail();

	 	private static String randomEmail() {
	 		return "random-" + UUID.randomUUID().toString() + "@gmail.com";
	     } 
	 	
	 	//Populate input fields and leave Name as an empty 
	   public void EmptyName(String mobile, String uploadPDF) throws InterruptedException
	   {
		  
	   	  driver.findElement(emailApply).sendKeys(randomEmail);
	   	  Thread.sleep(1000);
	   	  System.out.println("ValidEmail-" + randomEmail);
	   	  driver.findElement(mobileApply).sendKeys(mobile);
		  Thread.sleep(1000);
		  System.out.println("Mobile-" + mobile);
		  driver.findElement(uploadCVApply).sendKeys(uploadPDF);
	   	  Thread.sleep(1000);
	   	  System.out.println("uploadPDF-" + uploadPDF);
	   	  
	   }
	   
	   //assertion - verify error message empty Name
	   public String  Message_empty_Name() throws InterruptedException
	   {
	   	 driver.findElement(message_empty_Name).isDisplayed();
	   	 Thread.sleep(1000);
	   	 return driver.findElement(message_empty_Name).getText();
	   }
	   
	   
	   //Populate input fields and UploadPDFMobileEmpty
	   public void UploadPDFMobile(String uploadPDF) throws InterruptedException
	   {	  
			  driver.findElement(emailApply).sendKeys(randomEmail);
		   	  Thread.sleep(1000);
		   	  System.out.println("ValidEmail-" + randomEmail);
			  driver.findElement(uploadCVApply).sendKeys(uploadPDF);
		   	  Thread.sleep(1000);
		   	  System.out.println("uploadPDF-" + uploadPDF);
	   	  
	   }
	  
	   //assertion - verify error message empty Mobile
	   public String  Message_empty_Mobile() throws InterruptedException
	   {
	   	 driver.findElement(message_empty_Mobile).isDisplayed();
	   	 Thread.sleep(1000);
	   	 return driver.findElement(message_empty_Mobile).getText();
	   }
	   //Click Apply button
	   public void SendApply() throws InterruptedException
	   {
	   WebElement SendApply = driver.findElement(sendApply);
	   JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", SendApply);
	   System.out.println("SendBtn_Clicked");
	   }
	   
	 //assertion - Validate error message is displaied
	   public String VerifyErrorMessage()
	   { 
	   	return driver.findElement(verifyErrorMessage).getText();
	   }
	   	
	   // ClickClose error message
	   public void ClickClose() throws InterruptedException
	   {
	   WebElement ClickClose = driver.findElement(clickClose);
	   JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", ClickClose);
	   System.out.println("CloseBtn_Clicked");
	   }

	 
	   //Clear all populated fields
	   public void ClearFields() throws InterruptedException
	   {
		  driver.findElement(nameApply).clear();
		  Thread.sleep(1000);
	   	  driver.findElement(emailApply).clear();
	   	  Thread.sleep(1000);
	   	  driver.findElement(mobileApply).clear();
		  Thread.sleep(1000);
		  driver.findElement(uploadCVApply).clear();
	   	  Thread.sleep(1000);
	   	  
	   }

	   
	

	   	   

}