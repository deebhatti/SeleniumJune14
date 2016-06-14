package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LocalLanguageBrowser {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser(){
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("intl.accept_languages", "nl");
		driver = new FirefoxDriver(profile);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.ns.nl");
	}
	
	@Test
	public void startGmail(){
		String expectedTitle = "Gmail";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	

}
