package test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
public class navigatetobestbuy extends BaseBB {
	

		@BeforeTest
		public void setup() {
			testName = "navigatetobestbuy";
			testAuthor = "Ramya";
			testDescription = "Navigating to the Best Buy e-commerce website";
		}
		
		@Test(priority = 1)
		public void navigate() {
			String expectedTitle = "Best Buy International: Select your Country - Best Buy";
			String actualTtile = driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTtile);
			takeScreenshot("navigatetobestbuy");
			
		}
}
