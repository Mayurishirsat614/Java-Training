
import java.util.Scanner;

public class DaysToYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        int years = days / 365;
        int weeks = (days % 365) / 7;
        int remainingDays = (days % 365) % 7;
        System.out.println(years + " years, " + weeks + " weeks, and " + remainingDays + " days.");
        sc.close();
    }
}
