package ua.fam.homeworks.fitnessTracker;

public class FitnessTracker{

    private String name;
    private int yearOfBirth;
    private String email;
    private String phone;
    private String surname;
    private int weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public FitnessTracker(String name, int yearOfBirth, String email, String phone,
                          String surname, int weight, String bloodPressure, int stepsPerDay) {

        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;
        calculateAge();
    }

    private void calculateAge() {
        int currentYear = 2024; // Assuming current year is 2024
        age = currentYear - yearOfBirth;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println();
    }

    // Getters and setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
}


