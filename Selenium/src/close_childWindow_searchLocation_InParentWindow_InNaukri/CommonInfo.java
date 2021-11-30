package close_childWindow_searchLocation_InParentWindow_InNaukri;

public interface CommonInfo {
	
	// In this program i close child window and after that in parent window perform action on textboxes and button
	
	String key = "webdriver.chrome.driver";
	String Value = "F:\\VELOCITY CLASSES\\setup\\chromeDriver(95_selenium file)\\chromedriver.exe";
	String url = "https://www.naukri.com/";
	
	String designationId = "qsb-keyword-sugg";
	String searchBoxId = "qsb-location-sugg";
	String searchButtonXpath = "//button[1]"; 
	
	public void search() throws InterruptedException;

}
