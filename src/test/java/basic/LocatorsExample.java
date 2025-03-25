package basic;

import org.openqa.selenium.By;

public class LocatorsExample extends BaseTest{
	
	public void locatorDemo() {
		//id 
//		driver.findElement(By.id("email")).sendKeys("dan@gmail.com");
		
		//name
//		driver.findElement(By.name("email")).sendKeys("from name");
		
		//className
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("from class name");//error
//		driver.findElement(By.className("inputtext")).sendKeys("from class name-1");
//		driver.findElement(By.className("_55r1")).sendKeys("from class name-2");
//		driver.findElement(By.className("_6luy")).sendKeys("from class name-3");
		
		//tagname
//		driver.findElement(By.tagName("button")).click();
		
		//link text
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partial link text (starting with or ending with or contains combination)
//		driver.findElement(By.partialLinkText("Forgotten password?")).click();
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.partialLinkText("For")).click();
//		driver.findElement(By.partialLinkText("ord?")).click();
//		driver.findElement(By.partialLinkText("got")).click();
//		driver.findElement(By.partialLinkText("pass")).click();
//		driver.findElement(By.partialLinkText("F")).click();
//		driver.findElement(By.partialLinkText("?")).click();
//		driver.findElement(By.partialLinkText("gotten pass")).click();
//		driver.findElement(By.partialLinkText("sswo")).click();
//		driver.findElement(By.partialLinkText("word?")).click();
		
		/*
		//xpath
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("from xpath");
		
		//absolute xpath
//		String path = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input";
//		driver.findElement(By.xpath(path)).sendKeys("from abs xpath");
		
		//relative path
//		driver.findElement(By.xpath("//form/div[1]/div[1]/input")).sendKeys("from relative path");
//		driver.findElement(By.xpath("//form//input[@id='email']")).sendKeys("from relative path");
		
		
		//tagname
		$x("//button")		
		driver.findElement(By.xpath("//button")).click();
		
		//attributes ==> not recommended
		$x("//*[@id='email']")
		
		//tagname+attribute
		$x("//input[@id='email']")
		$x("//input[@name='email']")
		$x("//input[@class='inputtext _55r1 _6luy']")
		$x("//input[@type='text']")
		$x("//input[@data-testid='royal-email']")
		$x("//input[@placeholder='Email address or phone number']")
		$x("//input[@aria-label='Email address or phone number']")
		$x("//input[@autofocus='1']")
		
		//functions
		//starts-with
		$x("//input[starts-with(@id,'email')]")
		$x("//input[starts-with(@id,'emai')]")
		$x("//input[starts-with(@id,'ema')]")
		$x("//input[starts-with(@id,'em')]")
		$x("//input[starts-with(@id,'e')]")
		
		//contains
		$x("//input[contains(@id,'email')]")
		$x("//input[contains(@id,'emai')]")
		$x("//input[contains(@id,'ema')]")
		$x("//input[contains(@id,'em')]")
		$x("//input[contains(@id,'e')]")
		
		$x("//input[contains(@id,'mail')]")
		$x("//input[contains(@id,'ail')]")
		$x("//input[contains(@id,'il')]")
		$x("//input[contains(@id,'l')]")
		
		$x("//input[contains(@id,'mai')]")
		$x("//input[contains(@id,'ai')]")
		$x("//input[contains(@id,'ma')]")
		$x("//input[contains(@id,'i')]")
		$x("//input[contains(@id,'m')]")
		
		//text()
		$x("//button[text()='Log in']")
		$x("//h2[text()='Facebook helps you connect and share with the people in your life.']")
		
		//text()+starts-with
		$x("//button[starts-with(text(),'Log in')]")
		$x("//button[starts-with(text(),'Log i')]")
		$x("//button[starts-with(text(),'Log ')]")
		$x("//button[starts-with(text(),'Log')]")
		$x("//button[starts-with(text(),'Lo')]")
		$x("//button[starts-with(text(),'L')]")
		
		//text() + contains
		$x("//button[contains(text(),'Log in')]")
		$x("//button[contains(text(),'Log i')]")
		$x("//button[contains(text(),'Log ')]")
		$x("//button[contains(text(),'Log')]")
		$x("//button[contains(text(),'Lo')]")
		$x("//button[contains(text(),'L')]")
		
		$x("//button[contains(text(),'og in')]")
		$x("//button[contains(text(),'g in')]")
		$x("//button[contains(text(),' in')]")
		$x("//button[contains(text(),'in')]")
		$x("//button[contains(text(),'n')]")
		
		$x("//button[contains(text(),'og i')]")
		$x("//button[contains(text(),'g i')]")
		$x("//button[contains(text(),'og ')]")
		$x("//button[contains(text(),' i')]")
		$x("//button[contains(text(),'og')]")
		$x("//button[contains(text(),'g')]")
		
		//Advanced
		//chained
		$x("//span[@data-name='birthday_wrapper']/span")
		
		//and
		$x("//input[@id='email' and @name='email']")
		
		//or
		$x("//input[@id='email' or @name='email']")
		
		//and + or
		$x("//input[@id='email' and @name='email' or autofocus='1']")
		$x("//input[@id='email' or @name='email' and autofocus='1']")
		
		//index
		$x("//select[3]")//year dropdown
		$x("//select[3]")//month dropdown
		
		//axes
		//child
		$x("//span[@data-name='birthday_wrapper']/child::span")

		//parent
		$x("//select[@id='month']/parent::span")
		
		//following
		$x("//input[@name='firstname']/following::select[@id='month']")
		
		//preceding
		$x("//select[@id='month']/preceding::select")
		$x("//select[@id='month']/preceding::input[@name='firstname']")
		
		//following-sibling
		$x("//select[@id='day']/following-sibling::select[1]")//month
		$x("//select[@id='day']/following-sibling::select[2]")//year
		
		//preceding-sibling
		$x("//select[@id='year']/preceding-sibling::select[1]")//month
		$x("//select[@id='year']/preceding-sibling::select[2]")//day
		
		//decendant
		$x("//body/descendant::select[@id='month']")
		
		//ancestor
		$x("//select[@id='month']/ancestor::body")
		$x("//select[@id='month']/ancestor::form")
		$x("//select[@id='month']/ancestor::html")
		
		$x("//select[@id='month']/ancestor::form//select[2]")
		*/

		//css
//		driver.findElement(By.cssSelector("#email")).sendKeys("from css selector");
		
		
		//css ==> id attribute
//		$$("#email")
//		driver.findElement(By.cssSelector("#email")).sendKeys("from css");
		
		//css ==> class attribute
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("test");
		$$(".inputtext")
		$$("._55r1")
		$$("._6luy")
		
		//css ==> id + class
		$$(".inputtext._55r1")
		$$("._55r1._6luy")
		$$(".inputtext._6luy")
		$$(".inputtext._55r1._6luy")
		$$("#email.inputtext")
		$$("#email._55r1")
		$$("#email._6luy")
		$$(".inputtext#email")
		$$("._55r1#email")
		$$("._6luy#email")
		$$("#email.inputtext._55r1")
		$$("#email.inputtext._6luy")
		$$("#email._55r1._6luy")
		$$(".inputtext#email._55r1")
		$$(".inputtext#email._6luy")
		$$("._55r1#email._6luy")
		$$(".inputtext._55r1#email")
		$$(".inputtext._6luy#email")
		$$("._55r1._6luy#email")		
		$$("#email.inputtext._55r1._6luy")
		$$(".inputtext#email._55r1._6luy")
		$$(".inputtext._55r1#email._6luy")
		$$(".inputtext._55r1._6luy#email")
		$$("._6luy#email.inputtext._55r1")
		$$("._55r1#email.inputtext._6luy")
		$$(".inputtext#email._55r1._6luy")
		$$(".inputtext._55r1#email._6luy")
		$$(".inputtext._6luy#email._55r1")
		$$("._55r1._6luy#email.inputtext")
		$$("._6luy._55r1#email.inputtext")

		
		//css ==> html tagname
		$$("button")
		
		//css ==> html attribute (not recommended)
		$$("[id='email']")
		$$("*[id='email']")
		
		//css ==> html tagname and html attribute
		$$("input[id='email']")
		$$("input[name='email']")
		$$("input[class='inputtext _55r1 _6luy']")
		$$("input[type='text']")
		$$("input[data-testid='royal-email']")
		$$("input[placeholder='Email address or phone number']")
		$$("input[aria-label='Email address or phone number']")
		$$("input[autofocus='1']")
		
		//css (id and class attribute) + html (tagname+attributes)
		$$("input#email")
		$$("input[id='email']#email")
		$$("input[name='email']#email")
		$$("input[class='inputtext _55r1 _6luy']#email")
		$$("input[type='text']#email")
		$$("input[data-testid='royal-email']#email")
		$$("input[placeholder='Email address or phone number']#email")
		$$("input[aria-label='Email address or phone number']#email")
		$$("input[autofocus='1']#email")
		
		$$("input[id='email'].inputtext._55r1._6luy")
		$$("input[id='email'].inputtext")
		$$("input[id='email']._55r1")
		$$("input[id='email']._6luy")
		$$("input[id='email'].inputtext._55r1")
		$$("input[id='email']._55r1._6luy")
		$$("input[id='email'].inputtext._6luy")
		
		$$("input[id='email']#email.inputtext._55r1._6luy")
		$$("input[id='email']#email.inputtext")
		$$("input[id='email']#email._55r1")
		$$("input[id='email']#email._6luy")
		$$("input[id='email']#email.inputtext._55r1")
		$$("input[id='email']#email._55r1._6luy")
		$$("input[id='email']#email.inputtext._6luy")
		$$("input[id='email'].inputtext#email._55r1._6luy")
		$$("input[id='email'].inputtext._55r1#email._6luy")
		$$("input[id='email'].inputtext._55r1._6luy#email")
		$$("input[id='email']._55r1._6luy#email.inputtext")
		$$("input[id='email'].inputtext#email._55r1._6luy")
		$$("input[id='email']._55r1#email.inputtext._6luy")
		$$("input[id='email']#email.inputtext._55r1")
		$$("input[id='email']._6luy#email.inputtext._55r1._6luy")
		
		//css ==> functions with html attributes
		//starts-with ==> ^
		$$("input[id^='email']")
		$$("input[id^='emai']")
		$$("input[id^='ema']")
		$$("input[id^='em']")
		$$("input[id^='e']")
		
		//ends-with ==> $
		$$("input[id$='email']")
		$$("input[id$='mail']")
		$$("input[id$='ail']")
		$$("input[id$='il']")
		$$("input[id$='l']")
		
		//contains ==> *
		$$("input[id*='email']")
		$$("input[id*='emai']")
		$$("input[id*='ema']")
		$$("input[id*='em']")
		$$("input[id*='e']")
		
		$$("input[id*='mail']")
		$$("input[id*='ail']")
		$$("input[id*='il']")
		$$("input[id*='l']")
		
		$$("input[id*='mai']")
		$$("input[id*='ai']")
		$$("input[id*='ma']")
		$$("input[id*='i']")
		$$("input[id*='m']")
		$$("input[id*='email']")
		$$("input[id*='email']")
		
	}

	public static void main(String[] args) {
		LocatorsExample obj = new LocatorsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.locatorDemo();

	}

}
