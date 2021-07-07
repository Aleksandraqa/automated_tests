package objects;

import org.openqa.selenium.By;

public class ObjectsTestCase2 {
	
	public By clickCompany =  By.xpath("//*[@id=\"menu-main-nav-1\"]/li[1]/a");
	public By verifyLeadership =  By.cssSelector("#content > div.entry-content > section.company-members");
	public By verifyCEO =  By.xpath("//*[@id=\"content\"]//section[3]//a/img[@alt='Delyan Lilov CEO']");
	public By verifyPresident =  By.xpath("//*[@id=\"content\"]/div[2]/section[3]//a/img[@alt='Elena Marinova President']");
	public By verifyCOO =  By.xpath("//*[@id=\"content\"]/div[2]/section[3]//a/img[@alt='Stanislav Ovcharov COO']");
	public By clickFacebookLink =  By.xpath("/html/body/footer//a[4]/span[@class='musala musala-icon-facebook']");
	public By verifyFbProfilePhoto =  By.xpath("//*[@id=\"mount_0_0_t3\"]//div[@aria-label='Page profile photo']");
	
	
	
	
	
	
	

}
