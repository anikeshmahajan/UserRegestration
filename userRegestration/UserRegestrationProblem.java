package userRegestration;


import java.util.Scanner;

public class UserRegestrationProblem {
	
	public static void main(String[] args) {
			System.out.println("Enter the First name");
		
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
		 
		RegexSolver regexSolver = new  RegexSolver();
			regexSolver.validate(userInput);
		scanner.close();
	}
}
