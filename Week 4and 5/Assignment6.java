
import java.util.Scanner;

public class HexagonalPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base side length and height: ");
        double a = sc.nextDouble(), h = sc.nextDouble();
        double area = (6 * a * h) + (3 * Math.sqrt(3) * a * a);
        System.out.println("Surface Area: " + area);
        sc.close();
    }
}
