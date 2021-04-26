package userRegestration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSolver  {	
  String validFirstNameFormat = "^[A-Z][a-z]{2,}";
  String validLastNameFormat = "^[A-Z][a-z]{2,}";
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
}
