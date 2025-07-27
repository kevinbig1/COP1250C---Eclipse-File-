package JavaTutor;

import java.util.Scanner;

/**
 * 	The Quiz class is used to display quiz questions, multiple choice answers, and an explanation
 *  for each learning module in the Java Tutorial program.
 * 	
 * 	Quiz questions are displayed on the console and the user is prompted to select an answer.
 * 	
 */
public class Quiz {

	// Create a Scanner object to read user input via System.in
	static Scanner scannerObj = new Scanner(System.in);
	
	/**
	 * 	The takeQuiz() method receives quiz String data and displays it to the user in order to test
	 * 	knowledge based on module lessons.
	 * 
	 * @param module : 	the name of the learning module
	 * @param num: 		the number of the quiz question
	 * @param question:	the quiz question
	 * @param a:			multiple choice guess A
	 * @param b:			multiple choice guess B
	 * @param c:			multiple choice guess C
	 * @param d:			multiple choice guess D
	 * @param answer:		the quiz answer
	 * @param explanation: an explanation about the answer
	 * 	
	 * 	Quiz questions are displayed on the console and the user is prompted to select an answer.
	 * 	
	 */
	public static int takeQuiz(String module, int num, String question, String a, String b, String c, String d, int answer, String explanation) 
    {
 	   	// Boolean flag for validating user input of quiz guess 1 thru 4
		boolean invalid = true;
 	   	
		// Store user guess selection in option variable
		int option = 0;
		
		// Test score accumulator, initialized to zero
		int score = 0;
		
		// Display quiz menu from method parameters
 	   	System.out.println(module);
 	   	System.out.println("Quiz question " + num + ": " + question + "\n");
 	   	System.out.println("1: " + a);
 	   	System.out.println("2: " + b);
 	   	System.out.println("3: " + c);
 	   	System.out.println("4: " + d);	
		System.out.println("\nPlease enter answer (1 - 4):");
		
 	   	// Get user option via Scanner object
		option = scannerObj.nextInt();
		
		// Continually loop until user enters valid option (1 thru 4)
		// and invalid boolean variable set to false
		while (invalid)
		{
			switch (option)
			{
				// Case for quiz guesses 1 thru 4
				case 1, 2, 3, 4: 
				{
					// Valid option, set boolean=false to exit loop
					invalid = false;
					// Break out of switch cases
					break;
				}
				default:
				{
					// Display error message if integer not between 1 and 4
					System.out.println("Invalid input. Please number between 1 and 4:");	
					// Get next integer response from user via Scanner object
					option = scannerObj.nextInt();					
				}				
			}			
		}	
		
		// Test if user option equals the correct quiz answer
		if (option == answer)
		{
			System.out.println("Your answer is correct!");
			// Add 10 points to the quiz score accumulator
			score = 10;
		}
		else
		{
			System.out.println("Your answer is not correct!");
			// Do not add any points to the quiz score accumulator
			score = 0;
		}			
		// Display the quiz explanation regardless of correct/incorrect guess
		System.out.println("Explanation: " + explanation);
		
		// return quiz result
		return score;
    }

}
