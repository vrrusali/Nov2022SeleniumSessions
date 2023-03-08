package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_CSS {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By Fname=By.cssSelector("#input-firstname");
		By Lname=By.cssSelector("#input-lastname");
		By EmailId=By.cssSelector("#input-email");
		By Tphn=By.cssSelector("#input-telephone");
		By Passwd=By.cssSelector("#input-password");
		By Cpasswd=By.cssSelector("#input-confirm");
		By Rdobtn=By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(2)");
		By Chkbx=By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By Cntbtn=By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
		
		doSendKeys(Fname, "Radha");
		doSendKeys(Lname, "Patil");
		doSendKeys(EmailId, "Radha@gmail.com");
		doSendKeys(Tphn,"1111111111");
		doSendKeys(Passwd, "Test@123");
		doSendKeys(Cpasswd,"Test@123");
		doClick(Rdobtn);
		doClick(Chkbx);
		doClick(Cntbtn);
		
		String text=driver.findElement(By.cssSelector("#content > h1")).getText();
		System.out.println(text);
		
		
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

}
