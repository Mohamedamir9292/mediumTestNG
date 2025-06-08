package pageObjectClassesMedium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	WebElement myAccount;
	
	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(name="firstname")
	WebElement txt_firstname;
	
	@FindBy(name="lastname")
	WebElement txt_lastname;
	
	@FindBy(name="email")
	WebElement txt_email;
	
	@FindBy(name="telephone")
	WebElement txt_telephone;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(name="confirm")
	WebElement txt_confirm;

	@FindBy(name="agree")
	WebElement rdBtn_privacy;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement btn_submit;
	
	@FindBy(xpath="//h1[text()=\"Your Account Has Been Created!\"]")
	WebElement verify_account;
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	public void openRegistrationForm() {
		register.click();
	}
	
	public void enterFirstname(String fname) {
		txt_firstname.sendKeys(fname);
	}
	
	public void enterLastname(String lname) {
		txt_lastname.sendKeys(lname);
	}
	
	public void enterEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void enterTelephone(String telephone) {
		txt_telephone.sendKeys(telephone);
	}
	
	public void enterPassord(String password) {
		txt_password.sendKeys(password);
	}
	
	public void confirmPassword(String confirmP) {
		txt_confirm.sendKeys(confirmP);
	}
	
	public void selectPrivacy() {
		rdBtn_privacy.click();
	}
	
	public void clickSubmit() {
		btn_submit.click();
	}
	
	public boolean verifyAccountCreated() {
		boolean status = verify_account.isDisplayed();
		return status;
	}
}

