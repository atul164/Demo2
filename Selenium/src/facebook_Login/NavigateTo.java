package facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo implements CommonData {

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.setProperty(key, value);
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.navigate().to(url);
		w.findElement(By.id("email")).sendKeys("7875403550");
		w.findElement(By.id("pass")).sendKeys("atul4141");
		w.findElement(By.name("login")).click();
		
	}

}
