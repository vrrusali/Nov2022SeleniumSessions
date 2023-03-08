package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		boolean flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
		if (flagImg) {
			System.out.println("PASS");
		}

		boolean flagsrch = driver.findElement(By.name("search")).isDisplayed();
		if (flagsrch) {
			System.out.println("PASS");
		}
		driver.findElement(By.name("search")).sendKeys("macbook");
	}


public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
}