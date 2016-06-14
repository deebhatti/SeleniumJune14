package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite will always execute prior to all"
				+ "annotations in the suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite will always execute at last afte"
				+ "r all the annotations");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class will always execute prior to "
				+ "@BeforeMethod and @Test");
		
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After Class will always execute later to @After"
				+ "Method and @Test");
	}
	
	@BeforeMethod
	public void beforeMEthod(){
		System.out.println("Before Method will execute before every "
				+ "@Test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method is executed after every @Test");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test will always execute prior to @Before"
				+ "Class, @BeforeMEthod and @Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("AfterTest will always execute later to @After"
				+ "Method, @AfterClass");
	}
	
	@Test
	public void testCase1(){
		System.out.println("Inside first Test case");
	}
	
	@Test
	public void testCase2(){
		System.out.println("Inside second Test case");
	}

}
