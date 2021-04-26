package userRegestration;


import java.util.Scanner;

public class UserRegestrationProblem {
	
	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    RegexSolver regexSolver = new  RegexSolver();
			
		    System.out.println("Enter the First name");
			String userFirstName = scanner.next();
			
			regexSolver.validate(userFirstName);
			System.out.println("\n<-------->\n");
			
		    System.out.println("Enter the last name");
			String userLastName = scanner.next();
		 
			regexSolver.validatelastName(userLastName);
		scanner.close();
	}
}
