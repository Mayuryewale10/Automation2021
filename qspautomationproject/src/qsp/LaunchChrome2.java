package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.close();

	}

}
