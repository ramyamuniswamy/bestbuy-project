package test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
public class validate extends BaseBB  {
	@BeforeTest
	public void setup() {
		testName = "validateUrlIsNotBroken";
		testAuthor = "Ramya";
		testDescription = "Given URL Link is broken or not";
	}
	
	@Test(priority = 2)
	public void validateUrl() throws IOException {
		String url = "https://www.bestbuy.com/";
		URL link = new URL(url);
		HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		int responseCode = httpConn.getResponseCode();

		Assert.assertEquals(responseCode, HttpURLConnection.HTTP_OK,
				"The link is broken. Response Code: " + responseCode);
		System.out.println("The link is valid. Response Code: " + responseCode);
		takeScreenshot("validateUrl");
	}
}
