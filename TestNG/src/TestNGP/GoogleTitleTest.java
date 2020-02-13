package TestNGP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\Chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
	}
	
	@Test
	public void GoogleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","title is matched");
	}
	
	@Test
	public void GoogleLogoTest() {
		boolean b=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	Assert.assertFalse(b);
	}
	
	@Test
	public void MailLink() {
		boolean b=driver.findElement(By.linkText("mail")).isDisplayed();
		Assert.assertTrue(b);
				
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
