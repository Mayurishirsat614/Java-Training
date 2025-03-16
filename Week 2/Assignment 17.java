import java.util.Scanner;

public class SquareRoot {
    public static double squareRoot(int num) {
        double temp, sqrt = num / 2.0;
        do {
            temp = sqrt;
            sqrt = (temp + (num / temp)) / 2;
        } while ((temp - sqrt) != 0);
        return sqrt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square Root: " + squareRoot(num));
        sc.close();
    }
}

