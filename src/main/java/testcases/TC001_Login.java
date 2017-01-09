package testcases;

import org.testng.annotations.Test;

import pages.ConfirmPayee;
import pages.Dashboard;
import pages.LoginPage;
import pages.ManagePayee;
import pages.PayeeList;
import pages.RegisteredPayee;
import wrappers.ICICIWrappers;

import org.testng.annotations.BeforeClass;


public class TC001_Login extends ICICIWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, String Amount, String PayeeName, String AccountName, String NickName, String AccountNumber, String ConAcNumber) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin();
		new Dashboard()
		.CheckAmount(Amount)
		.NavigateManagePayee();
		new ManagePayee()
		.ClickView();
		new RegisteredPayee()
		.ClickContinue();
		new PayeeList()
		.VerifyPayee(PayeeName)
		.ClickAddPayee();
		new ConfirmPayee()
		.enterAccountName(AccountName)
		.enterAccountName(NickName)
		.enterAccountNumber(AccountNumber)
		.enterConfirmAccountNumber(ConAcNumber);
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="firefox";
		testCaseName="ICICI";
		testDescription="Login to ICICI";
	}	
	
}
