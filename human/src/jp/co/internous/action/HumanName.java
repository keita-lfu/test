package jp.co.internous.action;

public class HumanName {
	
	public String lastName;
	private String fristName;
	public String getName() {
		fristName= "山田";
		lastName = "太郎";
		String myName = fristName + lastName;
		return myName;
	}

}
