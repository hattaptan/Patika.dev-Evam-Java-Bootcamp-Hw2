package Test;

import java.util.Date;

import ErrorPkg.MonetaryException;
import Models.Bill;
import Models.BillsType;
import Models.MemberAccount;
import Models.Response;
import Services.BillingService;
import Services.MemberAccountService;

public class Main {

	public static void main(String[] args) throws MonetaryException, InterruptedException {

		// Create a member 
		MemberAccount memberAccount = new MemberAccount(1, "Hattap", "TAN", "aa", 785, "123456789");
		//write to screen created member
		System.out.println("****MEMBER INFO****");
		memberAccount.MemberInfo();
		System.out.println();
		// date to use for bill
		Date now = new Date();

		// define bill type 
		int BillTypes = BillsType.PhoneBill.ordinal();
        
		//Create a bill
		Bill bill = new Bill(1, 500, now, BillTypes, memberAccount.getCode());
		
		//Show created Bill
		System.out.println("****BILL INFO****");
		bill.BillInfo();
		System.out.println();
         
		// instance for BillingService
		BillingService billingService = new BillingService();

		// Query by phone
		if (BillTypes==0) {
			Response responsePayingBills = billingService.InvoiceInquiry(BillTypes, memberAccount.getCode(), memberAccount.getPhone());
			switch (responsePayingBills.getCode()) {
			case "0":
				System.out.println("The operation is successful for Code and Phone.. Created Date : " + responsePayingBills.getDate());
				break;
			case "1":
				System.out.println("The operation is Unsuccessful Code and Phone.. Created Date : " + responsePayingBills.getDate());
				break;

			default:
				break;
			}
		}
		
		System.out.println();
		//Check is balance and amount
		try {
			Response responsePayingBills = billingService.PayingBills(1, "1ha", "Hattap", "TAN", 7000, 850);
			switch (responsePayingBills.getCode()) {
			case "0":
				System.out.println("The operation is successful.. Created Date : " + responsePayingBills.getDate());
				break;
			case "1":
				System.out.println("The operation is Unsuccessful.. Created Date : " + responsePayingBills.getDate());
				break;

			default:
				break;
			}
		} catch (MonetaryException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		// define bill type
		int BillTypesforPhone = BillsType.PhoneBill.ordinal();
		
		System.out.println();
		
		Response ResponseInvoiceInquiry = billingService.InvoiceInquiry(BillTypesforPhone, memberAccount.getCode());
		 
		// make a query with three parameters
		try {
			ResponseInvoiceInquiry = billingService.PayingBills(1, "1ha", "Hattap", "TAN", 700, 850);
			switch (ResponseInvoiceInquiry.getCode()) {
			case "0":
				System.out.println("The operation is successful.. Created Date : " + ResponseInvoiceInquiry.getDate());
				break;
			case "1":
				System.out.println("The operation is Unsuccessful.. Created Date : " + ResponseInvoiceInquiry.getDate());
				break;

			default:
				break;
			}
		} catch (MonetaryException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println();
		
		
		
		
		// Create new member using Create in memberAccountService
		System.out.println("********CREATE AND READ MEMBER************");
		MemberAccountService memberAccountService = new MemberAccountService();
		System.out.println();
	   	memberAccountService.Create(2, "TAN", "HATTAP", "kkk", 500, "3647");
	   	memberAccountService.Read();
	   	System.out.println();
	    // Update member using Update methods in  memberAccountService
	   	System.out.println("********UPDATE************");
	   	memberAccountService.Update(2, "HATTAP", "TAN", "frwff", 550, "3647");
	 	memberAccountService.Read();
	 	System.out.println();
	    // Delete member using Delete methods in  memberAccountService
		System.out.println("********DELETE MEMBER************");
		System.out.print("Member is deleting");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println();
		memberAccountService.Delete();
		System.out.println();
        // Read member after deletion
		System.out.println("********AFTER DELETE MEMBER************");
		memberAccountService.Read();
	}

}
