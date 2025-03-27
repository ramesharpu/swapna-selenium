package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample extends BaseTest{
	
	public void amazonExample() {
		setupBrowser("chrome", "https://amzn.in");
		driver.manage().window().maximize();
		
		String path = "//span[contains(text(),'Account & Lists')]/following::button[@class='nav-flyout-button nav-icon nav-arrow']";
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(path))).build().perform();
		driver.findElement(By.partialLinkText("Create a Wish List")).click();
	}

	public void dragDropExample() {
		setupBrowser("chrome", "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(oslo, norway).build().perform();
	}
	
	public void googleExample() {
		setupBrowser("chrome", "https://www.google.co.in/");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("testng");
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("testng").keyUp(Keys.SHIFT).build().perform();
	}
	
	public void dellExample() {
		setupBrowser("chrome", "https://www.dell.com/en-in");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']")))
		.moveToElement(driver.findElement(By.xpath("//button[text()='Business Deals']")))
		.build().perform();
		
		driver.findElement(By.partialLinkText("Business Laptop Deals")).click();
	}
	
	public static void main(String[] args) {
		ActionsExample obj = new ActionsExample();
//		obj.amazonExample();
//		obj.dragDropExample();
//		obj.googleExample();
		obj.dellExample();

	}

}
