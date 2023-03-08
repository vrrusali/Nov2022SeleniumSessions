package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateEle_PerormAction_ByLocator_Genericmthd {

	static WebDriver driver;
	public static void main(String[] args) {
		/*
		 * By emailId=By.id("input-email"); 
		 * By passwd=By.id("input-password");
		 * 
		 * getElement(emailId).sendKeys("pvrrusali@gmail.com");
		 * getElement(passwd).sendKeys("PassWord");
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fname=By.id("input-firstname");
		By lname=By.id("input-lastname");
		By emailId=By.id("input-email");
		By Telphn=By.id("input-telephone");
		By passwd=By.id("input-password");
		By confirmpasswd=By.id("input-confirm");
		
		getElement(fname).sendKeys("Vrrusali");
		getElement(lname).sendKeys("patil");
		getElement(emailId).sendKeys("pvrrusali@gmail.com");
		getElement(Telphn).sendKeys("1111111111");
		getElement(passwd).sendKeys("Test1234");
		getElement(confirmpasswd).sendKeys("Test1234");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String Value) {
		getElement(locator).sendKeys(Value);
		
	}
}
