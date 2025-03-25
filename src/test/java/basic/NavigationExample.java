package basic;

public class NavigationExample extends BaseTest{
	
	public void navDemo() throws InterruptedException {
		
		
		//to
		System.out.println("Navigating to youtube page");
		Thread.sleep(5000);
		driver.navigate().to("https://www.youtube.com");
		
		//back
		System.out.println("Navigating back to google page");
		Thread.sleep(5000);
		driver.navigate().back();
		
		//forward
		System.out.println("Navigating forward to youtube page");
		Thread.sleep(5000);
		driver.navigate().forward();
		
		
		//refresh
		System.out.println("Refreshing youtube page");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
	}

	public static void main(String[] args) {
		NavigationExample obj = new NavigationExample();
		obj.setupBrowser("chrome", "https://www.google.com");
		try {
			obj.navDemo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
