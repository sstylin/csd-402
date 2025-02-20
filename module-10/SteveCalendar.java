
/*  Steve Stylin Module 10: Calendar & GregorianCalendar Classes*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class SteveCalendar {
    public static void main(String[] args) {
        // Create a GregorianCalendar instance for the current year
        GregorianCalendar currentYear = new GregorianCalendar();
        currentYear.set(Calendar.MONTH, Calendar.FEBRUARY);
        currentYear.set(Calendar.DAY_OF_MONTH, 14);

        // Create a GregorianCalendar instance for the current date
        GregorianCalendar today = new GregorianCalendar();
        
        // Format the date
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        
        System.out.println("Today's date: " + sdf.format(today.getTime()));
        // Display Valentine's Day for the current year
        System.out.println("Valentine's Day this year was: " + sdf.format(currentYear.getTime()));
        
        // Create a GregorianCalendar instance for the next year
        GregorianCalendar nextYear = new GregorianCalendar();
        nextYear.add(Calendar.YEAR, 1);
        nextYear.set(Calendar.MONTH, Calendar.FEBRUARY);
        nextYear.set(Calendar.DAY_OF_MONTH, 14);
        
        // Display Valentine's Day for the next year
        System.out.println("Valentine's Day next year will be: " + sdf.format(nextYear.getTime()));
    }
}
