package basic;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class WindowManagement extends BaseTest {

	public void windowManagementDemo() {
		/*
		//window
		driver.getWindowHandle();
		driver.getWindowHandles();
		driver.switchTo().window("window-id")
		
		//browser
		driver.close();
		driver.quit();
		*/
		
		System.out.println("*****************Before opening the insta page*********************");
		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		System.out.println("page title = " + driver.getCurrentUrl());
	
		driver.findElement(By.partialLinkText("Instagram")).click();
		System.out.println("\n*****************After opening the insta page*********************");
		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		System.out.println("page title = " + driver.getCurrentUrl());
		
		//switching to the insta page
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println("\n*****************After switching to the insta page*********************");
		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		System.out.println("page title = " + driver.getCurrentUrl());

		//closing the insta page
		driver.close();
		System.out.println("\n*****************After closing the insta page*********************");
//		System.out.println("page title = " + driver.getCurrentUrl());
//		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		
		//switching back to facebook page
		driver.switchTo().window(tabs.get(0));
		System.out.println("\n*****************After switching to facebook page*********************");
		System.out.println("page title = " + driver.getCurrentUrl());
		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
		
		//quit the current browser
		driver.quit();
		System.out.println("\n*****************After qutting the current browser instance*********************");
//		System.out.println("page title = " + driver.getCurrentUrl());
//		System.out.println("current window id = " + driver.getWindowHandle());
		System.out.println("total number of windows = " + driver.getWindowHandles());
	}
	
	public static void main(String[] args) {
		WindowManagement obj = new WindowManagement();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.windowManagementDemo();
	}
}
