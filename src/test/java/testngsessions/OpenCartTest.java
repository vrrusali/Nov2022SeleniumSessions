package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/");
	}


	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		Assert.assertEquals(title, "Your Store");
	}

	@Test
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
