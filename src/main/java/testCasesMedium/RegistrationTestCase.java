package testCasesMedium;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectClassesMedium.RegistrationPage;

public class RegistrationTestCase {
	
	WebDriver driver;
	
	@BeforeClass
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void fillRegistrationForm() {
		
		RandomStringUtils random = new RandomStringUtils();
		String email = random.randomAlphanumeric(10);
		String phone = random.randomNumeric(10);
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.clickMyAccount();
		rp.openRegistrationForm();
		rp.enterFirstname("John");
		rp.enterLastname("Travolta");
		rp.enterEmail(email+"@gmail.com");
		rp.enterTelephone(phone);
		rp.enterPassord("password1234");
		rp.confirmPassword("password1234");
		rp.selectPrivacy();
		rp.clickSubmit();
	
		Assert.assertTrue(rp.verifyAccountCreated());
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	

}
