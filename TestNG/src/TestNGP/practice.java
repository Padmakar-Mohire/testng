package TestNGP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@Test
	public void LogIn() {
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("mohirepadmakar@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("8888712534");
		driver.findElement(By.xpath("//input[@id=\"u_0_b\"]")).click();
		
	}
	
/*@Test
	public void Write() {
		driver.findElement(By.xpath("//*[@id=\"placeholder-7v17h\"]")).sendKeys("hiiii");
		
	}
*/
}
