package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	WebDriver driver;
	
	public void setupBrowser(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else {
			System.out.println("valid browser is not provided, hence quitting this automation run");
			System.exit(0);
		}
		
		
		if(url!="")
		 driver.get(url);
		else
			driver.get("about:blank");
	}
	
	public void quitBrowser() {
		driver.quit();
	}


}
