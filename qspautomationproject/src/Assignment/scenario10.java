package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"denyBtn\"]")).click();
		Thread.sleep(12000);
		driver.switchTo().frame("f28b6a047a076bc");
		driver.findElement(By.xpath("//*[@id=\"widget-global-ix7qjrnago8\"]/div/div/div[2]/div/p")).click();
	}

}
