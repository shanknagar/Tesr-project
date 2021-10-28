package BasePackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class NewTest extends Base {
private WebDriver driver;

@BeforeTest
public void beforeTest(String browser){
	 if(driver.equals("Chrome")) {
		 driver=openChromeBrowser();
	 }
	if(driver.equals("firefox")) {
		driver = openFirefoxBrowser();
	}
	if(driver.equals("IE")) {
		driver = openFirefoxBrowser();
	}
	
}
	
}
