package basic;

public class BrowserCommandsExample extends BaseTest {
	
	public void demo() {
		//open a url
//		driver.get("https://www.facebook.com");
		
		//title
//		String title = driver.getTitle();
//		System.out.println("page title = " + title);
		
		//get url
//		String url = driver.getCurrentUrl();
//		System.out.println("page url = " + url);
		
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//close the tab
//		driver.close();
		
		//quit the browser instance
//		driver.quit();
		
		//maximize the browser
//		driver.manage().window().maximize();
		
		//full screen
//		driver.manage().window().fullscreen();
		
		//minimize
//		driver.manage().window().minimize();
		
		
		
	}

	public static void main(String[] args) {
		BrowserCommandsExample obj = new BrowserCommandsExample();
		obj.setupBrowser("chrome", "https://www.facebook.com");
		obj.demo();
	}

}
