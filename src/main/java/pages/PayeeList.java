package pages;



import wrappers.ICICIWrappers;



import utils.Reporter;

public class PayeeList extends ICICIWrappers	{
	public PayeeList(){
		if(!verifyTitle(driver.getTitle())){
			Reporter.reportStep("This is not register payee type page", "FAIL");
		}
	}
	
	public PayeeList VerifyPayee(String data)
	{
	enterById("CounterPartyListFG.BNF_NICK_NAME_IDT", data);
	clickById("FETCH_HOST_CP_LIST_SEARCH");
	return this;
	}
	
	public ConfirmPayee ClickAddPayee()
	{
		clickById("GOTO_ADD_PAYEE");
		return new ConfirmPayee();
	}

}
