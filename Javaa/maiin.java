import java.util.Date;
import java.util.Calendar;
import java.util.DateFormat;
import java.util.SimpleDateFormat;

public class maiin{
public static void main(String[] args){
Date date = new Date();
DateFormat dateformat = new SimpleDateFormat();
System.out.println("current date and time:"+ date.format(date));
Calendar calendar =  Calendar.getInstance();
System.out.println("current year:"+calendar.get(calendar.YEAR));
System.out.println("current month"+(calendar.get(Calendar.MONTH)+1));
}
}