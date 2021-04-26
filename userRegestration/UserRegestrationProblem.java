package userRegestration;


import java.util.Scanner;

public class UserRegestrationProblem {
	
	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    RegexSolver regexSolver = new  RegexSolver();
				
//			    System.out.println("Enter the First name");
//				String userFirstName = scanner.nextLine();
//				
//				regexSolver.validate(userFirstName);
//				System.out.println("\n<-------->\n");
//				
//				scanner.nextLine();
//		    System.out.println("Enter the last name");
//			String userLastName = scanner.nextLine();
//		 
//			regexSolver.validatelastName(userLastName);
//			
//            System.out.println("\n<-------->\n");
//			   
//            scanner.nextLine();
			    System.out.println("Enter the email");
				String emailId = scanner.nextLine();
				
				regexSolver.checkEmailId(emailId);
				
				 System.out.println("\n<-------->\n");
					
//			System.out.println("Enter the MobileNo");
//			String mobileNo = scanner.nextLine();
//				
//			regexSolver.checkMobileNo(mobileNo);
			
			
		scanner.close();
	}
}
