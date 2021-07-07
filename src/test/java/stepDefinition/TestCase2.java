package stepDefinition;

import org.openqa.selenium.WebDriver;

import browserEnv_andCommon.BrowserEnv;
import browserEnv_andCommon.Scroll;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import methods.MethodsTestCase2;

public class TestCase2 extends BrowserEnv {
	
	WebDriver driver = setDriver();
	MethodsTestCase2 company = new MethodsTestCase2(driver);
	Scroll scroll = new Scroll(driver);
	
	@Given("^Click ‘Company’ tap from the top$")
	public void click_Company_tap_from_the_top() throws Throwable {
		company.ClickCompany();
	  
	}

	@Given("^Verify that the correct URL \\(http://www\\.musala\\.com/company/\\) loads$")
	public void verify_that_the_correct_URL_http_www_musala_com_company_loads() throws Throwable {
		scroll.ScrollDown();
		company.VerifyCorrectURLCompany();
	    
	}

	@Given("^Verify that there is ‘Leadership’ section$")
	public void verify_that_there_is_Leadership_section() throws Throwable {
		company.VerifyLeadership();
		company.VerifyCEO();
		company.VerifyCOO();
		company.VerifyPresident();
	 
	}

	@Then("^Click the Facebook link from the footer$")
	public void click_the_Facebook_link_from_the_footer() throws Throwable {
		company.ClickFacebookLink();
	 
	}

	@Then("^Verify that the correct URL \\(https://www\\.facebook\\.com/MusalaSoft\\?fref=ts\\) loads and verify if the Musala Soft profile picture appears on the new page$")
	public void verify_that_the_correct_URL_https_www_facebook_com_MusalaSoft_fref_ts_loads_and_verify_if_the_Musala_Soft_profile_picture_appears_on_the_new_page() throws Throwable {
		company.VerifyCorrectURLFacebook();
		
		
		for(String handle : driver.getWindowHandles()) {
	              driver.switchTo().window(handle);
	              //Test Successful
		      		String i = driver.getCurrentUrl();
		      		System.out.println(i);
		      		String str = "Test Successful_Navigate to Company page and navigate to Musala facebook page_TestCase_2";
		      		System.out.println(str);
	              driver.close();
	              
	          
	      }
		
		
		
		
	  
	}



}
