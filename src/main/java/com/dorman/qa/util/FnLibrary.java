package main.java.com.dorman.qa.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FnLibrary extends main.java.com.dorman.qa.base.TestBase{
	// global variables
	/* protected static ExtentTest1 logger;
	protected ExtentReports report;
	public ExtentReports rep = ExtentManager.getInstance();*/
	
	// Sendkey general method
	public void input(WebElement webElement, String data) {
		webElement.sendKeys(data);
	}
	
	// Clear general method
		public void clear(WebElement webElement) {
			webElement.clear();
		}
	
	// inputDojo general method
	public void inputDojo(WebElement webElement, String data) {
		webElement.sendKeys(data);
		webElement.click();
	}

	// click general method
	public void click(WebElement webElement) {
		webElement.click();
	}

	// Select Dropdown value general method
	public void selectByVisibleText(WebElement webElement, String text) {
		if (text != "") {
			Select dropdown = new Select(webElement);
			dropdown.selectByVisibleText(text);
		}
	}

	// Select Radio button value general method
	public void selectRadioButton(WebElement webElement) {
		webElement.click();
	}

	// Select Checkbox value general method
	public void selectCheckbox(WebElement webElement) {
		boolean checkstatus;
		checkstatus = webElement.isSelected();
		if (checkstatus == false)
			webElement.click();
	}
	
	// Method to Get Data
	public String getData(WebElement webElement) {
		String Value= webElement.getText();
		return Value;
	}

	// Verify Text
	
	
	
	// validating Error Messages
	

	

	
	
	/*public HashMap<String, String> getData(Xls_Reader xls,String sheetName, String colName){
		 int rowNum;
		 int rowCount = xls.getRowCount(sheetName);
		 String colValue = Constants.SequenceId_Col_Value;
		 HashMap<String, String> attrMap = new HashMap<String, String>();
		 
		 for(rowNum=2;rowNum<=rowCount;rowNum++){
			   String attrName = xls.getCellData(sheetName, colName, rowNum);
			   String attrValue = xls.getCellData(sheetName, colValue, rowNum);
		   		attrMap.put(attrName, attrValue);
		   	}
		 return attrMap;
		 }*/
	

	
	
	/*public String localDate(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm/dd/yyyy");
		 LocalDateTime localDate = LocalDateTime.now();
		 String dd=dtf.format(localDate);
		String newdate= dd.toString().replace("/", "").replace(":", "").replace(" ", "");
			return newdate;
					 
	}*/
	public String poeticDate(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM d, yyyy");
		 LocalDateTime localDate = LocalDateTime.now();
		 String newdate=dtf.format(localDate);
		return newdate;
	}
}