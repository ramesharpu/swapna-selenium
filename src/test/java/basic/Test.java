package basic;

public class Test extends BaseTest{

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.setupBrowser("chrome", "https://www.github.com");		
		obj.quitBrowser();
	}

}
