package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleMultipleCheck {
	String baseUrl = "http://www.newtours.demoaut.com";
	WebDriver driver = new FirefoxDriver();
	String expectedTitle = "";
	String actualTitle = "";

	@BeforeTest
	public void openBrowser(){
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void verifyHomepageTitle(){
		expectedTitle = "Welcome: Mercury Tours";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=1)
	public void verifyRegisterTitle(){
		driver.findElement(By.linkText("REGISTER")).click();
		expectedTitle = "Register: Mercury Tours";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=0)
	public void verifySupportTitle(){
		driver.findElement(By.linkText("SUPPORT")).click();
		expectedTitle = "Under Construction: Mercury Tours";
		actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterMethod
	public void goBackToHomePage(){
		driver.navigate().back();
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
