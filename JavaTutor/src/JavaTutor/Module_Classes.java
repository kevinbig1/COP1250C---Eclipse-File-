package JavaTutor;

import java.util.Scanner;

/**
 * 	The Module_Classes class is the fourth module in the Java Tutorial program.
 * 	
 * 	The class displays ten 3-bullet lessons about Classes in the Java programming language,
 * 	followed by a ten question quiz. In order to successfully complete the module, the user must
 * 	score 60% or higher
 * 	
 */

public class Module_Classes {
	// Create a Scanner object to read user input via System.in
	static Scanner scannerObj = new Scanner(System.in);
	
	// The MOD4 constants are text strings that are displayed to the console as part of the Java Tutorial for the Classes module.
	// A design decision was made to use static in-line strings rather than data stored in a *.txt file to reduce I/O latency and improve
	// overall program efficiency. Each line presents a learning topic, followed by three bullet-point details about the subject.	
	private static final String MOD4 = "******** MODULE 4: Java Classes Tutorial ********.\n";    
	private static final String MOD4_1 = "Lesson 4.1: Class Definition\n\ta) A class is a blueprint for creating objects.\n\tb) It defines the structure and behavior using fields and methods.\n\tc) Objects are created based on the class using the 'new' keyword.";
	private static final String MOD4_2 = "Lesson 4.2: Access Modifiers\n\ta) Use public, private, and protected to control visibility.\n\tb) Private members are only accessible within the class.\n\tc) Public members can be accessed from anywhere.";
	private static final String MOD4_3 = "Lesson 4.3: Class Members\n\ta) Fields store data; methods define actions.\n\tb) Members can be instance (per object) or static (shared).\n\tc) Use access modifiers to encapsulate and protect data.";
	private static final String MOD4_4 = "Lesson 4.4: Constructors\n\ta) Special methods used to initialize new objects.\n\tb) Can be overloaded with different parameter sets.\n\tc) Automatically called when an object is created.";
	private static final String MOD4_5 = "Lesson 4.5: The 'this' Keyword\n\ta) Refers to the current instance of the class.\n\tb) Helps resolve naming conflicts between fields and parameters.\n\tc) Can be used to chain constructors in a class.";
	private static final String MOD4_6 = "Lesson 4.6: Inheritance\n\ta) Allows a class to inherit properties and behavior from another.\n\tb) Use the 'extends' keyword to create a subclass.\n\tc) Promotes code reuse and a hierarchical design.";
	private static final String MOD4_7 = "Lesson 4.7: Method Overloading\n\ta) Multiple methods with the same name but different parameters.\n\tb) Helps in providing flexibility for different inputs.\n\tc) Java chooses the correct version based on the argument types.";
	private static final String MOD4_8 = "Lesson 4.8: Method Overriding\n\ta) A subclass redefines a method from its superclass.\n\tb) Must have the same signature and return type.\n\tc) Enables dynamic behavior through polymorphism.";
	private static final String MOD4_9 = "Lesson 4.9: Static Keyword\n\ta) Applies to members shared by all instances of a class.\n\tb) Can be accessed without creating an object.\n\tc) Often used for utility methods and constants.";
	private static final String MOD4_10 = "Lesson 4.10: Encapsulation\n\ta) Bundles data and behavior together inside a class.\n\tb) Hides internal state using private fields.\n\tc) Exposes safe access through public getters and setters.";
   	
	// The QUIZ4 constants are text strings for the module QUIZ. There are a total of ten multiple-choice questions.
	// Each quiz question is formatted as follows:
	//		QUIZ4_X: 				The quiz question (X = 1 through 10)
	//		QUIZ4_X_A:				Quiz question X, multiple choice A
	//		QUIZ4_X_A:				Quiz question X, multiple choice B
	//		QUIZ4_X_A:				Quiz question X, multiple choice C
	//		QUIZ4_X_A:				Quiz question X, multiple choice D
	//		QUIZ4_X_ANSWER:			Quiz answer X (the correct multiple-choice answer)
	//		QUIZ4_X_EXPLANATION:	Quiz explanation X (a brief explanation of the correct answer)

	// QUIZ 4 - QUESTION 1
    private static final String QUIZ4_1 = "What is the purpose of a class in Java?";
    private static final String QUIZ4_1_A = "To store only static methods";
    private static final String QUIZ4_1_B = "To define the structure and behavior of objects";
    private static final String QUIZ4_1_C = "To act as a built-in data type like int or float";
    private static final String QUIZ4_1_D = "To perform automatic memory management";
    private static final int QUIZ4_1_ANSWER = 2;
    private static final String QUIZ4_1_EXPLANATION = "A class is a blueprint that defines how objects are created and how they behave through fields and methods.";
  	
	// QUIZ 4 - QUESTION 2
    private static final String QUIZ4_2 = "Which keyword is used to inherit a class in Java?";
    private static final String QUIZ4_2_A = "implements";
    private static final String QUIZ4_2_B = "extends";
    private static final String QUIZ4_2_C = "inherits";
    private static final String QUIZ4_2_D = "super";
    private static final int QUIZ4_2_ANSWER = 2;
    private static final String QUIZ4_2_EXPLANATION = "Use the 'extends' keyword to derive a class from another (inheritance).";
  	
	// QUIZ 4 - QUESTION 3
    private static final String QUIZ4_3 = "What is the purpose of the 'static' keyword in Java?";
    private static final String QUIZ4_3_A = "To define a constant";
    private static final String QUIZ4_3_B = "To create an instance of a class";
    private static final String QUIZ4_3_C = "To define members shared by all instances of a class";
    private static final String QUIZ4_3_D = "To override a method";
    private static final int QUIZ4_3_ANSWER = 3;
    private static final String QUIZ4_3_EXPLANATION = "Static members belong to the class rather than any specific object.";
  	
	// QUIZ 4 - QUESTION 4
    private static final String QUIZ4_4 = "Which method is called when an object is created in Java?";
    private static final String QUIZ4_4_A = "main()";
    private static final String QUIZ4_4_B = "finalize()";
    private static final String QUIZ4_4_C = "constructor";
    private static final String QUIZ4_4_D = "init()";
    private static final int QUIZ4_4_ANSWER = 3;
    private static final String QUIZ4_4_EXPLANATION = "Constructors are invoked automatically to initialize new objects.";
    
	// QUIZ 4 - QUESTION 5
    private static final String QUIZ4_5 = "What is method overriding in the context of Java classes?";
    private static final String QUIZ4_5_A = "Writing multiple methods with the same name but different parameters";
    private static final String QUIZ4_5_B = "Using the 'super' keyword to call a parent method";
    private static final String QUIZ4_5_C = "Redefining a superclass method in a subclass";
    private static final String QUIZ4_5_D = "Assigning one object reference to another";
    private static final int QUIZ4_5_ANSWER = 3;
    private static final String QUIZ4_5_EXPLANATION = "Method overriding lets a subclass customize the behavior of an inherited method with the same signature.";
	
	// QUIZ 4 - QUESTION 6
    private static final String QUIZ4_6 = "Which of the following is not a valid access modifier in Java?";
    private static final String QUIZ4_6_A = "public";
    private static final String QUIZ4_6_B = "private";
    private static final String QUIZ4_6_C = "protected";
    private static final String QUIZ4_6_D = "internal";
    private static final int QUIZ4_6_ANSWER = 4;
    private static final String QUIZ4_6_EXPLANATION = "'internal' is used in other languages like C#, but not in Java.";
	
	// QUIZ 4 - QUESTION 7
    private static final String QUIZ4_7 = "What does encapsulation achieve in Java classes?";
    private static final String QUIZ4_7_A = "It allows access to private data from outside";
    private static final String QUIZ4_7_B = "It speeds up the execution of methods";
    private static final String QUIZ4_7_C = "It hides internal data using access control";
    private static final String QUIZ4_7_D = "It combines multiple classes into one file";
    private static final int QUIZ4_7_ANSWER = 3;
    private static final String QUIZ4_7_EXPLANATION = "Encapsulation protects internal state by making fields private and exposing controlled access through methods.";
	
	// QUIZ 4 - QUESTION 8
    private static final String QUIZ4_8 = "Which of the following is a wrapper class in Java?";
    private static final String QUIZ4_8_A = "int";
    private static final String QUIZ4_8_B = "Integer";
    private static final String QUIZ4_8_C = "float";
    private static final String QUIZ4_8_D = "double";
    private static final int QUIZ4_8_ANSWER = 2;
    private static final String QUIZ4_8_EXPLANATION = "'Integer' wraps the primitive 'int' in an object.";
	
	// QUIZ 4 - QUESTION 9
    private static final String QUIZ4_9 = "What is the purpose of the 'final' keyword in Java?";
    private static final String QUIZ4_9_A = "To define a constant";
    private static final String QUIZ4_9_B = "To prevent method overriding";
    private static final String QUIZ4_9_C = "To prevent inheritance";
    private static final String QUIZ4_9_D = "All of the above";
    private static final int QUIZ4_9_ANSWER = 4;
    private static final String QUIZ4_9_EXPLANATION = "'final' restricts variables, methods, or classes in various ways.";
	
	// QUIZ 4 - QUESTION 10
    private static final String QUIZ4_10 = "What is the role of a constructor in a Java class?";
    private static final String QUIZ4_10_A = "To override superclass methods";
    private static final String QUIZ4_10_B = "To perform static initialization";
    private static final String QUIZ4_10_C = "To initialize objects when they are created";
    private static final String QUIZ4_10_D = "To access private members directly";
    private static final int QUIZ4_10_ANSWER = 3;
    private static final String QUIZ4_10_EXPLANATION = "Constructors set up object state and are automatically called when a new instance is created..";
    
    /**
     * 	The displayModule_4 method displays the Module 4 lesson data to the user via the output console.
     * 	
     *  - Each lesson module lesson is displayed as a 3-bullet set of topics.
     *  - The user iterates through the topics by hitting the ENTER key to traverse to the next topic.
     *  - Upon reviewing the learning material, the user must complete a ten question multiple choice quiz.
     *  - In order to successfully complete the module, the user must score 60% or higher
     *  
     * 	@return completion status of the module
     */
    public static boolean displayModule_4(User user) 
    {
       // constant representing the number of module learning lessons and the number of quiz questions
       final int SIZE = 10;
 	   
       // Display Module 4 header message
 	   System.out.println(MOD4);      

 	   // Declare an array of module lessons and initialize with CONSTANT data text, MOD4_1 through MOD4_10
 	   String moduleLessons[] = {MOD4_1, MOD4_2, MOD4_3, MOD4_4, MOD4_5, MOD4_6, MOD4_7, MOD4_8, MOD4_9, MOD4_10,};
 	   
 	   // START MODULE FOUR TUTORIAL
 	   
 	   // Iterate through the SIZE=10 learning lessons in the moduleLessons[] array, and prompt
 	   // user to hit ENTER key to traverse to the next topic
 	   for (int i= 0; i < SIZE; i++)
 	   {
 	       System.out.println(moduleLessons[i]);
 	       user.setModuleLessonNumber(4,i+1);
 	       user.setModuleTimestamp(4, Timestamp.getDateTime());
 	       System.out.println("\nHit ENTER key to continue");
 	       scannerObj.nextLine();
 	   }
 	  
 	   // START MODULE FOUR QUIZ
 	   
 	   // Display quiz information
 	   System.out.println("Starting quiz for this module:");
 	   System.out.println("There are 10 multiple choice questions.");
 	   System.out.println("You must score 60% or higher to mark this module as COMPLETED!\n");
 	   
 	   // Declare integer quizResults and initialize to zero. The variable is incremented by return value
 	   // from the call to takeQuiz method defined in the Quiz class.  	   
 	   int quizResult = 0;
 	   
 	   // The constant quiz string data is passed via arguments for each of the SIZE=10 quiz questions.
 	   quizResult += Quiz.takeQuiz(MOD4, 1, QUIZ4_1, QUIZ4_1_A, QUIZ4_1_B, QUIZ4_1_C, QUIZ4_1_D, QUIZ4_1_ANSWER, QUIZ4_1_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 2, QUIZ4_2, QUIZ4_2_A, QUIZ4_2_B, QUIZ4_2_C, QUIZ4_2_D, QUIZ4_2_ANSWER, QUIZ4_2_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 3, QUIZ4_3, QUIZ4_3_A, QUIZ4_3_B, QUIZ4_3_C, QUIZ4_3_D, QUIZ4_3_ANSWER, QUIZ4_3_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 4, QUIZ4_4, QUIZ4_4_A, QUIZ4_4_B, QUIZ4_4_C, QUIZ4_4_D, QUIZ4_4_ANSWER, QUIZ4_4_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 5, QUIZ4_5, QUIZ4_5_A, QUIZ4_5_B, QUIZ4_5_C, QUIZ4_5_D, QUIZ4_5_ANSWER, QUIZ4_5_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 6, QUIZ4_6, QUIZ4_6_A, QUIZ4_6_B, QUIZ4_6_C, QUIZ4_6_D, QUIZ4_6_ANSWER, QUIZ4_6_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 7, QUIZ4_7, QUIZ4_7_A, QUIZ4_7_B, QUIZ4_7_C, QUIZ4_7_D, QUIZ4_7_ANSWER, QUIZ4_7_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 8, QUIZ4_8, QUIZ4_8_A, QUIZ4_8_B, QUIZ4_8_C, QUIZ4_8_D, QUIZ4_8_ANSWER, QUIZ4_8_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 9, QUIZ4_9, QUIZ4_9_A, QUIZ4_9_B, QUIZ4_9_C, QUIZ4_9_D, QUIZ4_9_ANSWER, QUIZ4_9_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD4, 10, QUIZ4_10, QUIZ4_10_A, QUIZ4_10_B, QUIZ4_10_C, QUIZ4_10_D, QUIZ4_10_ANSWER, QUIZ4_10_EXPLANATION);
 	   
 	   // Display the QUIZ result to the user via the console 	   
 	   System.out.println("\nYour score is " + quizResult + "%");
 	   user.setQuizScore(4, quizResult);
 	   user.setQuizTimestamp(4, Timestamp.getDateTime());
  	   
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
