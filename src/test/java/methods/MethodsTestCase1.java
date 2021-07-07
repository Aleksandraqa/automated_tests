package methods;

import org.openqa.selenium.WebDriver;


import objects.ObjectsTestcase1;

public class MethodsTestCase1 extends ObjectsTestcase1 {
	WebDriver driver;                                                 
	
   public MethodsTestCase1 (WebDriver driver)
   {                                                                 
  	 this.driver=driver; 
   }                                                             

   //ClickContactUs
 public void ClickContactUs() throws InterruptedException
 {
 	  driver.findElement(contactUs).click();
 	  Thread.sleep(1000);
 	  System.out.println("ContactUs_clicked");
 	  
 }
 
 //EnterName
 public void EnterName(String name) throws InterruptedException
 {
 	  driver.findElement(entername).sendKeys(name);
 	  Thread.sleep(1000);
 	  System.out.println("EnteredName-" + name);
 	 
 	  
 }
 
 //EnterEMail
 public void EnterEMail(String email) throws InterruptedException
 {
 	  driver.findElement(enteremail).sendKeys(email);
 	  Thread.sleep(1000);
 	  System.out.println("EnteredEmail-" + email);
 	  
 }

 
 //EnterMobile
 public void EnterMobile(String mobile) throws InterruptedException
 {
 	  driver.findElement(enetrmobile).sendKeys(mobile);
 	  Thread.sleep(1000);
 	  System.out.println("EnteredMobile-" + mobile);
 	  
 }
 
//EnterSubject
 public void EnterSubject(String subject) throws InterruptedException
 {
 	  driver.findElement(entersubject).sendKeys(subject);
 	  Thread.sleep(1000);
 	  System.out.println("EnteredsSubject-" + subject);
 	  
 }
 
 //EnterMesage
 public void EnterMesage(String message) throws InterruptedException
 {
 	  driver.findElement(enteryourMessage).sendKeys(message);
 	  Thread.sleep(1000);
 	  System.out.println("EnteredmMessage-" + message);
 	  
 }
 
 //ClickSend
 public void ClickSend() throws InterruptedException
 {
 	  driver.findElement(send).click();
 	  System.out.println("SendButton_clicked");
 	  Thread.sleep(1500);
 	  
 }
//assertion - verify error message
public String VerifyClickSend()
{
	return driver.findElement(fildsError).getText();
	  
}

//assertion - verify error message - email
public String  Message_Invalid_Email() throws InterruptedException
{
	 driver.findElement(message_Invalid_Email).isDisplayed();
	 Thread.sleep(1000);
	 return driver.findElement(message_Invalid_Email).getText();
	  
	  
	  
	 
}
}


