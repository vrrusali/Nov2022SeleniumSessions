
package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registraion_Xpath {
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By Fname=By.xpath("//*[@id=\"input-firstname\"]");
		By Lname=By.xpath("//*[@id=\"input-lastname\"]");
		By emailId=By.xpath("//*[@id=\"input-email\"]");
		By Tphn=By.xpath("//*[@id=\"input-telephone\"]");
		By Passwd=By.xpath("//*[@id=\"input-password\"]");
		By Cpasswd=By.xpath("//*[@id=\"input-confirm\"]");
		By Rdiobtn= By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]");
		By Chkbx=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By Cntbtn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		doSendKeys(Fname,"Chinu");
		doSendKeys(Lname,"Patil");
		doSendKeys(emailId, "ppchinu@gmail.com");
		doSendKeys(Tphn,"1111111111");
		doSendKeys(Passwd,"Test@123");
		doSendKeys(Cpasswd,"Test@123");
		doClick(Rdiobtn);
		doClick(Chkbx);
		doClick(Cntbtn);
		
		String text= driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
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
