package pageObjectClassesMedium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartMedium {
	
WebDriver driver;
	
	public ShoppingCartMedium(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText=("Desktops"))
	WebElement desktops;
	
	@FindBy(linkText=("Mac (1)"))
	WebElement mac;
	
	@FindBy(xpath=("//div[@class=\"button-group\"]//span"))
	WebElement addToCart;
	
	@FindBy(xpath="//ul[@class=\"list-inline\"]/li[4]//span")
	WebElement btn_shopping_cart;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table")
	WebElement product;
	
	public void clickOnDesktops() {
		desktops.click();
	}
	
	public void clickOnMac() {
		mac.click();
	}
	
	public void clickToAddToCart() {
		addToCart.click();
	}
	
	public void openCart() {
		btn_shopping_cart.click();
	}
	
	public boolean verifyProduct() {
		boolean cartFull = product.isDisplayed();
		
		return cartFull;
	}

}

