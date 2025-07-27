package JavaTutor;

import java.util.Scanner;

public class Module_Loops {
	
	static Scanner scannerObj = new Scanner(System.in);
	
	private static final String MOD2 = "******** MODULE 2: Java Loops ********\n";
	private static final String MOD2_1 = "Lesson 2.1: Introduction to Loops\n\ta) Loops are used to execute a block of code repeatedly.\n\tb) Common loop types: for, while, and do-while.\n\tc) Helps reduce repetitive code and improve efficiency.";
	private static final String MOD2_2 = "Lesson 2.2: The 'for' Loop\n\ta) Best for counter-controlled repetition.\n\tb) Syntax: for(initialization; condition; update).\n\tc) All loop control expressions are in one line.";
	private static final String MOD2_3 = "Lesson 2.3: The 'while' Loop\n\ta) Entry-controlled loop—condition checked before execution.\n\tb) Good when number of repetitions is unknown.\n\tc) Syntax: while(condition) { // code }";
	private static final String MOD2_4 = "Lesson 2.4: The 'do-while' Loop\n\ta) Exit-controlled loop—runs at least once.\n\tb) Condition checked after the loop body.\n\tc) Syntax: do { // code } while(condition);";
	private static final String MOD2_5 = "Lesson 2.5: Nested Loops\n\ta) A loop inside another loop.\n\tb) Used for multi-dimensional data (e.g., grids, matrices).\n\tc) Outer loop controls rows; inner loop controls columns.";
	private static final String MOD2_6 = "Lesson 2.6: The 'break' Statement\n\ta) Exits the nearest enclosing loop immediately.\n\tb) Useful for stopping early when a condition is met.\n\tc) Often used with if-statements inside loops.";
	private static final String MOD2_7 = "Lesson 2.7: The 'continue' Statement\n\ta) Skips the current iteration and moves to the next.\n\tb) Useful for filtering values or skipping steps.\n\tc) Only affects the current loop level.";
	private static final String MOD2_8 = "Lesson 2.8: Infinite Loops\n\ta) Loops that never terminate unless broken manually.\n\tb) Caused by missing conditions or improper updates.\n\tc) Example: while(true) or for(;;)";
	private static final String MOD2_9 = "Lesson 2.9: Loop Scope and Variables\n\ta) Variables declared inside loops are local to that loop.\n\tb) Loop counters can be reused in nested or separate loops.\n\tc) Scope rules help avoid variable conflicts.";
	private static final String MOD2_10 = "Lesson 2.10: Common Loop Errors\n\ta) Off-by-one errors (e.g., using <= vs <).\n\tb) Forgetting to update the loop variable.\n\tc) Misplaced break/continue can cause logic issues.";
    
	
	private static final String QUIZ2_1 = "What is the main purpose of using loops in Java?";
	private static final String QUIZ2_1_A = "To execute code repeatedly without rewriting it";
	private static final String QUIZ2_1_B = "To create variables";
	private static final String QUIZ2_1_C = "To call methods";
	private static final String QUIZ2_1_D = "To compile code";
	private static final int QUIZ2_1_ANSWER = 1;
	private static final String QUIZ2_1_EXPLANATION = "Loops help run the same block of code multiple times, improving efficiency and avoiding redundancy.";

	private static final String QUIZ2_2 = "Which of the following correctly represents a 'for' loop syntax?";
	private static final String QUIZ2_2_A = "for(condition; update; initialization)";
	private static final String QUIZ2_2_B = "for(initialization; condition; update)";
	private static final String QUIZ2_2_C = "loop for(init; cond; update)";
	private static final String QUIZ2_2_D = "foreach(initial; cond; update)";
	private static final int QUIZ2_2_ANSWER = 2;
	private static final String QUIZ2_2_EXPLANATION = "Correct syntax is: for(initialization; condition; update).";

	private static final String QUIZ2_3 = "What is true about a 'while' loop?";
	private static final String QUIZ2_3_A = "It always executes at least once";
	private static final String QUIZ2_3_B = "It checks the condition after the loop body";
	private static final String QUIZ2_3_C = "It checks the condition before executing the loop body";
	private static final String QUIZ2_3_D = "It cannot run infinitely";
	private static final int QUIZ2_3_ANSWER = 3;
	private static final String QUIZ2_3_EXPLANATION = "The 'while' loop is entry-controlled and checks its condition before each execution.";

	private static final String QUIZ2_4 = "Which loop always runs at least once?";
	private static final String QUIZ2_4_A = "while loop";
	private static final String QUIZ2_4_B = "for loop";
	private static final String QUIZ2_4_C = "do-while loop";
	private static final String QUIZ2_4_D = "if statement";
	private static final int QUIZ2_4_ANSWER = 3;
	private static final String QUIZ2_4_EXPLANATION = "The do-while loop is exit-controlled, so it executes the loop body once before checking the condition.";

	private static final String QUIZ2_5 = "Which statement is true about nested loops?";
	private static final String QUIZ2_5_A = "They are only allowed in while loops";
	private static final String QUIZ2_5_B = "They are not supported in Java";
	private static final String QUIZ2_5_C = "Only two levels of nesting are allowed";
	private static final String QUIZ2_5_D = "The inner loop runs once per outer loop iteration";
	private static final int QUIZ2_5_ANSWER = 4;
	private static final String QUIZ2_5_EXPLANATION = "Nested loops are used to work with multi-dimensional data. The inner loop runs multiple times for each outer loop iteration.";

	private static final String QUIZ2_6 = "What does the 'break' statement do in a loop?";
	private static final String QUIZ2_6_A = "It skips the current iteration";
	private static final String QUIZ2_6_B = "It restarts the loop";
	private static final String QUIZ2_6_C = "It exits the loop immediately";
	private static final String QUIZ2_6_D = "It causes a syntax error";
	private static final int QUIZ2_6_ANSWER = 3;
	private static final String QUIZ2_6_EXPLANATION = "The break statement immediately exits the nearest enclosing loop.";

	private static final String QUIZ2_7 = "What does the 'continue' statement do?";
	private static final String QUIZ2_7_A = "Exits the loop";
	private static final String QUIZ2_7_B = "Skips to the next iteration of the loop";
	private static final String QUIZ2_7_C = "Pauses the loop";
	private static final String QUIZ2_7_D = "Repeats the previous iteration";
	private static final int QUIZ2_7_ANSWER = 2;
	private static final String QUIZ2_7_EXPLANATION = "'continue' skips the rest of the loop body and jumps to the next iteration.";

	private static final String QUIZ2_8 = "Which loop is an example of an infinite loop?";
	private static final String QUIZ2_8_A = "while(true)for(int i = 0; i < 5; i++)";
	private static final String QUIZ2_8_B = "for(int i = 0; i < 5; i++)";
	private static final String QUIZ2_8_C = "do { break; } while(true);";
	private static final String QUIZ2_8_D = "for(int i = 0; i < 10; i++)";
	private static final int QUIZ2_8_ANSWER = 1;
	private static final String QUIZ2_8_EXPLANATION = "'while(true)' is a common structure for an infinite loop unless broken by logic inside.";

	private static final String QUIZ2_9 = "What is true about variables declared inside loops?";
	private static final String QUIZ2_9_A = "They are global";
	private static final String QUIZ2_9_B = "They are accessible only inside the loop";
	private static final String QUIZ2_9_C = "They can be accessed outside the method";
	private static final String QUIZ2_9_D = "They must be declared outside the loop";
	private static final int QUIZ2_9_ANSWER = 2;
	private static final String QUIZ2_9_EXPLANATION = "Variables declared in loops are local to the loop block and cannot be accessed outside it.";

	private static final String QUIZ2_10 = "Which is a common loop error?";
	private static final String QUIZ2_10_A = "Using == instead of =";
	private static final String QUIZ2_10_B = "Declaring variables";
	private static final String QUIZ2_10_C = "Using != instead of ==";
	private static final String QUIZ2_10_D = "Off-by-one errors like using <= instead of <";
	private static final int QUIZ2_10_ANSWER = 4;
	private static final String QUIZ2_10_EXPLANATION = "Off-by-one errors are common when loop boundaries are incorrectly specified, causing extra or missing iterations.";

    public static boolean displayModule_2(User user) 
    {
       final int SIZE = 10;
 	   
 	   System.out.println(MOD2);      

 	   String moduleLessons[] = {MOD2_1, MOD2_2, MOD2_3, MOD2_4, MOD2_5, MOD2_6, MOD2_7, MOD2_8, MOD2_9, MOD2_10,};
 	   
 	   
 	   for (int i= 0; i < SIZE; i++)
 	   {
 	       System.out.println(moduleLessons[i]);
 	       user.setModuleLessonNumber(2,i+1);
 	       user.setModuleTimestamp(2, Timestamp.getDateTime());
 	       System.out.println("\nHit ENTER key to continue");
 	       scannerObj.nextLine();
 	   }
 	  
 	   
 	   System.out.println("Starting quiz for this module:");
 	   System.out.println("There are 10 multiple choice questions.");
 	   System.out.println("You must score 60% or higher to mark this module as COMPLETED!\n");
 	   

 	   int quizResult = 0;
 	   
 	   quizResult += Quiz.takeQuiz(MOD2, 1, QUIZ2_1, QUIZ2_1_A, QUIZ2_1_B, QUIZ2_1_C, QUIZ2_1_D, QUIZ2_1_ANSWER, QUIZ2_1_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 2, QUIZ2_2, QUIZ2_2_A, QUIZ2_2_B, QUIZ2_2_C, QUIZ2_2_D, QUIZ2_2_ANSWER, QUIZ2_2_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 3, QUIZ2_3, QUIZ2_3_A, QUIZ2_3_B, QUIZ2_3_C, QUIZ2_3_D, QUIZ2_3_ANSWER, QUIZ2_3_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 4, QUIZ2_4, QUIZ2_4_A, QUIZ2_4_B, QUIZ2_4_C, QUIZ2_4_D, QUIZ2_4_ANSWER, QUIZ2_4_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 5, QUIZ2_5, QUIZ2_5_A, QUIZ2_5_B, QUIZ2_5_C, QUIZ2_5_D, QUIZ2_5_ANSWER, QUIZ2_5_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 6, QUIZ2_6, QUIZ2_6_A, QUIZ2_6_B, QUIZ2_6_C, QUIZ2_6_D, QUIZ2_6_ANSWER, QUIZ2_6_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 7, QUIZ2_7, QUIZ2_7_A, QUIZ2_7_B, QUIZ2_7_C, QUIZ2_7_D, QUIZ2_7_ANSWER, QUIZ2_7_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 8, QUIZ2_8, QUIZ2_8_A, QUIZ2_8_B, QUIZ2_8_C, QUIZ2_8_D, QUIZ2_8_ANSWER, QUIZ2_8_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 9, QUIZ2_9, QUIZ2_9_A, QUIZ2_9_B, QUIZ2_9_C, QUIZ2_9_D, QUIZ2_9_ANSWER, QUIZ2_9_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD2, 10, QUIZ2_10, QUIZ2_10_A, QUIZ2_10_B, QUIZ2_10_C, QUIZ2_10_D, QUIZ2_10_ANSWER, QUIZ2_10_EXPLANATION);
 	  
 	   // Display the QUIZ result to the user via the console 	   
 	   System.out.println("\nYour score is " + quizResult + "%");
 	   user.setQuizScore(1, quizResult);
 	   user.setQuizTimestamp(1, Timestamp.getDateTime());
  	   
 	   // Declare a boolean variable to indicate if the module is considered complete. Initialized to false. 	   
 	   boolean completeStatus = false;
 	   
 	   // If the quizResult is 60% or higher, set completeStatus to TRUE
 	   if (quizResult >= 60)
 	   {
 	 	   System.out.println("\nCongratulations! You have successfully completed this module!\n");
 	 	   completeStatus = true;
 	   }
 	  
 	   // If If the quizResult is less than 60%, set completeStatus to FALSE
 	   else
 	   {
  	 	  System.out.println("\nSorry! You must score 60% to complete this module!");
  	 	  System.out.println("You may retake this module and quiz from the main menu.\n");
 		  completeStatus = false; 		   
 	   }
 	   
  	  // return the module's completeStatus
 	  return completeStatus;
    }
}
