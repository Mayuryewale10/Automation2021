package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver.chromedreiver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(4000);
		List<WebElement>suggstions=driver.findElements(By.xpath("//"));
		for(int i=0;i<suggstionssize();i++)
		{
			WebElement suggstion= suggstions.get(i);
			String textOfThewebElement = suggstion.getText();
			System.out.println(textOfThewebElement);
		}
		

	}

	private static int suggstionssize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
