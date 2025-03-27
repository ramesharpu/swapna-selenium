package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample extends BaseTest{
	
	public void dropDownDemo() {
		Select month = new Select(driver.findElement(By.id("month")));
//		System.out.println("is the month dropdown multiselect - " + month.isMultiple());
		
		//get the first selected value
//		System.out.println("first selected option = " + month.getFirstSelectedOption().getText());
		
		//get all the selected values
//		List<WebElement> allSelectedOptions = month.getAllSelectedOptions();
//		System.out.println(allSelectedOptions.size());
//		for (WebElement elem : allSelectedOptions) {
//			System.out.println(elem.getText());
//		}
		
		//get all the dropdown options
//		List<WebElement> allOptions = month.getOptions();
//		for (WebElement elem : allOptions) {
//			System.out.println(elem.getText());
//		}
		
		//selecting the option
		//by index
//		month.selectByIndex(4);
		
		//by value
//		month.selectByValue("7");
		
		//by visible text
//		month.selectByVisibleText("Aug");
		
		//by contains
		month.selectByContainsVisibleText("e");
		
	}

	public static void main(String[] args) {
		DropDownExample obj = new DropDownExample();
		obj.setupBrowser("chrome", "https://www.facebook.com/reg/");
		obj.dropDownDemo();
	}

}
