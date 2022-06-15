package methodsOfWebDriver;

import java.sql.Driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodsetsize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Dimension d=new Dimension(250,400);
		Thread.sleep(3000);
	   driver.manage().window().setSize(d);
		
		
		
		
		
	
		
		
				

	}

}
