package JavaTutor;

import java.util.Scanner;

/**
 * 	The Module_FileOperations class is the third module in the Java Tutorial program.
 * 	
 * 	The class displays ten 3-bullet lessons about File Operations in the Java programming language,
 * 	followed by a ten question quiz. In order to successfully complete the module, the user must
 * 	score 60% or higher
 * 	
 */

public class Module_FileOperations 
	{
	// Create a Scanner object to read user input via System.in
	static Scanner scannerObj = new Scanner(System.in);
	
	// The MOD3 constants are text strings that are displayed to the console as part of the Java Tutorial for the File Operations module.
	// A design decision was made to use static in-line strings rather than data stored in a *.txt file to reduce I/O latency and improve
	// overall program efficiency. Each line presents a learning topic, followed by three bullet-point details about the subject.
	private static final String MOD3 = "******** MODULE 3: Java File Operations Tutorial ********\n";
    private static final String MOD3_1 = "Lesson 3.1: Understanding the File Class\n\ta) Use java.io.File to represent file or directory paths.\n\tb) Can be used for both relative and absolute paths.\n\tc) Enables access to file metadata and basic file actions.";
    private static final String MOD3_2 = "Lesson 3.2: Checking File Existence\n\ta) Use file.exists() to verify if the file is present.\n\tb) Combine with file.isFile() or file.isDirectory() for type check.\n\tc) Helps prevent errors when performing operations like reading.";
    private static final String MOD3_3 = "Lesson 3.3: Creating a New File\n\ta) Use file.createNewFile() to make an empty file.\n\tb) Returns true if file was created, false if it already exists.\n\tc) Must handle IOException with try/catch or throws.";
    private static final String MOD3_4 = "Lesson 3.4: Writing to Files\n\ta) Use FileWriter for basic writing, BufferedWriter for efficiency.\n\tb) Always close the writer to avoid memory leaks.\n\tc) Optionally use FileWriter(file, true) to append content.";
    private static final String MOD3_5 = "Lesson 3.5: Reading from Files\n\ta) FileReader + BufferedReader is best for text files.\n\tb) Use readLine() inside a loop to process lines.\n\tc) Always close the reader to release system resources.";
    private static final String MOD3_6 = "Lesson 3.6: Renaming Files\n\ta) Use file.renameTo(newFile) to rename or move a file.\n\tb) Works only if both source and target are valid.\n\tc) Returns true if successful; false otherwise.";
    private static final String MOD3_7 = "Lesson 3.7: Retrieving File Properties\n\ta) getName() returns the file name only.\n\tb) length() gives the file size in bytes.\n\tc) getAbsolutePath() or getPath() gives location info.";
    private static final String MOD3_8 = "Lesson 3.8: Getting Last Modified Date\n\ta) Use file.lastModified() to fetch timestamp of last change.\n\tb) Returns milliseconds since epoch (can convert to Date).\n\tc) Useful for sorting, syncing, or archiving decisions.";
    private static final String MOD3_9 = "Lesson 3.9: Using Try-With-Resources\n\ta) Automatically closes stream when done (Java 7+).\n\tb) Works with any class implementing AutoCloseable.\n\tc) Cleaner, safer alternative to manual stream closing.";
    private static final String MOD3_10 = "Lesson 3.10: Handling Exceptions\n\ta) Catch IOException to handle most file errors.\n\tb) Use finally or try-with-resources for cleanup.\n\tc) Prevents app crashes from unexpected file issues.";
       	
    // The QUIZ3 constants are text strings for the module QUIZ. There are a total of ten multiple-choice questions.
    // Each quiz question is formatted as follows:
    //		QUIZ3_X: 				The quiz question (X = 1 through 10)
    //		QUIZ3_X_A:				Quiz question X, multiple choice A
    //		QUIZ3_X_A:				Quiz question X, multiple choice B
    //		QUIZ3_X_A:				Quiz question X, multiple choice C
    //		QUIZ3_X_A:				Quiz question X, multiple choice D
    //		QUIZ3_X_ANSWER:			Quiz answer X (the correct multiple-choice answer)
    //		QUIZ3_X_EXPLANATION:	Quiz explanation X (a brief explanation of the correct answer)
    
    // QUIZ 3 - QUESTION 1
    private static final String QUIZ3_1 = "What does the java.io.File class represent?";
    private static final String QUIZ3_1_A = "Only files stored on the local disk";
    private static final String QUIZ3_1_B = "Paths to files or directories";
    private static final String QUIZ3_1_C = "Only directories in the file system";
    private static final String QUIZ3_1_D = "Temporary files created during runtime";
    private static final int QUIZ3_1_ANSWER = 2;
    private static final String QUIZ3_1_EXPLANATION = "The java.io.File class represents paths to files or directories, allowing access to their metadata and basic operations.";

    // QUIZ 3 - QUESTION 2
    private static final String QUIZ3_2 = "Which method checks if a file exists?";
    private static final String QUIZ3_2_A = "file.isFile()";
    private static final String QUIZ3_2_B = "file.isDirectory()";
    private static final String QUIZ3_2_C = "file.exists()";
    private static final String QUIZ3_2_D = "file.createNewFile()";
    private static final int QUIZ3_2_ANSWER = 3;
    private static final String QUIZ3_2_EXPLANATION = "The file.exists() method checks if a file or directory exists at the specified path.";

    // QUIZ 3 - QUESTION 3
    private static final String QUIZ3_3 = "What does the file.createNewFile() method return if the file already exists?";
    private static final String QUIZ3_3_A = "true";
    private static final String QUIZ3_3_B = "false";
    private static final String QUIZ3_3_C = "an IOException";
    private static final String QUIZ3_3_D = "null";
    private static final int QUIZ3_3_ANSWER = 2;
    private static final String QUIZ3_3_EXPLANATION = "The file.createNewFile() method returns false if the file already exists, as it does not overwrite existing files.";

    // QUIZ 3 - QUESTION 4
    private static final String QUIZ3_4 = "What does the file.renameTo(newFile) method do?";
    private static final String QUIZ3_4_A = "Deletes the file";
    private static final String QUIZ3_4_B = "Renames or moves the file";
    private static final String QUIZ3_4_C = "Copies the file to a new location";
    private static final String QUIZ3_4_D = "Changes the file's permissions";
    private static final int QUIZ3_4_ANSWER = 2;
    private static final String QUIZ3_4_EXPLANATION = ("The file.renameTo(newFile) method renames or moves the file to the specified new locaiton.");

    // QUIZ 3 - QUESTION 5
    private static final String QUIZ3_5 = "Which method retrieves the size of a file in bytes?";
    private static final String QUIZ3_5_A = "file.getName()";
    private static final String QUIZ3_5_B = "file.length()";
    private static final String QUIZ3_5_C = "file.getAbsolutePath()";
    private static final String QUIZ3_5_D = "file.lastModified()";
    private static final int QUIZ3_5_ANSWER = 2;
    private static final String QUIZ3_5_EXPLANATION = ("The file.length() method returns the size of the file in bytes.");

    // QUIZ 3 - QUESTION 6
    private static final String QUIZ3_6 = "What does the file.lastModified() method return?";
    private static final String QUIZ3_6_A = "The file's creation date";
    private static final String QUIZ3_6_B = "The file's last modified timestamp in milliseconds since epoch";
    private static final String QUIZ3_6_C = "The file's size in bytes";
    private static final String QUIZ3_6_D = "The file's permissions";
    private static final int QUIZ3_6_ANSWER = 2;
    private static final String QUIZ3_6_EXPLANATION = ("The file.lastModified() method returns the last modified timestamp in milliseconds since epoch.");

    // QUIZ 3 - QUESTION 7
    private static final String QUIZ3_7 = "Which method checks if a file is readable?";
    private static final String QUIZ3_7_A = "file.canRead()";
    private static final String QUIZ3_7_B = "file.canWrite()";
    private static final String QUIZ3_7_C = "file.canExecute()";
    private static final String QUIZ3_7_D = "file.isReadable()";
    private static final int QUIZ3_7_ANSWER = 1;
    private static final String QUIZ3_7_EXPLANATION = ("The file.canRead() methods checks if the file is readable.");

    // QUIZ 3 - QUESTION 8
    private static final String QUIZ3_8 = "What is the purpose of the try-with-resources in Java?";
    private static final String QUIZ3_8_A = "To automatically close resources after use";
    private static final String QUIZ3_8_B = "To handle exceptions without a catch block";
    private static final String QUIZ3_8_C = "To create temporary files during runtime";
    private static final String QUIZ3_8_D = "To improve file writing speed";
    private static final int QUIZ3_8_ANSWER = 1;
    private static final String QUIZ3_8_EXPLANATION = ("The try-with-resources statement automatically closes resources (like streams) after use, ensuring proper cleanup.");

    // QUIZ 3 - QUESTION 9
    private static final String QUIZ3_9 = "What exception must be handled when user file.createNewFile()?";
    private static final String QUIZ3_9_A = "NullPointerException";
    private static final String QUIZ3_9_B = "IOException";
    private static final String QUIZ3_9_C = "FileNotFoundException";
    private static final String QUIZ3_9_D = "SecurityException";
    private static final int QUIZ3_9_ANSWER = 2;
    private static final String QUIZ3_9_EXPLANATION = ("The file.createNewFile() method can throw an IOException, which must be handles or declared in the method signature.");

    // QUIZ 3 - QUESTION 10
    private static final String QUIZ3_10 = "Which method retrieves the name of a file?";
    private static final String QUIZ3_10_A = "file.getName()";
    private static final String QUIZ3_10_B = "file.getAbsolutePath()";
    private static final String QUIZ3_10_C = "file.length()";
    private static final String QUIZ3_10_D = "file.lastModified()";
    private static final int QUIZ3_10_ANSWER = 1;
    private static final String QUIZ3_10_EXPLANATION = ("The file.getName() method retrieves the name of the file.");
    
    /**
     * 	The displayModule_3 method displays the Module 3 lesson data to the user via the output console.
     * 	
     *  - Each lesson module lesson is displayed as a 3-bullet set of topics.
     *  - The user iterates through the topics by hitting the ENTER key to traverse to the next topic.
     *  - Upon reviewing the learning material, the user must complete a ten question multiple choice quiz.
     *  - In order to successfully complete the module, the user must score 60% or higher
     *  
     * 	@return completion status of the module
     */
    public static boolean displayModule_3(User user) 
    {    
       // constant representing the number of module learning lessons and the number of quiz questions
       final int SIZE = 10;
 	   
       // Display Module 3 header message
 	   System.out.println(MOD3);       

 	   // Declare an array of module lessons and initialize with CONSTANT data text, MOD3_1 through MOD3_10
 	   String moduleLessons[] = {MOD3_1, MOD3_2, MOD3_3, MOD3_4, MOD3_5, MOD3_6, MOD3_7, MOD3_8, MOD3_9, MOD3_10,};
 	   
 	   // START MODULE THREE TUTORIAL
 	   
 	   // Iterate through the SIZE=10 learning lessons in the moduleLessons[] array, and prompt
 	   // user to hit ENTER key to traverse to the next topic
 	   for (int i= 0; i < SIZE; i++)
 	   {
 	       System.out.println(moduleLessons[i]);
 	       user.setModuleLessonNumber(3,i+1);
 	       user.setModuleTimestamp(3, Timestamp.getDateTime());
 	       System.out.println("\nHit ENTER key to continue");
 	       scannerObj.nextLine();
 	   }
 	  
 	   // START MODULE THREE QUIZ
 	   
 	   // Display quiz information
 	   System.out.println("Starting quiz for this module:");
 	   System.out.println("There are 10 multiple choice questions.");
 	   System.out.println("You must score 60% or higher to mark this module as COMPLETED!\n");
 	   
 	   // Declare integer quizResults and initialize to zero. The variable is incremented by return value
 	   // from the call to takeQuiz method defined in the Quiz class. 
 	   int quizResult = 0;
 	   
 	   // The constant quiz string data is passed via arguments for each of the SIZE=10 quiz questions.
 	   quizResult += Quiz.takeQuiz(MOD3, 1, QUIZ3_1, QUIZ3_1_A, QUIZ3_1_B, QUIZ3_1_C, QUIZ3_1_D, QUIZ3_1_ANSWER, QUIZ3_1_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 2, QUIZ3_2, QUIZ3_2_A, QUIZ3_2_B, QUIZ3_2_C, QUIZ3_2_D, QUIZ3_2_ANSWER, QUIZ3_2_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 3, QUIZ3_3, QUIZ3_3_A, QUIZ3_3_B, QUIZ3_3_C, QUIZ3_3_D, QUIZ3_3_ANSWER, QUIZ3_3_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 4, QUIZ3_4, QUIZ3_4_A, QUIZ3_4_B, QUIZ3_4_C, QUIZ3_4_D, QUIZ3_4_ANSWER, QUIZ3_4_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 5, QUIZ3_5, QUIZ3_5_A, QUIZ3_5_B, QUIZ3_5_C, QUIZ3_5_D, QUIZ3_5_ANSWER, QUIZ3_5_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 6, QUIZ3_6, QUIZ3_6_A, QUIZ3_6_B, QUIZ3_6_C, QUIZ3_6_D, QUIZ3_6_ANSWER, QUIZ3_6_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 7, QUIZ3_7, QUIZ3_7_A, QUIZ3_7_B, QUIZ3_7_C, QUIZ3_7_D, QUIZ3_7_ANSWER, QUIZ3_7_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 8, QUIZ3_8, QUIZ3_8_A, QUIZ3_8_B, QUIZ3_8_C, QUIZ3_8_D, QUIZ3_8_ANSWER, QUIZ3_8_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 9, QUIZ3_9, QUIZ3_9_A, QUIZ3_9_B, QUIZ3_9_C, QUIZ3_9_D, QUIZ3_9_ANSWER, QUIZ3_9_EXPLANATION);
 	   quizResult += Quiz.takeQuiz(MOD3, 10, QUIZ3_10, QUIZ3_10_A, QUIZ3_10_B, QUIZ3_10_C, QUIZ3_10_D, QUIZ3_10_ANSWER, QUIZ3_10_EXPLANATION);
 	   
 	   // Display the QUIZ result to the user via the console
 	   System.out.println("\nYour score is " + quizResult + "%");
 	   user.setQuizScore(3, quizResult);
 	   user.setQuizTimestamp(3, Timestamp.getDateTime());
  	   
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
