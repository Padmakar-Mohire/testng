package TestNGP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	
	
	
	@Test(priority=2)
	public void Googletitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3)
	public void GoogleLogo() {
		Boolean b=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	}
	
	@Test(priority=1)
	public void MaillinkTest() {
		boolean b=driver.findElement(By.linkText("mail")).isDisplayed();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
