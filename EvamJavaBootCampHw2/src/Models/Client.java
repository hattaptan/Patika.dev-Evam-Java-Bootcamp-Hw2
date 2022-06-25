package Models;

import java.util.Date;

import ErrorPkg.MonetaryException;
 
import Services.BillingService;

public class Client {
	
	
     // instance for Response class
	 Response response = new Response();
	// Paying Bils method with type of Response
	public Response PayingBills( int BillType, String code, String name, String Surname, double balance, double amount ) throws MonetaryException {
		
		return response;
	}
	// InvoiceInquiry method with type of Response
	public Response InvoiceInquiry(int BillType, String code) {
		return response;

	}
	// InvoiceInquiry method with type of Response
	public Response InvoiceInquiry(int BillType, String code, String Phone) {
		return response;

	}
	// InvoiceInquiry method with type of Response
	public Response InvoiceInquiry(int BillType, String code, Date BillDate) {
		return response;

	}
	// InvoicePaymentCancellation method with type of Response
	public Response InvoicePaymentCancellation(MemberAccount Code) {
		return response;

	}

	 
}
