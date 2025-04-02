
import java.util.Scanner;

public class VehicleLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate (%), time (years): ");
        double P = sc.nextDouble(), R = sc.nextDouble(), T = sc.nextDouble();
        R = R / (12 * 100);
        T = T * 12;
        double EMI = (P * R * Math.pow(1 + R, T)) / (Math.pow(1 + R, T) - 1);
        System.out.println("EMI: " + EMI);
        sc.close();
    }
}
