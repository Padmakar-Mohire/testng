package TestNGP;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {
	
	@BeforeSuite
	public void SetUp(){
		System.out.println("setup system property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("Launch Chrome Browser");
		
	}
	
	
	
	@BeforeTest
	public void Login() {
		System.out.println("Login");
		
	}
	@BeforeMethod
	public void EnterURL() {
		System.out.println("Enter URL");
	}
	
	@Test(priority=2)
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	
	@Test
	public void search() {
		System.out.println("Search");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("googleLogoTest");
	}
	@AfterMethod
	public void Logout() {
		System.out.println("Logout from app");
	}
	
	@AfterTest
	public void DeleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("closeBrowser");
		
	}
	
	@AfterSuite
	public void generateTestReports() {
		System.out.println("Generate Test Reports");
	}
	

}
