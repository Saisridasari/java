import java.util.Calendar;
public class CalenderExample
{
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int dayofMonth=calendar.get(Calendar.DATE);
        System.out.println("Current Year: " +year);
        System.out.println("Current Month: " + (month+1));
        System.out.println("Day of the Month: " + dayofMonth);

    }
}