package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import browserEnv_andCommon.BrowserEnv;
import browserEnv_andCommon.Scroll;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.MethodsTestCase1;


public class TestCase1 extends BrowserEnv {
	
	WebDriver driver = setDriver();
	MethodsTestCase1 contactUs = new MethodsTestCase1(driver);
	Scroll scroll = new Scroll(driver);
	
	@Given("^Scroll down and go to ‘Contact Us’$")
	public void scroll_down_and_go_to_Contact_Us() throws Throwable {
		scroll.ScrollDown();
		contactUs.ClickContactUs();
	}

	
	@When("^Fill all required fields \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" except email$")
	public void fill_all_required_fields_except_email(String name, String mobile, String subject, String message) throws Throwable {
		contactUs.EnterName(name);
		contactUs.EnterMobile(mobile);
		contactUs.EnterSubject(subject);
		contactUs.EnterMesage(message);
		
	}

	@When("^Under email field enter string with wrong email format \"([^\"]*)\"$")
	public void under_email_field_enter_string_with_wrong_email_format(String email) throws Throwable {
		contactUs.EnterEMail(email);
	}
	
	@When("^Click Send button$")
	public void click_Send_button() throws Throwable {
		contactUs.ClickSend();
	}

	@Then("^Verify that error message ‘The e-mail address entered is invalid\\.’ appears$")
	public void verify_that_error_message_The_e_mail_address_entered_is_invalid_appears() throws Throwable {
		contactUs.Message_Invalid_Email();
		 Assert.assertEquals(contactUs.Message_Invalid_Email(), "The e-mail address entered is invalid.");
		 System.out.println("The e-mail address entered is invalid.");
		 Assert.assertEquals(contactUs.VerifyClickSend(), "One or more fields have an error. Please check and try again.");
		 System.out.println("One or more fields have an error. Please check and try again.");
		
		//Test Successful
		String i = driver.getCurrentUrl();
		System.out.println(i);
		String str = "Test Successful_Navigate to Contact Us and populate the fields_TestCase_1";
		System.out.println(str);
		
		driver.close(); 
	}
	


}


