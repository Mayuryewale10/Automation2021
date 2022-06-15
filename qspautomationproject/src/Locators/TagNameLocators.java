package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocators {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/owner/Desktop/WCSM7/Testbox.html");
		driver.findElement(By.tagName("input")).sendKeys("mayur");
		
	}

}
