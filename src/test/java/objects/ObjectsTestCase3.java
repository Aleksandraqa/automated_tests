package objects;

import org.openqa.selenium.By;

public class ObjectsTestCase3 {
	
	
	
	public By clickCareers =  By.xpath("//*[@id=\"menu-main-nav-1\"]/li[5]/a");
	public By clickCheckOpenPositions =  By.xpath("//*[@id=\"content\"]/div//section/div/a/button/span[contains(text(),'Check our open positions')]");
	public By allLocations =  By.xpath("//*[@id=\"get_location\"]");
	public By clickExperiencedQA =  By.xpath("//*[@id=\"content\"]/section/div[2]/article[7]//h2[contains(text(),'Experienced Automation QA Engineer')]");  //xpath("//*[@id=\"content\"]/section/div[2]/article//div[1]/h2[contains(text(),'Experienced Automation QA Engineer')]");
	public By validateGeneralDescription =  By.xpath("*//div[2]//h2[contains(text(),'General description')]"); 
	public By validateRequirements =  By.xpath("*//h2[contains(text(),'Requirements')]");
	public By validateResponsibilities =  By.xpath("*//h2[contains(text(),'Responsibilities')]");
	public By validateOffer =  By.xpath("*//h2[contains(text(),'What we offer')]");
	public By apply =  By.xpath("//*/a/input[@value='Apply']");
	public By nameApply =  By.xpath("//*[@id=\"cf-1\"]");
	public By emailApply =  By.xpath("//*[@id=\"cf-2\"]");
	public By mobileApply =  By.xpath("//*[@id=\"cf-3\"]");
	public By uploadCVApply =  By.xpath("//*[@id=\"uploadtextfield\"]");
	public By LinkednProfileLinkApply =  By.xpath("//*[@id=\"cf-5\"]");
	public By yourMessageApply =  By.xpath("//*[@id=\"cf-6\"]");
	public By sendApply =  By.xpath("*//form/div[4]/p/input[@value='Send']");
	public By verifyErrorMessage =  By.xpath("*//form/div[5]/div/div[@class='wpcf7-response-output']");
	public By clickApply =  By.xpath("*//a/input[@value='Apply']");
	public By clickClose =  By.xpath("*//form/div[5]/div/button[contains(text(),'Close')]");
	public By clickCloseRight =  By.xpath("//*[@id=\"fancybox-close\"]");
	public By message_Invalid_EmailTest3 =  By.xpath("//form/p[3]/span/span[contains(text(),'The e-mail address entered is invalid.')]");
	public By message_empty_Name =  By.xpath("//form/p[2]/span/span[contains(text(),'The field is required.')]");
	public By message_empty_Mobile =  By.xpath("//form/p[4]/span/span[contains(text(),'The field is required.')]");
	
	
	
	
}
