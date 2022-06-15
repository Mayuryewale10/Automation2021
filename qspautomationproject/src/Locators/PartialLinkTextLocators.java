package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class PartialLinkTextLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("_2IX_2- VJZDxU")).click();
		driver.findElement(By.partialLinkText("_2IX_2- _3mctLh VJZDxU")).click();
		driver.findElement(By.partialLinkText("_2KpZ6l _2HKlqd _3AWRsL")).click();
	}

}
