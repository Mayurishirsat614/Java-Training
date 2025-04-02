
import java.util.Scanner;

public class RectangularPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, width, and height: ");
        double l = sc.nextDouble(), w = sc.nextDouble(), h = sc.nextDouble();
        double area = 2 * (l * w + w * h + l * h);
        System.out.println("Surface Area: " + area);
        sc.close();
    }
}
