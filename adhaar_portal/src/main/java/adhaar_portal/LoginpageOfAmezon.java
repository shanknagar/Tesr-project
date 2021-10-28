package adhaar_portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageOfAmezon {

	private WebDriver driver1;
	@FindBy(xpath="//span[text()='Sign in']")   
	private WebElement sighin;
	@FindBy(xpath="//input[@id='ap_email']") 
	private WebElement uername;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continu;
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement Entrpassword;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement SignIn;
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement sighout;
	
	public LoginpageOfAmezon(WebDriver driver){
		driver1=driver;
		PageFactory.initElements(driver, this);
	}
	public void verifyloginfunctionality() 
	{
		sighin.click();
		uername.sendKeys("Shankarnagare27@gmail.com");
		continu.click();
		Entrpassword.sendKeys("Shankar@27");
		SignIn.click();
	}
	public void SignoutFromAmezon() throws InterruptedException {
		Actions act =new Actions(driver1);
		act.moveToElement(sighin).perform();
		sighout.click();
		Thread.sleep(2000);
	}
}
