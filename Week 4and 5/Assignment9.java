
import java.util.Scanner;

public class EmployeeRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary and number of certifications: ");
        double salary = sc.nextDouble();
        int certs = sc.nextInt();
        double increment = certs >= 10 ? 0.10 : certs >= 5 ? 0.05 : certs >= 1 ? 0.025 : 0;
        salary += salary * increment;
        System.out.println("Updated Salary: " + salary);
        sc.close();
    }
}
