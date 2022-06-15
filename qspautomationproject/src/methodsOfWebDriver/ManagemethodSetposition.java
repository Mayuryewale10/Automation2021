package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagemethodSetposition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//set position of the browser
		Point TargetPosition= new Point(50,250);
		//Thread.sleep(3000);
		driver.manage().window().setPosition(TargetPosition);

	}

}
