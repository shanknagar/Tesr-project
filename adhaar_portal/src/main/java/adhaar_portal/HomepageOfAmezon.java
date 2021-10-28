package adhaar_portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageOfAmezon {

	private WebDriver driver1;
	@FindBy(xpath="//a[text()='Amazon Pay']")
	private WebElement amezonpay;
	@FindBy(xpath="//a[text()='Gift Cards']")
	private WebElement giftcard;
	@FindBy (xpath="//a[text()='Mobiles']")
	private WebElement mobiles;
	@FindBy(xpath="//a[text()='Buy Again']")
	private WebElement buyagain;
	
	public HomepageOfAmezon(WebDriver driver){
		driver1=driver;
		PageFactory.initElements(driver, this);
		}
	public void VerifyElementsOnHomePage() {
		amezonpay.click();
		giftcard.click();
		mobiles.click();
		buyagain.click();
	}
	
}
