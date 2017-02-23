package csci3130.email_validator_ui;
import java.lang.String;

public class EmailValidator {
	private String emailAddress = "";

	
	public EmailValidator(){}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
<<<<<<< HEAD 
	 * @param emailAddress the emailAddress to set
=======
	 * @param emailAddress the emailAddress to set  
>>>>>>> fa0a3d6 a3-stage1
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public boolean isValid(){
		boolean b1 = isOneAt(emailAddress);
		boolean b2 = isPoint(emailAddress);
		boolean b3 = isValidDomainName(emailAddress);
		boolean b4 = isStartWithLowercase(emailAddress);
		boolean result = b1 && b2 && b3 && b4;
		return result;
	}
	public boolean isOneAt() {
		return isOneAt(emailAddress);
	}
	public boolean isPoint() {
		return isPoint(emailAddress);
	}
	public boolean isValidDomainName(){
		return isValidDomainName(emailAddress);
	}
	public boolean isStartWithLowercase(){
		return isStartWithLowercase(emailAddress);
		
	}
	
	public boolean isOneAt(String forTest) {
		boolean checkIfExit = forTest.contains("@");
		boolean checkIfSingal = forTest.indexOf("@") == forTest.lastIndexOf("@");
		boolean result = checkIfExit && checkIfSingal;
		return result;
	}
	
	public boolean isPoint(String forTest) {
		boolean result = forTest.contains(".");
		return result;
	}
	
	public boolean isValidDomainName(String forTest){
		boolean result = false;
		String validDomainName[] = {"com","gov","edu","org","net","biz"};
		String last3chars = forTest.substring(forTest.length() - 3);
		for(int i=0;i<validDomainName.length;i++){
			if(validDomainName[i].equals(last3chars)){
				result = true;
				break;
			}
		}
		return result;
	}
	
	public boolean isStartWithLowercase(String forTest){
		boolean result = false;
		result = Character.isLowerCase(forTest.charAt(0));
		return result;
	}
}