import java.util.Scanner;

public class PasswordValidator {

	/*The password must be at least eight characters long,
	contain an uppercase letter,
	contain a special character*/

	public static void main(String[] args) {
		validatePassword("Testing@123");
		//validatePassword("Prateek@123");
	}

	public static void validatePassword(String password){
		if(password.length()> 8 && validateSpecialCharacter(password) && validateUppercaseCharacter(password)){
			System.out.println(String.format("It complies to new password rules:  %s",password ));
		} else
		{
			System.out.println("This not a valid password");
		}
	}

	//this method verifies strings after converting one input to lower case
	/*public static boolean validateUppercaseCharacter(String password){
		if(password.equals(password.toLowerCase())){
			return false;
		};
		return true;
	}*/

	public static boolean validateSpecialCharacter(String password){
		 if(password.matches("[a-zA-Z0-9 ]*")){
			return false;
		}
		 return true;
	}

	//this method verifies every character with the help of  isUpperCase method

	public static boolean validateUppercaseCharacter(String password){
		boolean valid = false;
		char[] passwordArray = password.toCharArray();
		for(char alp: passwordArray){
              if(Character.isUpperCase(alp)){
              	valid = true;
              	break;
              }
		}
		return valid;
	}




}
