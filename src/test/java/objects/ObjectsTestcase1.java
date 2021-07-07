package objects;

import org.openqa.selenium.By;

public class ObjectsTestcase1 {
	
	public By contactUs =  By.xpath("//button/span[contains(text(),'Contact us')]");
	public By entername =  By.id("cf-1");
	public By enteremail =  By.id("cf-2");
	public By enetrmobile =  By.id("cf-3");
	public By entersubject =  By.id("cf-4");
	public By enteryourMessage =  By.id("cf-5");
	public By send =  By.xpath("//form/div[3]/p/input[@type='submit']");
	public By fildsError =  By.xpath("//form[@data-status='invalid']/div[contains(text(),'One or more fields have an error. Please check and try again.')]");
	public By message_Invalid_Email =  By.xpath("//form/p[2]/span/span[contains(text(),'The e-mail address entered is invalid.')]");
	
	
	

}
