package Services;

import java.util.Date;

import ErrorPkg.MonetaryException;
import Models.BillsType;
import Models.Client;
import Models.MemberAccount;
import Models.Response;

public class BillingService extends Client {

	Response response = new Response();

	// paying bill methods
	@Override
	public Response PayingBills(int BillType, String code, String name, String Surname, double balance, double amount)
			throws MonetaryException {
		// chechk is amount greater than balance or not

		if (amount > balance) {

			response.setCode("0");
			response.setDate(new Date());

			return response;
		} else {
			// send error message to print on screen
			throw new MonetaryException("Error : insufficient balance");
		}
	}

	// InvoiceInquiry with two parameter
	@Override
	public Response InvoiceInquiry(int BillType, String code) {
		if (code.equals("1HA")) {
			response.setCode("0");
			response.setDate(new Date());
			return response;
		} else {
			response.setCode("1");
			response.setDate(new Date());
			return response;
		}

	}

	// InvoiceInquiry with three parameter
	@Override
	public Response InvoiceInquiry(int BillType, String code, String Phone) {
		if (BillType == BillsType.PhoneBill.ordinal()) {

			response.setCode("0");
			response.setDate(new Date());
			return response;
		} else {
			response.setCode("1");
			response.setDate(new Date());
			return response;
		}

	}

	@Override
	public Response InvoiceInquiry(int BillType, String code, Date BillDate) {
		// TODO Auto-generated method stub
		return super.InvoiceInquiry(BillType, code, BillDate);
	}

	@Override
	public Response InvoicePaymentCancellation(MemberAccount Code) {
		// TODO Auto-generated method stub
		return super.InvoicePaymentCancellation(Code);
	}

}
