package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By langLinks = By.xpath("//div[@id='SIvCob']/a");
		By footerLinks= By.xpath("//div[@class='KxwPGc SSwjIe']");
		
		String text="मराठी";
		doLinkClick(langLinks,  text);
		
		FooterLinksList(footerLinks);
		//System.out.println(footerLinks);
//		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//
//		System.out.println(langLinks.size());
//		doLinkClick()
//		for (WebElement e : langLinks) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("मराठी")) {
//				e.click();
//				break;
//			}
//		}

	}
//Assignment-
	//1. m1 - click on a specific lang link
	//2. m2 - return the list of lang links
	//3. m3 - capture the list of google footer links
	public static void doLinkClick(By Locator, String text)
	{
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
	
		for (WebElement e : langLinks) {
			String text1 = e.getText();
			System.out.println(text1);
			if (text1.equals(text)) {
				e.click();
				break;
	}
	
 }
}
	
	public static void FooterLinksList(By locator) {
		List<WebElement> footers = driver.findElements(locator);
				
		for(WebElement e : footers) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(text);

			}
		}
	}
}
