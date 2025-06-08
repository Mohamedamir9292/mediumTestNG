package testCasesMedium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectClassesMedium.HomePage;

public class HomePageTestCase {

	WebDriver driver;
	
	@BeforeClass
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyHPandClickOnLink() {
		HomePage hp =new HomePage(driver);
		String actualText = "Welcome to the-internet";
		Assert.assertEquals(actualText, hp.verifyHomePage());
		
		hp.navigateToDifferentPage();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
