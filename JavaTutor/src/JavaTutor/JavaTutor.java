package JavaTutor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaTutor {
    
	public static Scanner scanner1 = new Scanner(System.in);
	public static String username;
	public static String password;
		
	public static void main(String[] args) {

		// create a Time-stamp object for log file entries
		Timestamp ts = new Timestamp();
		
		boolean complete = false;
		boolean mod1complete = false;
		boolean mod2complete = false;
		boolean mod3complete = false;
		boolean mod4complete = false;
		boolean exit = false;
		boolean login = false;
		
		// Constants for the four tutor modules
		final int MOD_1 = 1;
		final int MOD_2 = 2;
		final int MOD_3 = 3;
		final int MOD_4 = 4;
		
		// Flag used to signify user has not taken quiz yet
		final String NO_QUIZ = "00/00_00:00";
		// Variable for recording time-stamp of quiz completions
		String quizDate = "";

		System.out.println("\nWelcome to the JAVA TUTORIAL program!\n");
		
		// create a User object with default constructor (default status of modules/quizzes)
		User user = new User();
		
		//validates user
		while (login == false && exit == false)
		{
				//get user-name
				System.out.println("Please input your username or press only enter to exit\n");
				username = scanner1.nextLine();
				// call User mutator to store user-name in user object
				user.setUserID(username);
				if (!username.equals(""))
				{
					try
					{
						FileWriter fwriter = new FileWriter(username + ".txt",true);
						File fileObj = new File(username + ".txt");
						Scanner scannerObj = new Scanner(fileObj);
							
						if (scannerObj.hasNextLine())
						{
							//password already exists
							System.out.println("Please input your password");
							password = scannerObj.nextLine();
							// call User mutator to store password in user object
							user.setPassword(password);
							if (scanner1.nextLine().equals(password))
							{
								login = true;
								System.out.println("Login successful");
							}
							else
								System.out.println("Invalid password");
						}
						else
						{
							try
							{
								//password does not exist
								System.out.println("New User detected, please select a password: ");
								password = scanner1.nextLine();
								// update logfile using Timestamp getTimestamp() method and User object data
								// for status of modules and quiz results
								fwriter.write(password + "\n");
								fwriter.write(ts.getTimestamp() + " Module-1 " + mod1complete  + " QUIZ_SCORE " + 
										user.getQuizScore(MOD_1) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_1) + "\n");
								fwriter.write(ts.getTimestamp() + " Module-2 " + mod2complete  + " QUIZ_SCORE " + 
										user.getQuizScore(MOD_2) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_2) + "\n");
								fwriter.write(ts.getTimestamp() + " Module-3 " + mod3complete  + " QUIZ_SCORE " + 
										user.getQuizScore(MOD_3) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_3) + "\n");
								fwriter.write(ts.getTimestamp() + " Module-4 " + mod4complete  +  " QUIZ_SCORE " + 
										user.getQuizScore(MOD_4) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_4) + "\n");								
								login = true;
							}
							catch(IOException e)
							{
								System.out.println("An Exception occurred!");
							}

						}
						scannerObj.close();
						fwriter.close();
					}
					catch(IOException e)
					{
						System.out.println("An Exception occurred!");
					}
				}
				else
					exit = true;
		}
		
		//begin modules
		
		while (login == true && exit == false && complete == false)
		{
			//reads progress stored on file
			try
			{
				File fileObj = new File(username + ".txt");
				Scanner scannerObj = new Scanner(fileObj);
				//skips password line
				scannerObj.nextLine();
				
				// *** MODULE_1 ***
				// retrieve logfile entry with status info of MOD_1
				String line = scannerObj.nextLine();
				// split logfile string into separate tokens using whitespace as separator
				String[] tokens = line.split(" ");
				// tokens[0] = timestamp
				// tokens[1] = module name
				// tokens[2] = completion status (true or false)
				// tokens[3] = QUIZ_SCORE constant
				// tokens[4] = quiz result (0 to 100)
				// tokens[5] = QUIZ_DATE constant
				// tokens[6] = quiz date/time completion
				// call User mutator setQuizScore() to store quiz score in User object 
				user.setQuizScore(MOD_1, Integer.parseInt(tokens[4]));
				// call User mutator setQuizTimestamp() to store quiz timestamp in User object
				user.setQuizTimestamp(MOD_1, tokens[6]);
				// check module completion status extracted from logfile
				if (tokens[2].equals("true"))
					mod1complete = true;

				// *** MODULE_2 ***
				// retrieve logfile entry with status info of MOD_2
				line = scannerObj.nextLine();
				// split logfile string into separate tokens using whitespace as separator
				tokens = line.split(" ");
				// call User mutator setQuizScore() to store quiz score in User object
				user.setQuizScore(MOD_2, Integer.parseInt(tokens[4]));
				// call User mutator setQuizTimestamp() to store quiz timestamp in User object
				user.setQuizTimestamp(MOD_2, tokens[6]);
				// check module completion status extracted from logfile
				if (tokens[2].equals("true"))
					mod2complete = true;

				// *** MODULE_3 ***
				// retrieve logfile entry with status info of MOD_3
				line = scannerObj.nextLine();
				// split logfile string into separate tokens using whitespace as separator
				tokens = line.split(" ");
				// call User mutator setQuizScore() to store quiz score in User object
				user.setQuizScore(MOD_3, Integer.parseInt(tokens[4]));
				// call User mutator setQuizTimestamp() to store quiz timestamp in User object
				user.setQuizTimestamp(MOD_3, tokens[6]);
				// check module completion status extracted from logfile
				if (tokens[2].equals("true"))
					mod3complete = true;

				// *** MODULE_4 ***
				// retrieve logfile entry with status info of MOD_4
				line = scannerObj.nextLine();
				// split logfile string into separate tokens using whitespace as separator
				tokens = line.split(" ");
				// call User mutator setQuizScore() to store quiz score in User object
				user.setQuizScore(MOD_4, Integer.parseInt(tokens[4]));
				// call User mutator setQuizTimestamp() to store quiz timestamp in User object
				user.setQuizTimestamp(MOD_4, tokens[6]);
				// check module completion status extracted from logfile
				if (tokens[2].equals("true"))
					mod4complete = true;
					
				// close Scanner object
				scannerObj.close();
				
				// update logfile using Timestamp getTimestamp() method and User object data
				// via class accessors for status of modules and quiz results
				FileWriter fwriter = new FileWriter(username + ".txt");
				fwriter.write(password + "\n");
				fwriter.write(ts.getTimestamp() + " Module-1 " + mod1complete  + " QUIZ_SCORE " + 
						user.getQuizScore(MOD_1) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_1) + "\n");
				fwriter.write(ts.getTimestamp() + " Module-2 " + mod2complete  + " QUIZ_SCORE " + 
						user.getQuizScore(MOD_2) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_2) + "\n");
				fwriter.write(ts.getTimestamp() + " Module-3 " + mod3complete  + " QUIZ_SCORE " + 
						user.getQuizScore(MOD_3) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_3) + "\n");
				fwriter.write(ts.getTimestamp() + " Module-4 " + mod4complete  +  " QUIZ_SCORE " + 
						user.getQuizScore(MOD_4) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_4) + "\n");
				fwriter.close();
			}
			catch(IOException e)
			{
				System.out.println("An Exception occurred!");
			}
			
			// display menu header text
			System.out.println("Please select a Java Tutor Module or choose to exit");
			System.out.println("   MENU OPTION                      MODULE COMPLETED?");
			System.out.println("-----------------------------------------------------");
			
			// format MOD1 output
			// get MOD_1 quiz timestamp via User object's getQuizTimestamp() accessor method
			quizDate = user.getQuizTimestamp(MOD_1);
			// if quizDate equals NO_QUIZ flag, display module results without quiz_score and quiz_date
			if (quizDate.equals(NO_QUIZ))
				System.out.println("1. Module 1 - Java Data Types      " + " COMPLETE = " + mod1complete);
			// if quizDate NOT equals NO_QUIZ flag, display module results with quiz_score and quiz_date
			else
				System.out.println("1. Module 1 - Java Data Types      " + " COMPLETE = " + mod1complete  + " --> QUIZ_SCORE = " + 
						user.getQuizScore(MOD_1) + "% QUIZ_DATE = " + user.getQuizTimestamp(MOD_1));
			
			// format MOD2 output
			// get MOD_2 quiz timestamp via User object's getQuizTimestamp() accessor method
			quizDate = user.getQuizTimestamp(MOD_2);
			// if quizDate equals NO_QUIZ flag, display module results without quiz_score and quiz_date
			if (quizDate.equals(NO_QUIZ))
				System.out.println("2. Module 2 - Java Loops           " + " COMPLETE = " + mod2complete);
			// if quizDate NOT equals NO_QUIZ flag, display module results with quiz_score and quiz_date
			else
				System.out.println("2. Module 2 - Java Loops           " + " COMPLETE = " + mod2complete  + " --> QUIZ_SCORE = " + 
						user.getQuizScore(MOD_2) + "% QUIZ_DATE = " + user.getQuizTimestamp(MOD_2));
			
			// format MOD3 output
			// get MOD_3 quiz timestamp via User object's getQuizTimestamp() accessor method
			quizDate = user.getQuizTimestamp(MOD_3);
			// if quizDate equals NO_QUIZ flag, display module results without quiz_score and quiz_date
			if (quizDate.equals(NO_QUIZ))
				System.out.println("3. Module 3 - File Operations      " + " COMPLETE = " + mod3complete);
			// if quizDate NOT equals NO_QUIZ flag, display module results with quiz_score and quiz_date
			else
				System.out.println("3. Module 3 - File Operations      " + " COMPLETE = " + mod3complete  + " --> QUIZ_SCORE = " + 
						user.getQuizScore(MOD_3) + "% QUIZ_DATE = " + user.getQuizTimestamp(MOD_3));
				
			// format MOD4 output
			// get MOD_4 quiz timestamp via User object's getQuizTimestamp() accessor method
			quizDate = user.getQuizTimestamp(MOD_4);
			// if quizDate equals NO_QUIZ flag, display module results without quiz_score and quiz_date
			if (quizDate.equals(NO_QUIZ))
				System.out.println("4. Module 4 - Java Classes         " + " COMPLETE = " + mod4complete);
			// if quizDate NOT equals NO_QUIZ flag, display module results with quiz_score and quiz_date
			else
				System.out.println("4. Module 4 - Java Classes         " + " COMPLETE = " + mod4complete  + " --> QUIZ_SCORE = " + 
						user.getQuizScore(MOD_4) + "% QUIZ_DATE = " + user.getQuizTimestamp(MOD_4));
	
			System.out.println("5. Exit");
			System.out.println("-----------------------------------------------------");

			int option;
			option = scanner1.nextInt();
			scanner1.nextLine();
			
			
			switch (option)
			{	
				case 1:
					// call displayModulule_3() method with USER object argument and result from return value
					mod1complete = Module_DataTypes.displayModule_1(user);
					break;
				case 2:
					// call displayModulule_3() method with USER object argument and result from return value
					mod2complete = Module_Loops.displayModule_2(user);
					break;
				case 3:
					// call displayModulule_3() method with USER object argument and result from return value
					mod3complete = Module_FileOperations.displayModule_3(user);
					break;
				case 4:
					// call displayModulule_4() method with USER object argument and result from return value
					mod4complete = Module_Classes.displayModule_4(user);
					break;										
				case 5:
					// set exit flag to TRUE based on user input
					exit = true;
					System.out.println("Thank you for using the Java Tutorial program. Good bye . . . ");
					break;
				default:
					System.out.println("Invalid Option");
					break;
			}		
			try
			{
			//updates logfile after taking module quiz
			FileWriter fwriter = new FileWriter(username + ".txt");
			fwriter.write(password + "\n");
			fwriter.write(ts.getTimestamp() + " Module-1 " + mod1complete  + " QUIZ_SCORE " + 
					user.getQuizScore(MOD_1) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_1) + "\n");
			fwriter.write(ts.getTimestamp() + " Module-2 " + mod2complete  + " QUIZ_SCORE " + 
					user.getQuizScore(MOD_2) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_2) + "\n");
			fwriter.write(ts.getTimestamp() + " Module-3 " + mod3complete  + " QUIZ_SCORE " + 
					user.getQuizScore(MOD_3) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_3) + "\n");
			fwriter.write(ts.getTimestamp() + " Module-4 " + mod4complete  +  " QUIZ_SCORE " + 
					user.getQuizScore(MOD_4) + " QUIZ_DATE " + user.getQuizTimestamp(MOD_4) + "\n");
			fwriter.close();
			}

			catch(IOException e)
			{
				System.out.println("An Exception occurred!");
			}
			
			
			if (mod1complete == true && mod2complete == true && mod3complete == true && mod4complete == true)
				{
				complete = true;
				System.out.println("You have completed all the modules!");
				
				}

		}
		scanner1.close();
	}

}
