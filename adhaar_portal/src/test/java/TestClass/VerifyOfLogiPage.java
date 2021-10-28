package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import adhaar_portal.LoginpageOfAmezon;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyOfLogiPage {

	private WebDriver driver;
	private LoginpageOfAmezon loginPageOfAmezon;
		@BeforeClass
		public void OpenChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		@BeforeMethod
		public void LoginFunctionality() {
			loginPageOfAmezon=new LoginpageOfAmezon(driver);
			
		}
		@Test
		public void LoginAmezon() {
			loginPageOfAmezon.verifyloginfunctionality() ;
		}
		@AfterMethod
		public void SignoutFromAmezone() throws InterruptedException {
			loginPageOfAmezon.SignoutFromAmezon();
		}
		@AfterClass 
			public void Afterclass() {
				driver.quit();
			}
		}

