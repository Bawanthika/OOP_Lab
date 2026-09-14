package Lab03;
public class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private int performanceRating;

    // Getter and Setter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter and Setter for basicSalary
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter and Setter for performanceRating
    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {

        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            System.out.println("Performance rating must be between 1 and 5.");
        }
    }

    // Calculate bonus
    public double calculateBonus() {

        switch (performanceRating) {

            case 5:
                return basicSalary * 0.20;

            case 4:
                return basicSalary * 0.15;

            case 3:
                return basicSalary * 0.10;

            case 2:
                return basicSalary * 0.05;

            case 1:
                return 0;

            default:
                return 0;
        }
    }

    // Calculate total salary
    public double calculateTotalSalary() {
        return basicSalary + calculateBonus();
    }

    // Display employee details
    public void displayDetails() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
