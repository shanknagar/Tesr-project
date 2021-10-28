package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	private WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void verifyloginFunctionality() {
		username.sendKeys("8856010499");
		password.sendKeys("Pass@123");
		login.click();
	}
	

}
