package stepDefinition;

import org.openqa.selenium.WebDriver;

import browserEnv_andCommon.BrowserEnv;
import browserEnv_andCommon.Scroll;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import methods.MethodsTestCase3;
import methods.MethodsTestCase4;

public class TestCase4  extends BrowserEnv{
	WebDriver driver = setDriver();
	MethodsTestCase3 positionByCity = new MethodsTestCase3(driver);
	MethodsTestCase4 countPositionByCity = new MethodsTestCase4(driver);
	Scroll scroll = new Scroll(driver);  
	
	@Given("^Go to Careers$")
	public void go_to_Careers() throws Throwable {
		positionByCity.ClickCareers();
	       
	}
	
	@Given("^Click ‘Check our open positions’$")
	public void click_Check_our_open_positions_button() throws Throwable {
		positionByCity.ClickCheckOpenPositions();
	   
	}
	
	@Given("^Filter the available positions by available cities in the dropdown ‘Select location’ \\(Sofia\\)$")
	public void filter_the_available_positions_by_available_cities_in_the_dropdown_Select_location_Sofia() throws Throwable {
		positionByCity.SelectSofia();
		scroll.ScrollDown();
	}

	@Given("^Get the open positions by city Sofia$")
	public void get_the_open_positions_by_city_Sofia() throws Throwable {
		countPositionByCity.FindAllPositionByCitySofia();
	}
	
	@Given("^Filter the available positions by available cities in the dropdown ‘Select location’ \\(Skopje\\)$")
	public void filter_the_available_positions_by_available_cities_in_the_dropdown_Select_location_Skopje() throws Throwable {
		positionByCity.SelectSkopje();
		scroll.ScrollDown();
	
	}

	@Then("^Get the open positions by city Skopje$")
	public void get_the_open_positions_by_city_Skopje() throws Throwable {
		countPositionByCity.FindAllPositionByCitySkopje();
	   
		//Test Successful
		String i = driver.getCurrentUrl();
		System.out.println(i);
		String str = "Test Successful_Available positions by City_TestCase_4";
		System.out.println(str);
		
		driver.close();
	   
	}
	
	

}
