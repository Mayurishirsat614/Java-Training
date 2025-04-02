
import java.util.Scanner;

public class WindSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (°C) and wind speed (km/h): ");
        double t = sc.nextDouble(), v = sc.nextDouble();
        double windChill = 13.12 + 0.6215 * t - 11.37 * Math.pow(v, 0.16) + 0.3965 * t * Math.pow(v, 0.16);
        System.out.println("Wind Chill: " + windChill);
        sc.close();
    }
}
