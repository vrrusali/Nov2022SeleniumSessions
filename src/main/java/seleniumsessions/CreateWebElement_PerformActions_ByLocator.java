package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateWebElement_PerformActions_ByLocator {

	public static void main(String[] args) {
		//By Locator
				/*
				 * By emailId=By.id("input-email"); 
				 * By passwd=By.id("input-password");
				 * 
				 * WebElement eId= driver.findElement(emailId); 
				 * WebElement pwd=driver.findElement(passwd);
				 * 
				 * eId.sendKeys("pvrrusali@gmail.com"); 
				 * pwd.sendKeys("PassWd");
				 */
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fname=By.id("input-firstname");
		By lname=By.id("input-lastname");
		By emailId=By.id("input-email");
		By Telphn=By.id("input-telephone");
		By passwd=By.id("input-password");
		By confirmpasswd=By.id("input-confirm");
		
		WebElement FN=driver.findElement(fname);
		WebElement LN=driver.findElement(lname);
		WebElement eID=driver.findElement(emailId);
		WebElement Tphn=driver.findElement(Telphn);
		WebElement pswd=driver.findElement(passwd);
		WebElement cpasswd=driver.findElement(confirmpasswd);
		
		FN.sendKeys("Vrrusali");
		LN.sendKeys("Patil");
		eID.sendKeys("pvrrusali@gmail.com");
		Tphn.sendKeys("1111111111");
		pswd.sendKeys("Test1234");
		cpasswd.sendKeys("Test1234");
		
		
	}

}
