import java.util.Calendar;
public class FixedDateCalendarExample
{
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int dayofMonth=calendar.get(Calendar.DATE);
        System.out.println("Fixed Date: " + year + "-" + (month+1) + "-" + dayofMonth);
    }
}