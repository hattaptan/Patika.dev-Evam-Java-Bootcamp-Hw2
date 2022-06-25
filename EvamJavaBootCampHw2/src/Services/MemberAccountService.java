package Services;

import Models.MemberAccount;

public class MemberAccountService {

	MemberAccount memberAccount = new MemberAccount();
	// Create a new member using Create method with needed parameters

	public void Create(int MemberAccountId, String Name, String SurName, String Code, double Balance, String Phone) {

		memberAccount.setMemberAccountId(MemberAccountId);
		memberAccount.setName(Name);
		memberAccount.setSurName(SurName);
		memberAccount.setCode(String.valueOf(MemberAccountId) + Name.charAt(0) + Name.charAt(1));
		memberAccount.setBalance(Balance);
		memberAccount.setPhone(Phone);

		// show on screen created member
		System.out.println("Created Member Info : " +

				memberAccount.getMemberAccountId() + " " + memberAccount.getName() + " " + memberAccount.getSurName()
				+ " " + memberAccount.getCode() + " " + memberAccount.getBalance() + " " + memberAccount.getPhone()
				+ " ..."

		);
	}

	public void Read() {
		// show on screen created member
		System.out.println(" Selected Member : " + memberAccount.getMemberAccountId() + " "

				+ memberAccount.getName() + " " + memberAccount.getSurName() + " " + memberAccount.getCode() + " "
				+ memberAccount.getBalance() + " " + memberAccount.getPhone() + " ...");
	}

	// Update a member using new parameters
	public void Update(int MemberAccountId, String Name, String SurName, String Code, double Balance, String Phone) {

		// if already some parameters is same or not.
		if (MemberAccountId != memberAccount.getMemberAccountId()) {

			memberAccount.setMemberAccountId(MemberAccountId);
		}
		if (Name != memberAccount.getName()) {

			memberAccount.setName(Name);
		}
		if (SurName != memberAccount.getSurName()) {

			memberAccount.setSurName(SurName);
		}
		if (Balance != memberAccount.getBalance()) {

			memberAccount.setBalance(Balance);
		}
		if (Phone != memberAccount.getPhone()) {

			memberAccount.setPhone(Phone);
		}
		// after update, print to screen
		System.out.println(" The Updated Member : " + memberAccount.getMemberAccountId() + " "

				+ memberAccount.getName() + " " + memberAccount.getSurName() + " " + memberAccount.getCode() + " "
				+ memberAccount.getBalance() + " " + memberAccount.getPhone() + " ...");
	}

	// Deleting created member
	public void Delete() {

		memberAccount.setMemberAccountId(0);
		memberAccount.setName("");
		memberAccount.setSurName("");
		memberAccount.setCode("");
		memberAccount.setBalance(0.0);
		memberAccount.setPhone("");

		// print empty member account to screen
		System.out.println(" The  Member : " + memberAccount.getMemberAccountId() + " "

				+ memberAccount.getName() + " " + memberAccount.getSurName() + " " + memberAccount.getCode() + " "
				+ memberAccount.getBalance() + " " + memberAccount.getPhone() + " Deleted...");
	}
}
