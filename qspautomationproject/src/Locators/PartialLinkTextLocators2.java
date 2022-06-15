package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("")).click();
		driver.findElement(By.partialLinkText("")).click();
		driver.findElement(By.partialLinkText("")).click();
	}

		
	}


