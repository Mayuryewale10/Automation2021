package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocators1 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("113859_R8ze")).click();
			driver.findElement(By.partialLinkText("aria-label")).click();
			driver.findElement(By.partialLinkText("u_0_b_KT")).click();
		}

	}


