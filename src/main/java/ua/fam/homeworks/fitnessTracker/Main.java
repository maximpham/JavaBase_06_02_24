package ua.fam.homeworks.fitnessTracker;

public class Main {

    public static void main(String[] args) {
        // Creating user accounts
        FitnessTracker user1 = new FitnessTracker("John", 1990,
                "john@example.com", "1234567890", "Doe",
                80, "120/80", 8000);

        FitnessTracker user2 = new FitnessTracker("Alice", 1985,
                "alice@example.com", "9876543210", "Smith",
                65, "110/70", 10000);

        FitnessTracker user3 = new FitnessTracker("Bob", 2000,
                "bob@example.com", "4567890123", "",
                0, "", 0);

        FitnessTracker user4 = new FitnessTracker("Emma", 1995,
                "emma@example.com", "5678901234", "Thompson",
                55, "115/75", 6000);

        FitnessTracker user5 = new FitnessTracker("David", 1980,
                "david@example.com", "6789012345", "Brown",
                75, "125/85", 7000);

        // Printing account info
        System.out.println("Initial Account Info:");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();

        // Modifying user accounts
        user1.setWeight(85);
        user1.setStepsPerDay(9000);
        user2.setBloodPressure("115/75");

        // Printing modified account info
        System.out.println("Modified Account Info:");
        user1.printAccountInfo();
        user2.printAccountInfo();
    }
}
