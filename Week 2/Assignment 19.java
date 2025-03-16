import java.util.Scanner;

public class StudentGrades {
    public static void grade(int marks) {
        char grade;
        switch (marks / 10) {
            case 10, 9 -> grade = 'A';
            case 8 -> grade = 'B';
            case 7 -> grade = 'C';
            case 6 -> grade = 'D';
            default -> grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        grade(marks);
        sc.close();
    }
}

