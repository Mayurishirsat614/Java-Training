import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        double percentage = cgpa * 9.5;
        System.out.println("Percentage: " + percentage + "%");
        sc.close();
    }
}

