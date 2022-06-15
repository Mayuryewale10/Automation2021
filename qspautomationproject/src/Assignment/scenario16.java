package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Gold coin");
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		driver.findElement(By.xpath("//div[@class='filter 1gms']")).click();
		WebElement coin=driver.findElement(By.xpath("//div[@id='grid-view-result']"));
			boolean status=coin.isDisplayed();
			System.out.println(status);

	}

}
