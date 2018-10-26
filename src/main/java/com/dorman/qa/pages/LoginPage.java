package main.java.com.dorman.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends main.java.com.dorman.qa.base.TestBase{
	
	main.java.com.dorman.qa.util.FnLibrary fnLibrary = new main.java.com.dorman.qa.util.FnLibrary();	
	
	@FindBy(xpath = ElementsLocatorFile.USER_LOGIN_NAME_XPATH) 
	public WebElement txtUserName;

	@FindBy(xpath = ElementsLocatorFile.USER_PASSWORD_NAME_XPATH)
	public WebElement txtPassword;

	@FindBy(xpath = ElementsLocatorFile.USER_LOGIN_BUTTON_LINK_TEXT)
	public WebElement btnLogin;
	
	@FindBy(xpath = ElementsLocatorFile.COMPANY_NAME_XPATH)
	public WebElement cmpanyName;


	// Method to Validate Username,Password Error Messages and Login to the Site.
	/*public void validateLogin() {
		try {
			Wait();
			fnLibrary.click(btnLogin);
			Wait();
			fnLibrary.input(txtUserName,"sivashambo007@gmail.com");
			fnLibrary.input(txtPassword,"9866405026");
			fnLibrary.click(btnLogin);
			Wait();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Exception occured at --> LoginPage - validateLogin" +" "+ e);
			quit();
		}
		
	}	*/
	
	// Method to Login to the Site.
		public void loginApp() {
			try {
				fnLibrary.input(txtUserName,"1388");
				fnLibrary.input(txtPassword,"Shyam@494");
				fnLibrary.input(cmpanyName, "evoke");
				fnLibrary.click(btnLogin);
				
				
				
			} catch (Exception e) {
					
			}			
		}
}
