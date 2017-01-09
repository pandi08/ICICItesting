package pages;



import wrappers.ICICIWrappers;




import utils.Reporter;

public class ManagePayee extends ICICIWrappers{
	public ManagePayee(){
		if(!verifyTitle(driver.getTitle())){
			Reporter.reportStep("This is not manage payees page", "FAIL");
		}
	}
	public RegisteredPayee ClickView()
	{
		clickById(prop.getProperty("ManagePayee.View.Id"));
		return new RegisteredPayee();
	}
}
