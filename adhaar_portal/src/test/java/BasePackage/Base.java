package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver openChromeBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	driver1.manage().window().maximize();
	return driver1;
}
	public static WebDriver openFirefoxBrowser(){
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\firefoxdriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.manage().window().maximize();
		return driver2;
	}
}