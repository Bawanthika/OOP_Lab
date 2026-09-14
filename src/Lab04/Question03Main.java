package Lab04;

public class Question03Main {
    public static void main(String[] args) {
        // Driver 1: All attributes
        Driver driver1 = new Driver("D1001", "John Smith", 4000.0, 5);

        // Driver 2: All attributes
        Driver driver2 = new Driver("D1002", "Emily Davis", 3500.0, 3);

        // Driver 3: All attributes
        Driver driver3 = new Driver("D1003", "Michael Johnson", 5000.0, 1);

        // Display details
        driver1.displayDetails();
        driver2.displayDetails();
        driver3.displayDetails();

        // Custom bonus calculation for driver3
        System.out.println("Bonus for driver3 with custom rating 4: " + driver3.calculateBonus(4));
    }
}
