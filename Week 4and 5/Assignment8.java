
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateManipulator {
    public static Date stringToDate(String dateStr) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.parse(dateStr);
    }

    public static String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public static long daysBetween(String date1, String date2) throws Exception {
        Date d1 = stringToDate(date1), d2 = stringToDate(date2);
        return TimeUnit.DAYS.convert(d2.getTime() - d1.getTime(), TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Days Between: " + daysBetween("01-01-2022", "10-01-2022"));
    }
}
