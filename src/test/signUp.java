package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.HomePageBB;
import pages.LocationPageBB;
import pages.SignInPageBB;

public class signUp extends BaseBB {
	@BeforeTest
	public void setup() {
		sheetname = "sheet3";
		testName = "SignUp";
		testAuthor = "Ramya";
		testDescription = "Sign-In Functionality";
	}

	@Test(dataProvider = "readData",priority = 4)
	public void signUpData(String email,String password) {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();

		HomePageBB hpBB = new HomePageBB(driver);
		hpBB.goToSgnIn();
		
		SignInPageBB supBB = new SignInPageBB(driver);
		supBB.signInDetail(email, password);
		takeScreenshot("signUp");
	}
}
