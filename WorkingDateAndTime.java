package InnerClasses;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date:"+date);
        LocalTime time= LocalTime.now();
        System.out.println("Time:"+time);
        LocalTime dateTime=LocalTime.now();
        System.out.println("Date &v Time:"+dateTime);
        /*Display the day of the month
        Display the day of year
        E-Name of the day:(Mon-sun)
                 D-Day of the year
                 dd-day of the month(1-366)(including leap year)
                 N-Month number(1-12)
                 MMM-month name-jan-dec
                 */
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMM dd YYYY");
        String FormattedDateTime=dateTime.format(format);
        System.out.println("Formated Date:" + FormattedDateTime);
    }
}
