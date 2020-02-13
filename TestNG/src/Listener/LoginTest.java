package Listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void LoginWithEmail(){
		System.out.println("Inside login with email");
		Assert.assertEquals("abc1", "abc");
		
	}
	
	@Test
	public void LoginWithFB() {
		System.out.println("InsLogin with fb");
		Assert.assertEquals("teststring", "teststring");
	}

}
