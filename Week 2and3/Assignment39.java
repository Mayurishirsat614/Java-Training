class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeArray {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 101, 50000),
            new Employee("Bob", 102, 60000),
            new Employee("Charlie", 103, 70000)
        };

        for (Employee emp : employees) {
            emp.display();
        }
    }
}

