package methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MethodsTestCase4 {
	
	WebDriver driver;                                                 
	
	   public MethodsTestCase4 (WebDriver driver)
	   {                                                                 
	  	 this.driver=driver; 
	   }  
	   
	   public void FindAllPositionByCitySofia() throws InterruptedException
		{

			//count element 
			int numItems=driver.findElements(By.xpath("//*[@id=\"content\"]/section/div[2]/article/div/a/div/div[1]")).size();  //"//*[@id=\"content\"]/section/div[2]/article/div/a/div/div[1]/p[contains(text(),'Sofia')]"
			

			while(numItems!=0)
			{
			
				String sofia = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a/div/div[1]/p[2]")).getText(); ////*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a/div/div[1]/p[contains(text(),'Sofia')]
				Thread.sleep(1000);
				
					if (sofia.contains("Sofia")) {
						String open_position = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a/div/div[1]/h2")).getText();
						System.out.println("Open Position: " + open_position);
						Thread.sleep(1000);
						String city = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a/div/div[1]/p[2]")).getText(); 
						Thread.sleep(1000);	
						System.out.println("City: " + city);
						String info = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a")).getAttribute("href");
						Thread.sleep(1000);
						System.out.println("Info: " + info);
					}
					numItems--;	
				}
				
			}
	   
	   public void FindAllPositionByCitySkopje() throws InterruptedException
		{

			//count element 
			int numItems=driver.findElements(By.xpath("//*[@id=\"content\"]/section/div[2]/article/div/a/div/div[1]")).size();  //"//*[@id=\"content\"]/section/div[2]/article/div/a/div/div[1]/p[contains(text(),'Sofia')]"
		

			while(numItems!=0)
			{
			
				String sofia = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a/div/div[1]/p[2]")).getText(); ////*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a/div/div[1]/p[contains(text(),'Sofia')]
				Thread.sleep(1000);
				
					if (sofia.contains("Skopje")) {
						String open_position = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a/div/div[1]/h2")).getText();
						System.out.println("Open Position: " + open_position);
						Thread.sleep(1000);
						String city = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a/div/div[1]/p[2]")).getText(); 
						Thread.sleep(1000);	
						System.out.println("City: " + city);
						String info = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/article["+numItems+"]/div/a")).getAttribute("href");
						Thread.sleep(1000);
						System.out.println("Info: " + info);
					}
					numItems--;	
				}
				
			}
}