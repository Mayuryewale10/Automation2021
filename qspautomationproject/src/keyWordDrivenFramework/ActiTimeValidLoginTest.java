package keyWordDrivenFramework;

import org.openqa.selenium.By;

import methodsOfWebDriver.driver;

public class ActiTimeValidLoginTest extends BaseTest {

	public static void main(String[] args) {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		String username= flib.readPropertyFile(PROP_PATH,"username");
		String password= flib.readPropertyFile(PROP_PATH,"password");
		
		bt.openBrowser();
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		
		bt.closeBrowser();
	}

}
