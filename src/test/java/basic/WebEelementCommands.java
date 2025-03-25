package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebEelementCommands extends BaseTest{
	
	public void webElemDemo() {
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement welMsg = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		WebElement loginBtn = driver.findElement(By.tagName("button"));
		WebElement hiddenElem = driver.findElement(By.name("jazoest"));
		
		
		//fecthing
//		String placeholder = email.getDomAttribute("placeholder");
//		System.out.println("email placeholder = " + placeholder);
		
		//tagname
//		System.out.println(email.getTagName());
		
		//get text
//		System.out.println(welMsg.getText());
		
		//get location
//		System.out.println("Point = " + loginBtn.getLocation());
//		System.out.println("Point (x)= " + loginBtn.getLocation().x);
//		System.out.println("Point (y)= " + loginBtn.getLocation().y);
		
		//get size
//		System.out.println("Dimension = " + loginBtn.getSize());
//		System.out.println("Dimension (width)= " + loginBtn.getSize().width);
//		System.out.println("Dimension (height)= " + loginBtn.getSize().height);
		
		//get css values
//		System.out.println("login button font size = " + loginBtn.getCssValue("font-size"));
		
		//status
		//displayed
//		System.out.println("is email element displayed - " + email.isDisplayed());
//		System.out.println("is the hidden element displayed - " + hiddenElem.isDisplayed());
		
		//is enabled
//		System.out.println(email.isEnabled());
		
//		driver.findElement(By.partialLinkText("Sign Up")).click();
//		WebElement maleRadioBtn = driver.findElement(By.xpath(("//input[@value='2']")));
//		System.out.println("before clicking is the male radio button selected - " + maleRadioBtn.isSelected());
//		
//		maleRadioBtn.click();
//		System.out.println("after clicking is the male radio button selected - " + maleRadioBtn.isSelected());
		
		//Actions
		//type
//		email.sendKeys("ramesh@gmail.com");
		
		//clear
//		email.clear();
//		email.sendKeys("john@gmail.com");
		
		//click
		loginBtn.click();
		
		
	}

	public static void main(String[] args) {
		WebEelementCommands obj = new WebEelementCommands();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.webElemDemo();
	}

}
