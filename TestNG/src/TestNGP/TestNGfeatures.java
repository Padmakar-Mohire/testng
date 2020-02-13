package TestNGP;

import org.testng.annotations.Test;

public class TestNGfeatures {

	@Test
	public void LoginTest() {
		System.out.println("Logintest");
		//int i=9/0;

	}
	
	@Test(dependsOnMethods="LoginTest")
	public void HomePageTest() {
		System.out.println("HomePageTest");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void SearchPageTest() {
		System.out.println("SearchPageTest");
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void RegPageTest() {
		System.out.println("RegPageTest");
	}
	
	
}
