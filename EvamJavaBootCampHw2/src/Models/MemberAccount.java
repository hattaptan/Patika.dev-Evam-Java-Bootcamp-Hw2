package Models;

public class MemberAccount {
	
	 
	// Necessary variables to define a member 
	private int MemberAccountId;
	private String Name;
	private String SurName;
	private String Code;
	private double Balance;
	private String Phone;
	
	// constructor method for MemberAccount with all parameters
	public MemberAccount(int memberAccountId, String name, String surName, String code, double balance, String phone) {
		super();
		MemberAccountId = memberAccountId;
		Name = name;
		SurName = surName;
		Code=code;
		if (!Code.equals(String.valueOf(MemberAccountId)+name.charAt(0)+name.charAt(1))) {
			Code =String.valueOf(MemberAccountId)+name.charAt(0)+name.charAt(1);
		}
		Balance = balance;
		Phone = phone;
	}
	
	// constructor method for MemberAccount not taking  parameters
	public MemberAccount() {
		
	}
 
   // all set and get methods
	public int getMemberAccountId() {
		return MemberAccountId;
	}


	public void setMemberAccountId(int memberAccountId) {
		MemberAccountId = memberAccountId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getSurName() {
		return SurName;
	}


	public void setSurName(String surName) {
		SurName = surName;
	}


	public String getCode() {
		return Code;
	}


	public void setCode(String code) {
		Code = code;
	}


	public double getBalance() {
		return Balance;
	}


	public void setBalance(double balance) {
		Balance = balance;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}

 
	
	public void MemberInfo() {
		
		System.out.println("MemberAccount [MemberAccountId=" + MemberAccountId + ", Name=" + Name + ", SurName=" + SurName
				+ ", Code=" + Code + ", Balance=" + Balance + ", Phone=" + Phone + "]");
	}

	
	
	
	
	
	
}
