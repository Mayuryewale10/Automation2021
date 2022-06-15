package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataDrivenFramework.Flib;

public class BaseTest implements IAutoConstant {
		static WebDriver driver;
		public void setUp()throws IOException
		{
			Flib flib = new Flib();
			String url = flib.readPropertyFile(PROP_PATH,"url");
			String bro= flib.readPropertyFile(PROP_PATH,"browser");
			
			if(bro.equalsIgnoreCase("chrome"))
			{
				System.setProperty(CHROME_KEY,CHROME_VALUE);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			}
			
			else if(bro.equalsIgnoreCase("firefox"))
			{
				System.setProperty(GECKO_KEY,GECKO_VALUE);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				
				
			}
			else
			{
				System.out.println("enter the correct choice");
			}
			
		}

		public void tearDown()
		{
			driver.quit();
		}
	}


