package absolute_Xpath_Facebook_Username;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logic implements CommonProperties{

	static WebDriver g;
	public void fetch() {
		
		System.setProperty(Key, value);
		 g= new ChromeDriver();
		g.manage().window().maximize();
		g.navigate().to(url);
		g.findElement(By.xpath(path)).sendKeys("Velocity_Chinchwad");
		
		
		
		
	}
	

}
