package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/owner/Desktop/WCSM7/un.html");
		driver.findElement(By.id("i1")).sendKeys("admin");
		driver.findElement(By.id("i2")).sendKeys("manager");

	}

}
