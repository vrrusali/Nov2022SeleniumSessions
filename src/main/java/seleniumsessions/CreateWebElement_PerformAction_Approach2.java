package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateWebElement_PerformAction_Approach2 {

	public static void main(String[] args) {
		//2nd-
				//Create the element
					//WebElement emailId= driver.findElement(By.id("input-email"));
					//WebElement passwd=driver.findElement(By.id("input-password"));
				
				//perform the action
					//emailId.sendKeys("pvrrusali@gmail.com");
					//passwd.sendKeys("PassWord");
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement fname=driver.findElement(By.id("input-firstname"));
		WebElement lname=driver.findElement(By.id("input-lastname"));
		WebElement emailId=driver.findElement(By.id("input-email"));
		WebElement Telphn=driver.findElement(By.id("input-telephone"));
		WebElement passwd=driver.findElement(By.id("input-password"));
		WebElement ConfirmPasswd=driver.findElement(By.id("input-confirm"));
		
		fname.sendKeys("Vrrusali");
		lname.sendKeys("Patil");
		emailId.sendKeys("pvrrusali@gmail.com");
		Telphn.sendKeys("1111111111");
		passwd.sendKeys("Test1234");
		ConfirmPasswd.sendKeys("Test1234");
		
		
		
	}

}
