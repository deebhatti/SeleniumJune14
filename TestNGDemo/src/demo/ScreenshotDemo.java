package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	WebDriver driver;
	@BeforeTest
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=nxRgV_v9HYjT8gfV3oHwBw&gws_rd=ssl");
		
	}
	
	@Test
	public void searchGoogle() throws IOException{
		try {
			driver.findElement(By.id("Monday")).sendKeys("EuroCup");
			
		}
		catch(Exception e){
			System.out.println("Control is in Catch");
			getScreenshot();
		}
	}

	private void getScreenshot() throws IOException {
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(ss, new File("C:\\Selenium10\\Screenshot.jpg"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
