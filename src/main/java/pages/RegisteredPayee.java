package pages;


import wrappers.ICICIWrappers;



import utils.Reporter;

public class RegisteredPayee extends ICICIWrappers{
	public RegisteredPayee(){
		if(!verifyTitle(driver.getTitle())){
			Reporter.reportStep("This is not register payee type page", "FAIL");
		}
	}
	
	public PayeeList ClickContinue()
	{
		clickById("CONTINUE_PAYEE_LIST");
		return new PayeeList();
	}

}
