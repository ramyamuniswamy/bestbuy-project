package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.CartPageBB;
import pages.CheckOutPageBB;
import pages.HomePageBB;
import pages.LocationPageBB;
import pages.ProductPageBB;
public class CheckOutAndPayment extends BaseBB {
	@BeforeTest
	public void setup() {
		sheetname = "sheet1";
		testName = "CheckOutAndPayment";
		testAuthor = "Ramya";
		testDescription = "Navigating to the checkout page and filling the form with dummy payment information";
	}
	
	@Test(dataProvider = "readData",priority = 10)
	public void checkOut(String email,String phoneNumber) throws InterruptedException {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();

		HomePageBB hpBB = new HomePageBB(driver);
		hpBB.selectBrand();
		
		ProductPageBB ppBB= new ProductPageBB(driver);
		ppBB.addBrandItem();
		
		CartPageBB cpBB = new CartPageBB(driver);
		cpBB.checkOutPage();
		
		CheckOutPageBB copBB = new CheckOutPageBB(driver);
		copBB.guestDetail(email, phoneNumber);
		takeScreenshot("CheckOutAndPayment");

	
	}
}
