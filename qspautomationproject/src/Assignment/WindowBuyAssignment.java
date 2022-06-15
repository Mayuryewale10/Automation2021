package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBuyAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input [@class='_3704LK']")).sendKeys("Redmi note10");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='REDMI Note 10S (Deep Sea Blue, 64 GB)']")).click();
		
		
		
		
	}

}
