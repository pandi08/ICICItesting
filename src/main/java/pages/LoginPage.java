package pages;


import utils.Reporter;
import wrappers.ICICIWrappers;



public class LoginPage extends ICICIWrappers
{
	
	public LoginPage(){
		if(!verifyTitle("Log in to Internet Banking")){
			Reporter.reportStep("This is not ICCI Login Page", "FAIL");
		}
	}
	public LoginPage enterUserName(String data) {
		System.out.println("Check UserName"+data);
		enterById(prop.getProperty("Login.UserName.Id"), data);
		return this;
	}
	public LoginPage enterPassword(String data) {
		enterById(prop.getProperty("Login.Password.Id"), data);
		return this;
	}
	public Dashboard clickLogin() {
		clickById(prop.getProperty("Login.LoginButton.Id"));
		return new Dashboard();
	}
}
