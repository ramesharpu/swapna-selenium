package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertExample extends BaseTest{
	
	public void alertDemo() {
		WebElement elem = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		elem.click();
		
		//error
//		elem.click();
		
		//get message
		String msg = driver.switchTo().alert().getText();
		System.out.println("alert msg = " + msg);
		
		//ok or submit or accept
//		driver.switchTo().alert().accept();
		
		//cancel or close button or keyboard esc key
//		driver.switchTo().alert().dismiss();
		
		//typing
		driver.switchTo().alert().sendKeys("test");
		
		
	}

	public static void main(String[] args) {
		JavaScriptAlertExample obj = new JavaScriptAlertExample();
		obj.setupBrowser("firefox", "https://the-internet.herokuapp.com/javascript_alerts");
		obj.alertDemo();

	}

}
