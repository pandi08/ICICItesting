package pages;

import utils.Reporter;
import wrappers.ICICIWrappers;

public class Dashboard extends ICICIWrappers{
	public Dashboard(){
		if(!verifyTitle("Bank Accounts")){
			Reporter.reportStep("This is not Home bank accounts page", "FAIL");
		}
	}
	public Dashboard CheckAmount(String data)
	{
		verifyTextContainsByClassName(prop.getProperty("Dashboard.Amount.Class"), data);
		return this;
	}
	public ManagePayee NavigateManagePayee()
	{
		mouseOverById(prop.getProperty("Dashboard.PaymentTransfer.Id"));
		clickByLink("MANAGE PAYEES");
		return new ManagePayee();
	}
	}
