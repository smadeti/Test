package main.java.com.dorman.qa.pages;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
/*import com.test.Configfiles.ElementsLocatorFile;*/


public class DormanSearch extends main.java.com.dorman.qa.base.TestBase {

	static test.java.com.dorman.qa.testcases.DormanSearchPageTest DSPT=new test.java.com.dorman.qa.testcases.DormanSearchPageTest();
	
	@FindBy(xpath = "//select[@id='SelectYear']")
	WebElement year;
	
	@FindBy(xpath="//select[@id='makeDropdown']")
	WebElement make;
	
	@FindBy(xpath="//select[@id='modelDropdown']")
	WebElement model;
	
	@FindBy(xpath="//select[@id='parttypeDropdown']")
	WebElement parttype;
	
	@FindBy(xpath = "//input[@id='keyword']")
	WebElement keyword;
	
	@FindBy(xpath = "//input[@id='SubmitButton']")
	public WebElement submitbutton;
	
	@FindBy(xpath = "//span[@class='item-name']")
	public List<WebElement> l1;
	
	@FindBy(xpath = "//div[@id='Dynamic1_heading_parttype']")
	public WebElement NarrowSearch;
	
	@FindBy(xpath = "//a[@target='_top']")
	public WebElement RecentVehicle;
	
	@FindBy(xpath = "//div[@class='searchbar-header']")
	public WebElement header_spanish;
	

	@FindBy(xpath = "//div[@class='recentViewedTitle']/following-sibling::div/child::ul/child::li/child::a")
	public WebElement RecentViewditem;
	
	@FindBy(xpath = "//span[@id='RecentlyViewedProductsLabel_tab']")
	public WebElement RecentViewditemtab;
	
	@FindBy(xpath = "//span[@id='lblProductName']")
	public WebElement Labelproductname;
	
	@FindBy(xpath = "//span[@id='SearchVehiclesLabel']")
	public WebElement Recentvehiclesclick;
	
	
	
	
	
	
	@FindBy(xpath = "(//ul[@id='Dynamic1_filter_parttype']/child::li)[1]")
	public WebElement NarrowSearchclickitem;
	
	@FindBy(xpath = "(//h3[contains(text(),'Filter Your Results')]/following-sibling::div//child::h4[@class='panel-title'])[2]")
	public WebElement FilterYourResults;
	
	@FindBy(xpath = "//input[@type='radio' and @value='Yes']")
	WebElement radiobuttonyes;
	
	@FindBy(xpath = "//div[@id='productFoundFeedbackResult']")
	public WebElement feedback;
	
	@FindBy(xpath = "//input[@name='productFoundFeedback_helpful' and @value='No']")
	public WebElement radiobuttonno;
	
	@FindBy(xpath = "//textarea[@id='productFoundFeedback_feedback']")
	public WebElement feedbackno;
	
	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement feedbacknosubmit;
	
	@FindBy(xpath = "(//div[@class='searchItems-btn'])[1]")
	public WebElement viewdetails;
	
	@FindBy(xpath = "(//th[@scope='row'])[1]")
	public WebElement OEnumber;
	
	@FindBy(xpath = "//input[@placeholder='Interchange # or VMRS Code']")
	public WebElement Interchange;
	
	@FindBy(xpath = "(//span[@class='icon-right-open'])[2]")
	public WebElement Interchangeclick;
	
	@FindBy(xpath = "//th[@scope='row']")
	public List<WebElement> l2;
	
	@FindBy(xpath = "//input[@placeholder='Keyword, Phrase or Part Number']")
	public WebElement keywordtext;
	
	@FindBy(xpath = "//input[@placeholder='Enter Street Address, City, State or Zip Code']")
	public WebElement FindLocation;
	
	@FindBy(xpath = "//iframe[@id='WhereToBuyIFrame']")
	public WebElement findlocationframe;
	
	
	@FindBy(xpath = "(//span[@class='icon-right-open'])[1]")
	public WebElement keywordclick;
	
	@FindBy(xpath = "//select[@id='radiusSelect']")
	public WebElement SelectMiles;
	
	@FindBy(xpath = "//input[@id='searchButton']")
	public WebElement SearchLocation;
	
	@FindBy(xpath = "//div[@style='z-index: 3; position: absolute; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px; left: 0px; top: 0px; touch-action: pan-x pan-y;']")
	public WebElement Map;
	
	@FindBy(xpath = "//span[@id='rptDetails_ctl00_lblProductName']")
	public WebElement productname;
	
	
	@FindBy(xpath = "//div[@id='rptDetails_ctl00_aaiaPartTypeName']")
	public WebElement Parttypename;
	
	@FindBy(xpath = "//h2/following-sibling::h4")
	public List<WebElement> l3;
	

	@FindBy(xpath = "//span[@id='lblSaveSearch']")
	public WebElement savebutton;
	
	@FindBy(xpath = "//iframe[@id='SaveSearchDialogIFrame']")
	public WebElement Nameyoursearchframe;
	
	@FindBy(xpath = "//input[@name='SaveButton']")
	public WebElement SaveButtonFrame;
	
	@FindBy(xpath = "//input[@name='SaveSearchNameTextbox']")
	public WebElement savesearchtext;
	
	@FindBy(xpath = "//select[@id='pagingBottom_perPageSelect']")
	public WebElement recordsdropdown;
	
	@FindBy(xpath = "//a[@id='pagingBottom_nextButton']")
	public WebElement NextButton;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	public WebElement Vinbox;
	
	@FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
	public WebElement VinDDitem;
	

	@FindBy(xpath = "//span[@id='ErrorMsgLabel']")
	public WebElement Erromsg;
	
	@FindBy(xpath = "//div[@id='divMenuRecentActivities']")
	public WebElement RecentActivity;
	
	@FindBy(xpath = "//iframe[@id='recentactivityIFrame']")
	public WebElement RecentActivityframe;
	
	@FindBy(xpath = " //span[@id='SavedSearchesLabel']")
	public WebElement SavedSearch;
	
	@FindBy(xpath = "//a[@id='rptSavedSearches_ctl00_lnkName']")
	public WebElement SavedSearchName;
	
	
	
	@FindBy(xpath = "(//span[@class='icon-cancel pull-right'])[4]")
	public WebElement removesearch;
	
	@FindBy(xpath = "//span[contains(text(),'Product Description') or contains(text(),'Detailed Applications') or contains(text(),'Product Specifications')  or contains(text(),'OE Numbers')  or contains(text(),'Technical Information') or contains(text(),'Where To Buy')]")
	public List<WebElement> summaryitem;
	
	@FindBy(xpath = "//span[contains(text(),'Descripción del producto') or contains(text(),'Aplicaciones detalladas') or contains(text(),'Especificaciones del producto')  or contains(text(),'Número de OE')  or contains(text(),'Información técnica') or contains(text(),'Donde Comprar')]")
	public List<WebElement> summaryitem_spanish;
	
	
	
	@FindBy(xpath = "//span[@id='CheckYourFitLabel']")
	public WebElement CheckYourFitButton;
	
	@FindBy(xpath = "//select[@id='constraintDropdown0']")
	public WebElement Constraintdropdown;
	
	@FindBy(xpath = " //input[@name='SubmitButton']")
	public WebElement Submitbutton;
	
	@FindBy(xpath = " //span[@id='PartFitLabel']")
	public WebElement PartFitLabel;
	
	@FindBy(xpath = "(//label)[5]")
	public WebElement Selectcheckbox;
	
	@FindBy(xpath = "//span[@id='ClearAllLabel']")
	public WebElement ClearSearch;
	
	@FindBy(xpath = "(//div[@class='topbanner-btn'])[1]")
	public WebElement Languageclick;
	
	@FindBy(xpath = "//a[@class='topbanner-btn dorman']")
	public WebElement Spanishclick;
	
	@FindBy(xpath = "(//a[@class='adv-search'])[1]")
	public WebElement advanceSearch;
	
	@FindBy(xpath = "(//a[@title='Wheel Lug Stud'])[1]")
	public WebElement itemselect;
	
	@FindBy(xpath = "(//a[@title='Style: Serrated Stud'])[1]")
	public WebElement stylselect;
	
	@FindBy(xpath = "(//a[@title='SAE or Metric: SAE'])[1]")
	public WebElement Metricselect;
	
	@FindBy(xpath = "//li/child::a[contains(text(),'1/2-20')]")
	public WebElement sizeselect;
	

	@FindBy(xpath = "//p[@id='searchFound']")
	public WebElement itemscount;
	
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	public WebElement Login;
	
	@FindBy(xpath = "//input[@name='txtLoginID']")
	public WebElement Loginid;
	
	@FindBy(xpath = "//input[@name='txtPassword']")
	public WebElement Loginpassword;
	
	@FindBy(xpath = "//input[@id='LoginButton']")
	public WebElement Loginsubmit;
	
	@FindBy(xpath = "//input[@placeholder='Hollander Number']")
	public WebElement Hollandar;
	
	@FindBy(xpath = "(//span[@class='icon-right-open'])[3]")
	public WebElement Hollandarclick;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-remove']")
	public WebElement SavedSearchRemove;

	@FindBy(xpath = "(//div[@class='alert alert-danger alert-dismissible'])[1]")
	public WebElement AlertDismissMessage;
	
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-pencil']")
	public WebElement SavedSearchRename;
	
	@FindBy(xpath = "(//iframe[@id='SaveSearchDialogIFrame'])[1]")
	public WebElement SavedSearchRenameframe;
	
	@FindBy(xpath = "(//input[@name='SaveSearchNameTextbox'])[1]")
	public WebElement SavedSearchRenameframetextbox;
	
	
	@FindBy(xpath = "//input[@value='Save']")
	public WebElement SavedSearchRenameframetextboxSave;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	public WebElement Totalcart;
	
	@FindBy(xpath = "//button[contains(text(),'Log out')]")
	public WebElement Logout;
	
	@FindBy(xpath = ElementsLocatorFile.USER_LOGIN_NAME_XPATH) 
	public WebElement txtUserName;

	@FindBy(xpath = ElementsLocatorFile.USER_PASSWORD_NAME_XPATH)
	public WebElement txtPassword;

	@FindBy(xpath = ElementsLocatorFile.USER_LOGIN_BUTTON_LINK_TEXT)
	public WebElement btnLogin;
	
	@FindBy(xpath = ElementsLocatorFile.COMPANY_NAME_XPATH)
	public WebElement cmpanyName;
	
	// Initializing the Page Objects:
	public DormanSearch() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public static void dropdownselection(WebElement element,String years) {
		Select s1 = new Select(element);
		s1.selectByVisibleText(years);
	}
	
	public void SearchYMMPT() throws InterruptedException {
	
		DormanSearch.dropdownselection(year, "2018");
		Thread.sleep(5000);
		DormanSearch.dropdownselection(make, "Cadillac");
		Thread.sleep(5000);
		DormanSearch.dropdownselection(model, "CT6");
		Thread.sleep(10000);
		DormanSearch.dropdownselection(parttype, "Oil Drain Plug Gasket");
		
		Thread.sleep(5000);
		
		submitbutton.click();
		radiobuttonyes.click();
		
	}
	
	public void SearchSpanishYMMPT() throws InterruptedException {
		
		DormanSearch.dropdownselection(year, "2018");
		Thread.sleep(5000);
		DormanSearch.dropdownselection(make, "Cadillac");
		Thread.sleep(5000);
		DormanSearch.dropdownselection(model, "CT6");
		Thread.sleep(10000);
	
		DormanSearch.dropdownselection(parttype, "Tornillo banjo de la manguera de freno");
		Thread.sleep(5000);
		
		//submitbutton.click();
		//radiobuttonyes.click();
		
	}
	
	
	public void SearchYMMKW() throws InterruptedException {
		DormanSearch.dropdownselection(year, "2019");
		Thread.sleep(5000);
		
		DormanSearch.dropdownselection(make, "BMW");
		Thread.sleep(5000);
		DormanSearch.dropdownselection(model, "X3");
		Thread.sleep(5000);
		keyword.sendKeys("Wheel Lug Bolts");
		Thread.sleep(5000);
		submitbutton.click();
		radiobuttonno.click();
		
	}
	public static void dropdownselection1(WebElement element,int index) {
		Select s1 = new Select(element);

		s1.selectByIndex(index);
	}
	
	public static List<WebElement> findAllLinks(WebDriver driver)
	 
	  { 
		  List<WebElement>  elementList = driver.findElements(By.xpath("//img[contains(@src,'icon')]"));	
	
		  List<WebElement> finalList = new ArrayList();	 
		  for (WebElement element : elementList)	 
		  {	 
			  if(element.getAttribute("src") != null && (!element.getAttribute("src").contains("javascript")))
	 			  {
				  	finalList.add(element);
	 			  }	  
	 	  }		 
		  return finalList;
	 
	  }
		
	public static String isLinkBroken(URL url) throws Exception

	{	
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		try
		{
		    connection.connect();
		    
		    

		  
		    String response = connection.getResponseMessage(); 
		    System.out.println(response);
		   

		    connection.disconnect();
		    return response;
		}
		catch(Exception exp)
		{
			return exp.getMessage();

		}				

	}
	/*public static void VerifyBrokenLinks() throws MalformedURLException, Exception
	{
		List<WebElement> totalLinks=findAllLinks(driver);

	
	    System.out.println("Total number of Links found " + totalLinks.size());
	    for (WebElement link : totalLinks) {
	        try {
	        	DSPT._test_logger.log(LogStatus.PASS, "URL: " + link.getAttribute("src")+ " returned " + isLinkBroken(new URL(link.getAttribute("src")))); 
				//System.out.println("URL: " + link.getAttribute("src")+ " returned " + isLinkBroken(new URL(link.getAttribute("src"))));
				

			} catch (Exception e) {
				
			  	DSPT._test_logger.log(LogStatus.FAIL,"At " + link.getAttribute("innerHTML") + " Exception occured -&gt; " + e.getMessage()); 
	    		//System.out.println("At " + link.getAttribute("innerHTML") + " Exception occured -&gt; " + e.getMessage());	
				
			}

		}
	    
		DSPT._extent_report.endTest(DSPT._test_logger); 
	}

	*/
	

}
