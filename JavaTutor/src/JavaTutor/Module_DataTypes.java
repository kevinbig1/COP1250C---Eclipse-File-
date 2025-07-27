package JavaTutor;

import java.util.Scanner;

public class Module_DataTypes {

	
	static Scanner scannerObj = new Scanner(System.in);
	
	private static final String MOD1 = "******** MODULE 1: Java Data Types ********\n";
	private static final String MOD1_1 = "Lesson 1.1: Introduction to Data Types\n\ta) Data types define the type of data a variable can hold.\n\tb) Two main categories: primitive and reference.\n\tc) Helps ensure correct operations on data.";
	private static final String MOD1_2 = "Lesson 1.2: Primitive Data Types\n\ta) Include int, double, char, boolean, byte, short, long, float.\n\tb) Stored directly in memory.\n\tc) Efficient and fast for simple data.";
	private static final String MOD1_3 = "Lesson 1.3: Integer Types\n\ta) byte, short, int, long store whole numbers.\n\tb) Use suffix 'L' for long (e.g., 12345L).\n\tc) Range and memory size vary by type.";
	private static final String MOD1_4 = "Lesson 1.4: Floating-Point Types\n\ta) float and double store decimal numbers.\n\tb) Use suffix 'F' for float (e.g., 3.14F).\n\tc) double has higher precision than float.";
	private static final String MOD1_5 = "Lesson 1.5: char and boolean\n\ta) char stores a single character in single quotes (e.g., 'A').\n\tb) boolean holds true or false.\n\tc) Often used in conditions and control flow.";
	private static final String MOD1_6 = "Lesson 1.6: Type Casting\n\ta) Converts data from one type to another.\n\tb) Implicit casting happens automatically (widening).\n\tc) Explicit casting required for narrowing (e.g., (int)3.14).";
	private static final String MOD1_7 = "Lesson 1.7: Reference Types\n\ta) Store addresses pointing to objects (e.g., String, arrays).\n\tb) More complex than primitive types.\n\tc) Must be instantiated using 'new' (except for Strings).";
	private static final String MOD1_8 = "Lesson 1.8: The String Type\n\ta) Strings are objects that represent sequences of characters.\n\tb) Common methods: length(), toUpperCase(), charAt().\n\tc) Strings are immutable in Java.";
	private static final String MOD1_9 = "Lesson 1.9: Variables and Constants\n\ta) Variables store data with a specific type.\n\tb) Constants use the 'final' keyword and cannot be changed.\n\tc) Use descriptive names for clarity.";
	private static final String MOD1_10 = "Lesson 1.10: Choosing the Right Data Type\n\ta) Consider memory, range, and precision needed.\n\tb) Use int for whole numbers, double for decimals.\n\tc) Choose boolean for true/false values.";

    
	private static final String QUIZ1_1 = "Which of the following best describes Java data types?";
	private static final String QUIZ1_1_A = "They are used to define loops.";
	private static final String QUIZ1_1_B = "They only work for strings and integers.";
	private static final String QUIZ1_1_C = "They define the type of data a variable can hold.";
	private static final String QUIZ1_1_D = "They allow dynamic typing like in Python.";
	private static final int QUIZ1_1_ANSWER = 3;
	private static final String QUIZ1_1_EXPLANATION = "Java data types define what kind of data a variable can store, such as integers, characters, or objects.";

	private static final String QUIZ1_2 = "Which of the following is a primitive data type in Java?";
	private static final String QUIZ1_2_A = "String";
	private static final String QUIZ1_2_B = "int";
	private static final String QUIZ1_2_C = "ArrayList";
	private static final String QUIZ1_2_D = "Scanner";
	private static final int QUIZ1_2_ANSWER = 2;
	private static final String QUIZ1_2_EXPLANATION = "int is a primitive type used to store whole numbers. String and ArrayList are reference types.";

	private static final String QUIZ1_3 = "Which type should be used to store whole numbers like 100 or -50?";
	private static final String QUIZ1_3_A = "double";
	private static final String QUIZ1_3_B = "char";
	private static final String QUIZ1_3_C = "int";
	private static final String QUIZ1_3_D = "boolean";
	private static final int QUIZ1_3_ANSWER = 3;
	private static final String QUIZ1_3_EXPLANATION = "int is the most commonly used type for whole numbers in Java.";

	private static final String QUIZ1_4 = "Which data type would best store the value 3.14F?";
	private static final String QUIZ1_4_A = "int";
	private static final String QUIZ1_4_B = "float";
	private static final String QUIZ1_4_C = "char";
	private static final String QUIZ1_4_D = "boolean";
	private static final int QUIZ1_4_ANSWER = 2;
	private static final String QUIZ1_4_EXPLANATION = "float is used for single-precision decimal numbers. The 'F' suffix indicates a float literal.";

	private static final String QUIZ1_5 = "Which of the following correctly declares a char and a boolean?";
	private static final String QUIZ1_5_A = "char c = 'A'; boolean b = true;";
	private static final String QUIZ1_5_B = "char c = \"A\"; boolean b = yes;";
	private static final String QUIZ1_5_C = "character c = 'A'; bool b = true;";
	private static final String QUIZ1_5_D = "char = 'A'; boolean = false;";
	private static final int QUIZ1_5_ANSWER = 1;
	private static final String QUIZ1_5_EXPLANATION = "char values are enclosed in single quotes, and boolean can be either true or false.";

	private static final String QUIZ1_6 = "Which of the following is an example of explicit casting?";
	private static final String QUIZ1_6_A = "int z = (int) 3.14;";
	private static final String QUIZ1_6_B = "double y = x;";
	private static final String QUIZ1_6_C = "int x = 5;";
	private static final String QUIZ1_6_D = "float f = 2.5F;";
	private static final int QUIZ1_6_ANSWER = 1;
	private static final String QUIZ1_6_EXPLANATION = "Explicit casting is required to convert from double to int because it involves loss of precision.";

	private static final String QUIZ1_7 = "Which of the following is a reference type in Java?";
	private static final String QUIZ1_7_A = "int";
	private static final String QUIZ1_7_B = "boolean";
	private static final String QUIZ1_7_C = "char";
	private static final String QUIZ1_7_D = "String";
	private static final int QUIZ1_7_ANSWER = 4;
	private static final String QUIZ1_7_EXPLANATION = "String is a reference type because it points to an object in memory.";

	private static final String QUIZ1_8 = "What is true about Strings in Java?";
	private static final String QUIZ1_8_A = "They are primitive types.";
	private static final String QUIZ1_8_B = "They are mutable.";
	private static final String QUIZ1_8_C = "They are objects and immutable.";
	private static final String QUIZ1_8_D = "They store only a single character.";
	private static final int QUIZ1_8_ANSWER = 3;
	private static final String QUIZ1_8_EXPLANATION = "Strings are immutable objects in Java, meaning their values can't be changed once created.";

	private static final String QUIZ1_9 = "Which keyword is used to create a constant in Java?";
	private static final String QUIZ1_9_A = "const";
	private static final String QUIZ1_9_B = "final";
	private static final String QUIZ1_9_C = "static";
	private static final String QUIZ1_9_D = "constant";
	private static final int QUIZ1_9_ANSWER = 2;
	private static final String QUIZ1_9_EXPLANATION = "The 'final' keyword in Java makes a variable constant, meaning it can't be reassigned.";

	private static final String QUIZ1_10 = "Which of the following would be best for storing a true/false value?";
	private static final String QUIZ1_10_A = "int";
	private static final String QUIZ1_10_B = "String";
	private static final String QUIZ1_10_C = "char";
	private static final String QUIZ1_10_D = "boolean";
	private static final int QUIZ1_10_ANSWER = 4;
	private static final String QUIZ1_10_EXPLANATION = "boolean is the appropriate data type for true/false values in Java.";


    public static boolean displayModule_1(User user) 
    {
       final int SIZE = 10;
 	   
 	   System.out.println(MOD1);      

 	   String moduleLessons[] = {MOD1_1, MOD1_2, MOD1_3, MOD1_4, MOD1_5, MOD1_6, MOD1_7, MOD1_8, MOD1_9, MOD1_10,};
 	   
 	   
 	   for (int i= 0; i < SIZE; i++)
 	   {
 	       System.out.println(moduleLessons[i]);
 	       user.setModuleLessonNumber(1,i+1);
 	       user.setModuleTimestamp(1, Timestamp.getDateTime());
 	       System.out.println("\nHit ENTER key to continue");
 	       scannerObj.nextLine();
 	   }
 	  
 	   
 	   System.out.println("Starting quiz for this module:");
 	   System.out.println("There are 10 multiple choice questions.");
 	   System.out.println("You must score 60% or higher to mark this module as COMPLETED!\n");
 	   

 	   int quizResult = 0;
 	   
 	   quizResult += Quiz.takeQuiz(MOD1, 1, QUIZ1_1, QUIZ1_1_A, QUIZ1_1_B, QUIZ1_1_C, QUIZ1_1_D, QUIZ1_1_ANSWER, QUIZ1_1_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 2, QUIZ1_2, QUIZ1_2_A, QUIZ1_2_B, QUIZ1_2_C, QUIZ1_2_D, QUIZ1_2_ANSWER, QUIZ1_2_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 3, QUIZ1_3, QUIZ1_3_A, QUIZ1_3_B, QUIZ1_3_C, QUIZ1_3_D, QUIZ1_3_ANSWER, QUIZ1_3_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 4, QUIZ1_4, QUIZ1_4_A, QUIZ1_4_B, QUIZ1_4_C, QUIZ1_4_D, QUIZ1_4_ANSWER, QUIZ1_4_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 5, QUIZ1_5, QUIZ1_5_A, QUIZ1_5_B, QUIZ1_5_C, QUIZ1_5_D, QUIZ1_5_ANSWER, QUIZ1_5_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 6, QUIZ1_6, QUIZ1_6_A, QUIZ1_6_B, QUIZ1_6_C, QUIZ1_6_D, QUIZ1_6_ANSWER, QUIZ1_6_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 7, QUIZ1_7, QUIZ1_7_A, QUIZ1_7_B, QUIZ1_7_C, QUIZ1_7_D, QUIZ1_7_ANSWER, QUIZ1_7_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 8, QUIZ1_8, QUIZ1_8_A, QUIZ1_8_B, QUIZ1_8_C, QUIZ1_8_D, QUIZ1_8_ANSWER, QUIZ1_8_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 9, QUIZ1_9, QUIZ1_9_A, QUIZ1_9_B, QUIZ1_9_C, QUIZ1_9_D, QUIZ1_9_ANSWER, QUIZ1_9_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD1, 10, QUIZ1_10, QUIZ1_10_A, QUIZ1_10_B, QUIZ1_10_C, QUIZ1_10_D, QUIZ1_10_ANSWER, QUIZ1_10_EXPLANATION);
 	   
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
