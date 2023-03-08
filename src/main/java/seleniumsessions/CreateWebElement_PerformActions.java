package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateWebElement_PerformActions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		driver.findElement(By.id("input-firstname")).sendKeys("Vrrusali");
		driver.findElement(By.id("input-lastname")).sendKeys("Patil");
		driver.findElement(By.id("input-email")).sendKeys("pvrrusali@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1111111111");
		driver.findElement(By.id("input-password")).sendKeys("Test1234");
		driver.findElement(By.id("input-confirm")).sendKeys("Test1234");
		
	}

}
