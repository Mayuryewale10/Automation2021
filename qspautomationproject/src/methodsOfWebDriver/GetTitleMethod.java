package methodsOfWebDriver;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opendource-demo.orangehrmlive.com/");
		String titleOfLoginpage = driver.getTitle();
		System.out.println(titleOfLoginpage);
	}

}
