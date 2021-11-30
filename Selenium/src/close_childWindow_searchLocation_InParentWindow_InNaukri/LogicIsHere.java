package close_childWindow_searchLocation_InParentWindow_InNaukri;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogicIsHere implements CommonInfo{

	
	public void search() throws InterruptedException {
		
		System.setProperty(key, Value);
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get(url);
		String parentWindow = w.getWindowHandle();
		Set<String> childWindows = w.getWindowHandles();
		
		for(String child: childWindows) {
			
			if(!parentWindow.equalsIgnoreCase(child)) {
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.close();
			}

		}
		
		w.switchTo().window(parentWindow);
		
		w.findElement(By.id(designationId)).sendKeys("QA Engineer");
		w.findElement(By.id(searchBoxId)).sendKeys("pune");
		w.findElement(By.xpath(searchButtonXpath)).click();
		
		
		
	
		
		
		
	}
	
	

}
