package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) throws Exception {

		String browserName = "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		//by locators: OR
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "Vrrusali");
		eleUtil.doSendKeys(lastName, "Patil");
		eleUtil.doSendKeys(email, "pvrrusali@gmail.com");
		eleUtil.doSendKeys(telephone, "9545915567");
		eleUtil.doSendKeys(password, "Test@123");
		eleUtil.doSendKeys(confirmPassword, "Test@123");
		
		//driver.wait(); 
		//System.out.println("Details entered and closing the browser");
		//driver.quit();
		
	}
	

}
