package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass123 {
	private WebDriver driver;
	private loginPage LogInpage;
		@BeforeClass
		public void OpenChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
	public void loginfunct() {
		LogInpage=new loginPage(driver);
		}
	@Test
	public void loginfacebook(){
		LogInpage.verifyloginFunctionality();
		
	}

}
