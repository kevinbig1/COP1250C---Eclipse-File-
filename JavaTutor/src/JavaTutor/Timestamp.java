package JavaTutor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 	The Timpestamp class is used to format the date and time into a string for logging purposes.
 * 	
 */
public class Timestamp {
    
    /**
     * 	The getTimestamp() method creates a string representing the date and time, suitable for log files.
     *  
     * 	@return timestamp
     */
    public String getTimestamp() 
    {
    	
    	// Create the timestamp format using the DateTimeFormatter.ofPattern() method
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss");
        
        // Create a String using the formatted date/time pattern based on current system date/time
        String timestamp = LocalDateTime.now().format(formatter);
        
        // return the formated timestamp String
        return timestamp;
    }

    /**
     *  The getDateTime() method creates a string representing the date and time 
     *  in "MM/dd HH:mm" format.
     *
     *  @return short timestamp
     */
    public static String getDateTime() 
    {
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("MM/dd_HH:mm");
        return LocalDateTime.now().format(shortFormatter);
    }
}
