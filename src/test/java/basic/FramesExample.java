package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesExample extends BaseTest {

	
	public void framesDemo() {
		
		//switch to frame
		//index
//		driver.switchTo().frame(0);
		
		//id or name
//		driver.switchTo().frame("mce_0_ifr");
		
		//webelement
		WebElement elem = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(elem);
		
		
		System.out.println(driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText());
		
		//default content
//		driver.switchTo().defaultContent();
		
		
		System.out.println("base page data = " + driver.findElement(By.tagName("h3")).getText());
		
		//switch to parent frame
//		driver.switchTo().parentFrame();
		
	}
	public static void main(String[] args) {
		FramesExample obj = new FramesExample();
		obj.setupBrowser("chrome", "https://the-internet.herokuapp.com/iframe");
		obj.framesDemo();

	}

	

}
