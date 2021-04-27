package userRegestration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSolver  {	
  String validFirstNameFormat = "^[A-Z][a-z]{2,}";
  String validLastNameFormat = "^[A-Z][a-z]{2,}";
  String validEmailRegex = "/^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})/";
  String validMobileNo = "^[0-9]{2}[ ][0-9]{10}$";
  void validate(String userInput )
	 {
		
		Pattern compile =Pattern.compile( validFirstNameFormat  ); 
		
		Matcher match= compile.matcher(userInput);
		
		Boolean result = match.matches();
		if(result)
		{
			System.out.println("Valid \n First name  Submitted");
			
		 
		}else 
			System.out.println("Not valid\n Please check the Validation \n"
					+ "\n  First Alphabet Should Be In Capital \n"
					+ "  Length should be atleast 3 ");
			
		
		
		
	    }



void validatelastName(String userInput )
{
	
	Pattern compile =Pattern.compile( validLastNameFormat  ); 
	
	Matcher match= compile.matcher(userInput);
	
	Boolean result = match.matches();
	if(result)
	{
		System.out.println("Valid \n Last name Submitted");
		
	 
	}else 
		System.out.println("Not valid\n Please check the Validation \n"
				+ "\n  First Alphabet Should Be In Capital \n"
				+ "  Length should be atleast 3 ");
		
	
	
	
   }


  void checkEmailId(String  userInput) {
	
	  Pattern compile =Pattern.compile( validEmailRegex ); 
		
		Matcher match= compile.matcher(userInput);
		
		Boolean result = match.matches();
		
	if (result) {
		System.out.println("Email Id Is Valid");

	}else 
		System.out.println("Invalid Email Id");

	}
  
		
		  void checkMobileNo(String userInput) {
            
			  Pattern compile =Pattern.compile( validMobileNo ); 
				
				Matcher match= compile.matcher(userInput);
				
				Boolean result = match.matches();
				
            
                    if (result) {
                            System.out.println("Your Moile No is Valid");

                    }else System.out.println("Your Mobile No is Invalid");

                    

	
}
}
