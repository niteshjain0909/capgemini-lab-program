package lab5;

import java.util.Scanner;
import java.lang.*;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserName mUserName = new UserName();
		Scanner sc = new Scanner(System.in);

		String strFirstName = sc.nextLine();
		String strLastName = sc.nextLine();

		try {
			mUserName.setUserName(strFirstName, strLastName);
		} catch (Exception msg) {

			System.out.println(msg);
		}
	}

}

class UserException extends Exception {
	String mMessage;

	public UserException(String mMessage) {
		super();
		this.mMessage = mMessage;
	}

	@Override
	public String toString() {
		return "UserException [mMessage=" + mMessage + "]";
	}

//	public String getMessage() {
//		return mMessage;
//	}
	

}

class UserName {
	private String userName;

	public void setUserName(String userFirstName, String userLastName) throws UserException {

		if ((!userFirstName.isEmpty()) && (!userLastName.isEmpty())) {
			System.out.println(userFirstName + " " + userLastName);

		} else {

			throw new UserException("Give FirstName or LastName");
		}
	}

}
