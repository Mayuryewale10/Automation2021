package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class FlipcartBuyNowAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='x']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung f12");
		driver.findElement(By.xpath("//input[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12(Sea Green,64 GB)']")).click();
		//switch control to next window
		
		String parentHandle = driver.getWindowHandle();
		Set <String> allHandle = driver.getWindowHandles();
		for(String wh : allHandle)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			else
			{
				
			}
		}
		driver.findElement(By.xpath("//a[.=''128 GB']")).click();
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("431122");
		driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
		driver.findElement(By.xpath("//span[@class='_2p_LDn']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6] _2U9u0A ihZ75K _3AWRsL']")).click();
	}

}
