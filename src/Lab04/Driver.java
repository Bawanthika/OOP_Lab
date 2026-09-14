package Lab04;

public class Driver {
    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    // Constructor 1: driverID and driverName only
    public Driver(String driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = 0.0;
        this.performanceScore = 1; // default
    }

    // Constructor 2: baseSalary only
    public Driver(double baseSalary) {
        this.driverID = "Unknown";
        this.driverName = "Unknown";
        this.baseSalary = baseSalary;
        this.performanceScore = 1; // default
    }

    // Constructor 3: all attributes
    public Driver(String driverID, String driverName, double baseSalary, int performanceScore) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performanceScore); // validation applied
    }

    // Getters and Setters
    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        if (performanceScore >= 1 && performanceScore <= 5) {
            this.performanceScore = performanceScore;
        } else {
            this.performanceScore = 1; // default if invalid
        }
    }

    // Method to calculate bonus based on stored performanceScore
    public double calculateBonus() {
        return calculateBonus(this.performanceScore);
    }

    // Overloaded method to calculate bonus using a custom score
    public double calculateBonus(int customScore) {
        double percentage = 0.0;
        switch (customScore) {
            case 5: percentage = 0.25; break;
            case 4: percentage = 0.20; break;
            case 3: percentage = 0.15; break;
            case 2: percentage = 0.10; break;
            case 1: default: percentage = 0.0; break;
        }
        return baseSalary * percentage;
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    // Display driver details
    public void displayDetails() {
        System.out.println("Driver ID: " + driverID);
        System.out.println("Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println();
    }
}
