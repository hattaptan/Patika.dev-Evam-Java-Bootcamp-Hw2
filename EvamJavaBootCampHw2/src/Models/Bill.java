package Models;

import java.util.Date;

public class Bill {
	// necessary variables for bill
	private int billId;
	private double amount;
	private Date processDate;
	private int billType;
	public String MemberCode;
	
	

	// constructor method for Bill Class
	public Bill(int billId, double amount, Date processDate, int billType, String memberCode) {
		super();
		this.billId = billId;
		this.amount = amount;
		this.processDate = processDate;
		this.billType = billType;
		MemberCode = memberCode;
	}

	// set and get methods for Bill
	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public int getBillType() {
		return billType;
	}

	public void setBillType(int billType) {
		this.billType = billType;
	}
	public String getMemberCode() {
		return MemberCode;
	}

	public void setMemberCode(String memberCode) {
		MemberCode = memberCode;
	}

	 
	
	public void BillInfo() {
		System.out.println( "Bill [billId=" + billId + ", amount=" + amount + ", processDate=" + processDate + ", billType="
				+ billType + ", MemberCode=" + MemberCode + "]" );
	}

}
