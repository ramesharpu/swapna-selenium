package basic;

import org.openqa.selenium.By;

public class ModalExample extends BaseTest{
	
	public void modalDemo() {
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		driver.findElement(By.id("loginFormEmail")).sendKeys("test@gmail.com");
	}

	public static void main(String[] args) {
		ModalExample obj = new ModalExample();
		obj.setupBrowser("chrome", "https://www.edureka.co/");
		obj.modalDemo();

	}

}
