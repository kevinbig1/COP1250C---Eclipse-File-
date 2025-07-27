package JavaTutor;

public class User {

	// constant for number of modules in Java Tutor program
	private final int MOD_COUNT = 4;
	
	// private class fields
	private String userID = "";
	private String password = "";
	private String moduleTimestamp[];
	private int moduleLessonNumber[];
	private String quizTimestamp[];
	private int quizScore[];
	
	// default class constructor
	public User()
	{
		// initialize userID and password fields with null values
		userID = "";
		password = "";
		// Initialize arrays with size MOD_COUNT
		// and instantiate arrays for module-related user members
        moduleTimestamp = new String[MOD_COUNT];
        moduleLessonNumber = new int[MOD_COUNT];
        quizTimestamp = new String[MOD_COUNT];
        quizScore = new int[MOD_COUNT];
        
        // initialize each array element (one for each module) with default values 
        // these are baseline values before starting module lessons
        for (int i = 0; i < MOD_COUNT; i++) {
            moduleTimestamp[i] = "00/00_00:00";
            moduleLessonNumber[i] = 0;
            quizTimestamp[i] = "00/00_00:00";
            quizScore[i] = 0;
        }
	}

	// class constructor #1 instantiates User object with userID and password parameters
	public User(String u, String p)
	{
		// initialize userID and password fields with parameter values
		userID = u;
		password = p;
		// Initialize arrays with size MOD_COUNT
		// and instantiate arrays for module-related user members
        moduleTimestamp = new String[MOD_COUNT];
        moduleLessonNumber = new int[MOD_COUNT];
        quizTimestamp = new String[MOD_COUNT];
        quizScore = new int[MOD_COUNT];
        
        // initialize each array element (one for each module) with default values 
        // these are baseline values before starting module lessons
        for (int i = 0; i < MOD_COUNT; i++) {
            moduleTimestamp[i] = "00/00_00:00";
            moduleLessonNumber[i] = 0;
            quizTimestamp[i] = "00/00_00:00";
            quizScore[i] = 0;
        }
	}
	
	// mutator methods
	// set userID field of User object
	public void setUserID(String uid)
	{
		userID = uid;
	}

	// set password field of User object
	public void setPassword(String pw)
	{
		password = pw;
	}

	// set time-stamp field of User object array using module-number and time-stamp passed via parameters
	public void setModuleTimestamp(int module, String ts)
	{
		moduleTimestamp[module-1] = ts;
	}

	// set module-number field of User object array using module-number and lesson-number passed via parameters
	// NOTE: This method is not currently used but has been included for future implementation of book-mark
	// feature to allow user to enter/leave module lesson and return at future time to complete the lesson
	public void setModuleLessonNumber(int module, int ln)
	{
		moduleLessonNumber[module-1] = ln;
	}

	// set MODULE time-stamp field of User object array using module-number and MODULE time-stamp passed via parameters
	// NOTE: This method is not currently used but has been included for future implementation of book-mark
	// feature to allow user to enter/leave module lesson and return at future time to complete the lesson
	public void setQuizTimestamp(int module, String ts)
	{
		quizTimestamp[module-1] = ts;
	}

	// set quiz-score field of User object array using module-number and quiz-score passed via parameters
	public void setQuizScore(int module, int qs)
	{
		quizScore[module-1] = qs;
	}
	
	// Assessor methods
	// return userID field
	public String getUserID()
	{
		return userID;
	}
	
	// return password field
	public String getPassword()
	{
		return password;
	}
	
	// return module time-stamp field of array
	// NOTE: This method is not currently used but has been included for future implementation of bookmark
	// feature to allow user to enter/leave module lesson and return at future time to complete the lesson
	public String getModuleTimestamp(int module)
	{
		return moduleTimestamp[module-1];
	}

	// return module lesson-number field of array
	// NOTE: This method is not currently used but has been included for future implementation of bookmark
	// feature to allow user to enter/leave module lesson and return at future time to complete the lesson
	public int getModuleLessonNumber(int module)
	{
		return moduleLessonNumber[module-1];
	}

	// return quiz time-stamp field of array
	public String getQuizTimestamp(int module)
	{
		return quizTimestamp[module-1];
	}

	// return quiz score field of array
	public int getQuizScore(int module)
	{
		return quizScore[module-1];
	}
}
