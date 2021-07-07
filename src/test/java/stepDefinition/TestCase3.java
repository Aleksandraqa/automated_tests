package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import browserEnv_andCommon.BrowserEnv;
import browserEnv_andCommon.Scroll;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import methods.MethodsTestCase3;



public class TestCase3 extends BrowserEnv {
	
	WebDriver driver = setDriver();
	MethodsTestCase3 openPositions = new MethodsTestCase3(driver);
	Scroll scroll = new Scroll(driver);  
	
	
	@Given("^Navigate to Careers menu \\(from the top\\)$")
	public void navigate_to_Careers_menu_from_the_top() throws Throwable {
		openPositions.ClickCareers();
	   
	}

	@Given("^Click ‘Check our open positions’ button$")
	public void click_Check_our_open_positions_button() throws Throwable {
		openPositions.ClickCheckOpenPositions();
	   
	}

	@Given("^Verify that  ‘Join Us’ page is opened \\(can verify that URL is correct: http://www\\.musala\\.com/careers/join-us/$")
	public void verify_that_Join_Us_page_is_opened_can_verify_that_URL_is_correct_http_www_musala_com_careers_join_us() throws Throwable {
		openPositions.VerifyCorrectURLJoinUs();
	  
	}

	@Then("^From the dropdown ‘Select location’ select ‘Anywhere’$")
	public void from_the_dropdown_Select_location_select_Anywhere() throws Throwable {
		openPositions.AllLocations();
	    
	}

	@Then("^Choose open position by name \\(e\\.g\\. Experienced Automation QA Engineer\\)$")
	public void choose_open_position_by_name_e_g_Experienced_Automation_QA_Engineer() throws Throwable {
		scroll.ScrollDown();
		openPositions.ClickExperiencedQA();
	   
	}

	@Then("^Verify that (\\d+) main sections are shown: General Description, Requirements, Responsibilities, What we offer$")
	public void verify_that_main_sections_are_shown_General_Description_Requirements_Responsibilities_What_we_offer(int arg1) throws Throwable {
		scroll.ScrollDown();
		openPositions.ValidateGeneralDescription();
		openPositions.ValidateRequirements();
		openPositions.ValidateResponsibilities();
		openPositions.ValidateOffer();
	   
	}

	@Then("^Verify that ‘Apply’ button is present at the bottom$")
	public void verify_that_Apply_button_is_present_at_the_bottom() throws Throwable {
		openPositions.VerifyApplyIsPresent();
	   
	}

	@Then("^Click ‘Apply’ button$")
	public void click_Apply_button() throws Throwable {
		openPositions.ClickApply();
	   
	}

	
	@Then("^Prepare a few sets of negative data \\(e\\.g\\. leave required field\\(s\\) empty, enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" e-mail with invalid format etc\\)$")
	public void prepare_a_few_sets_of_negative_data_e_g_leave_required_field_s_empty_enter_e_mail_with_invalid_format_etc(String emailInvalid, String uploadPDF, String name, String mobile) throws Throwable {
		openPositions.EnterInvalidEmail(emailInvalid, uploadPDF, name, mobile);  
		openPositions.SendApply();
		Thread.sleep(1000);
		Assert.assertEquals(openPositions.VerifyErrorMessage(), "One or more fields have an error. Please check and try again.");
		Thread.sleep(2000);
		openPositions.ClickClose();
		Assert.assertEquals(openPositions.Message_Invalid_EmailTest3(), "The e-mail address entered is invalid.");
		System.out.println("The e-mail address entered is invalid.");
		openPositions.ClearFields();
		openPositions.ClickApply();
		Thread.sleep(1000);
		openPositions.EmptyName(mobile, uploadPDF);
		openPositions.SendApply();
		Thread.sleep(1000);
		Assert.assertEquals(openPositions.VerifyErrorMessage(), "One or more fields have an error. Please check and try again.");
		Thread.sleep(2000);
		openPositions.ClickClose();
		Assert.assertEquals(openPositions.Message_empty_Name(), "The field is required.");
		openPositions.ClearFields();
		
	}

	@Then("^Upload a \"([^\"]*)\" CV document, and click ‘Send’ button$")
	public void upload_a_CV_document_and_click_Send_button(String uploadPDF) throws Throwable {
		openPositions.ClickApply();
		Thread.sleep(1000);
		openPositions.UploadPDFMobile(uploadPDF);
		openPositions.SendApply();
	   
	}

	@Then("^Verify shown error messages \\(e\\.g\\. The field is required, The e-mail address entered is invalid etc\\.\\)$")
	public void verify_shown_error_messages_e_g_The_field_is_required_The_e_mail_address_entered_is_invalid_etc() throws Throwable {
		Thread.sleep(1000);
		Assert.assertEquals(openPositions.VerifyErrorMessage(), "One or more fields have an error. Please check and try again.");
		Thread.sleep(2000);
		openPositions.ClickClose();
		Assert.assertEquals(openPositions.Message_empty_Name(), "The field is required.");
		Assert.assertEquals(openPositions.Message_empty_Mobile(), "The field is required.");
		
	    
		
		//Test Successful
			String i = driver.getCurrentUrl();
			System.out.println(i);
			String str = "Test Successful_Navigate toCareers page and ‘Check our open positions_TestCase_3";
			System.out.println(str);
				
			driver.close();
	}


}
