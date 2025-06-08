package testCasesMedium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectClassesMedium.ShoppingCartMedium;

public class ShoppingCarTestCaseMedium {

WebDriver driver;
	
	@BeforeClass
	public void startApplication() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}
		
	@Test(priority=3)
	public void openCart() {
		ShoppingCartMedium shopping = new ShoppingCartMedium(driver);
		shopping.clickOnDesktops();
		shopping.clickOnMac();
		shopping.clickToAddToCart();
		shopping.openCart();
		
		Assert.assertTrue(shopping.verifyProduct());
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
