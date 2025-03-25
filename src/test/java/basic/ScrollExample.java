package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollExample extends BaseTest{
	
	//scroll by pixel values
	public void youtubeExample() {
		setupBrowser("chrome", "https://www.youtube.com/results?search_query=nature");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
	}
	
	//scroll to bottom of the page
	public void githubExample() {
		setupBrowser("chrome", "https://github.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	//scroll into view ==> specific element
	public void githubExample2() {
		String url = "https://github.com";
		setupBrowser("chrome", url);
		driver.manage().window().maximize();
		
		WebElement elem = driver.findElement(By.xpath("//h3[contains(text(),'Your workflows')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		//start from the first webelement (i.e., html) and scroll till desired search webelement
		js.executeScript("arguments[0].scrollIntoView();", elem);
	}

	public static void main(String[] args) {
		ScrollExample obj = new ScrollExample();
//		obj.youtubeExample();
//		obj.githubExample();
		obj.githubExample2();

	}

}
