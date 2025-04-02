import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary string: ");
        String a = sc.next();
        System.out.print("Enter second binary string: ");
        String b = sc.next();

        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);

        System.out.println("Binary Sum: " + result);
        sc.close();
    }
}

