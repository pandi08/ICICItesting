package pages;



import wrappers.ICICIWrappers;



import utils.Reporter;

public class ConfirmPayee extends ICICIWrappers{
	
	public ConfirmPayee(){
		if(!verifyTitle(driver.getTitle())){
			Reporter.reportStep("This is not Confirm payee page", "FAIL");
		}
	}
	
	public ConfirmPayee enterAccountName(String data)
	{
		enterById("CounterPartyCRUDFG.BNF_NAME", data);
		return this;
	}
	
	public ConfirmPayee enterNickName(String data)
	{
		enterById("CounterPartyCRUDFG.BNF_NICK_NAME", data);
		return this;
	}
	
	public ConfirmPayee enterAccountNumber(String data)
	{
		enterById("CounterPartyCRUDFG.BNF_ACCT_NUMBER", data);
		return this;
	}
	
	public ConfirmPayee enterConfirmAccountNumber(String data)
	{
		enterById("CounterPartyCRUDFG.RE_ACCOUNT_NUMBER", data);
		return this;
	}

	public PreviewConfirmation ClickNext()
	{
		clickById("CONTINUE");
		return new PreviewConfirmation();
	}
}
