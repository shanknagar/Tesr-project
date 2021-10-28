package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import adhaar_portal.HomepageOfAmezon;
import adhaar_portal.LoginpageOfAmezon;

public class VeryHomePageOfAmezon {

	private WebDriver driver;
	private LoginpageOfAmezon loginPageOfAmezon;
	private HomepageOfAmezon homepageOfamezon;
	@BeforeClass
	public void OpenChromeBrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void Loginfuntionality() {
		loginPageOfAmezon=new LoginpageOfAmezon(driver);
		loginPageOfAmezon.verifyloginfunctionality();
		
	}
	@Test
	public void VerifyHomepage() {
		homepageOfamezon=new HomepageOfAmezon(driver);
		homepageOfamezon.VerifyElementsOnHomePage();
	}
	@AfterMethod
	public void sighoutfromAmezon() throws InterruptedException {
		loginPageOfAmezon.SignoutFromAmezon();
	}
	@AfterClass
	public void Afterclass() {
		driver.quit();
	}
}
