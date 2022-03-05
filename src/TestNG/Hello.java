package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hello {
	@BeforeClass
	public void beforeExecutingClass() {
		System.out.println("Before class execution");
	}
@BeforeMethod
public void openBrowser()	{
	System.out.println("Open Browser");
}
	
	@Test(priority = 1)
 public void printHelloSwaroop() {
	 System.out.println("Hello Swaroop");
	 Assert.fail();
 }
	@Test(priority = 2,dependsOnMethods="printHelloSwaroop")
	public void printHelloSimar() {
		 System.out.println("Hello Simar");
	 }
	@Test(priority = 3)
	public void printHelloKamal() {
		 System.out.println("Hello Kamal");
	 }
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}
	@AfterClass
	public void afterExecutingClass() {
		System.out.println("after class execution");
	}
	
 }
