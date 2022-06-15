package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUr1 {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String currentUr1 = driver.getCurrentUrl();
		System.out.println(currentUr1);

	}

}
