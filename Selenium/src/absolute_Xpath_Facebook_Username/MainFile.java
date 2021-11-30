package absolute_Xpath_Facebook_Username;

public class MainFile extends Logic{
	
	public static void main(String[] args) throws InterruptedException {
		
		Logic l = new Logic();
		l.fetch();
		Thread.sleep(4000);
		g.quit();
	}

}
