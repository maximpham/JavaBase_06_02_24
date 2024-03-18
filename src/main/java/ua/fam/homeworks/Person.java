package ua.fam.homeworks;


public class Person {
    String firstName;
    String lastName;
    String city;
    String phoneNumber;

    String personInfo() {
        return "Зателефонувати громадянинові " + firstName + " " + lastName + " з міста " + city + " можна за номером " + phoneNumber + ".";
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Will";
        person1.lastName = "Smith";
        person1.city = "New York";
        person1.phoneNumber = "2936729462846";

        Person person2 = new Person();
        person2.firstName = "Jackie";
        person2.lastName = "Chan";
        person2.city = "Shanghai";
        person2.phoneNumber = "12312412412";

        Person person3 = new Person();
        person3.firstName = "Sherlock";
        person3.lastName = "Holmes";
        person3.city = "London";
        person3.phoneNumber = "37742123513";

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}

