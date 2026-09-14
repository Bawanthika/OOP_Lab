package Lab03;
import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter Employee ID: ");
        employee.setEmployeeId(input.nextInt());

        input.nextLine();

        System.out.print("Enter Employee Name: ");
        employee.setEmployeeName(input.nextLine());

        System.out.print("Enter Basic Salary: ");
        employee.setBasicSalary(input.nextDouble());

        System.out.print("Enter Performance Rating (1-5): ");
        employee.setPerformanceRating(input.nextInt());

        System.out.println("\n--- Employee Details ---");
        employee.displayDetails();

        input.close();
    }
}
