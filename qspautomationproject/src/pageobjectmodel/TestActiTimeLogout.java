package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new  BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(validUsername, validPassword);
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
	}

}
