package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_WithCombination {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By Fname=By.id("input-firstname");
		By Lname=By.id("input-lastname");
		By EmailId= By.id("input-email");
		By Tphn= By.id("input-telephone");
		By Passwd=By.id("input-password");
		By Cpasswd=By.id("input-confirm");
		By Rdobtn=By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]");
		By Chkbx= By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By Cntbtn= By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
		doSendKeys(Fname, "Radhika");
		doSendKeys(Lname, "Patil");
		doSendKeys(EmailId, "Radha4@gmail.com");
		doSendKeys(Tphn,"1111111111");
		doSendKeys(Passwd, "Test@123");
		doSendKeys(Cpasswd,"Test@123");
		doClick(Rdobtn);
		doClick(Chkbx);
		doClick(Cntbtn);
		
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		
		//Recurring Payment link
		driver.findElement(By.linkText("Recurring payments")).click();
		String Rwrd=driver.findElement(By.linkText("Reward Points")).getText();
		System.out.println(Rwrd);
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
