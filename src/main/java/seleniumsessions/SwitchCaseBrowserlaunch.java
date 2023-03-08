package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SwitchCaseBrowserlaunch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String browser = "chrome";
		WebDriver driver = null;
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("chrome is launched");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			System.out.println("ff is launched");
			break;
		case "safari":
			driver = new SafariDriver();
			System.out.println("safari is launched");
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("edge is launched");
			break;
		default:
			System.out.println("plz pass the right browser...." + browser);
			System.out.println("invalid browser....plz pass the right browser");
			break;			
		}
		
		//2. enter url:
		driver.get("https://amazon.in");
		
		//3. get the title:
		String actTitle = driver.getTitle();
		System.out.println("page title : " + actTitle);
		
		//validation point/checkpoint:
		if(actTitle.contains("Amazon")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		driver.wait(1000);
		driver.close();
		//browser.wait(1000);
		//browser.quit();
	}

}
