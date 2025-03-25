package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToolTipExample extends BaseTest{
	
	public void toolTipDemo() {
		WebElement instaLink = driver.findElement(By.partialLinkText("Instagram"));
		String toolTip = instaLink.getDomAttribute("title");
		System.out.println("Tool Tip of insta link - " + toolTip);
	}

	public static void main(String[] args) {
		ToolTipExample obj = new ToolTipExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.toolTipDemo();
	}

}
