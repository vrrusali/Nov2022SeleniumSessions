
package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		//create a webelement + perform action (click, sendkeys, gettext, isDisplayed....)
		
		//create a webelement: need a locator
	//1st	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email")).sendKeys("pvrrusali@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("PassWord");
	
	//2nd-
		//Create the element
			//WebElement emailId= driver.findElement(By.id("input-email"));
			//WebElement passwd=driver.findElement(By.id("input-password"));
		
		//perform the action
			//emailId.sendKeys("pvrrusali@gmail.com");
			//passwd.sendKeys("PassWord");
		
		//emailId and passwd variables can be used multiple times to enter multiple/ different emailId & Passwds
		//e.g.emailId.sendKeys("tom@gmail.com");
		
		//3rd-
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
		
		
		//4th. By locator + Generic method for webElement
		/*
		 * By emailId=By.id("input-email"); 
		 * By passwd=By.id("input-password");
		 * 
		 * getElement(emailId).sendKeys("pvrrusali@gmail.com");
		 * getElement(passwd).sendKeys("PassWord");
		 */
		

		//5th: By locator + Generic method for Web Element and actions
		/*
		 * By emailId=By.id("input-email"); 
		 * By passwd=By.id("input-password");
		 * 
		 * doSendKeys(emailId, "pvrrusali@gmail.com"); 
		 * doSendKeys(passwd, "PassWord");
		 */
		
		//6th:By locator + Generic method for Web Element and actions in a ElementUtil class
		By emailId=By.id("input-email"); 
		By passwd=By.id("input-password");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "pvrrusali@gmail.com");
		eleUtil.doSendKeys(passwd, "PassWord");
		
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String Value) {
		getElement(locator).sendKeys(Value);
		
	}
}
