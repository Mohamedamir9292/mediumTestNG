package pageObjectClassesMedium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h1[@class=\"heading\"]")
	WebElement homePage;
	
	@FindBy(linkText="A/B Testing")
	WebElement lnk;
	
	public String verifyHomePage() {
		String hpHeader = homePage.getText();
		return hpHeader;
	}
	
	public void navigateToDifferentPage() {
		lnk.click();
	}
}
