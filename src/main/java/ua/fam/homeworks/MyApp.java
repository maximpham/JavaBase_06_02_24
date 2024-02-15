package ua.fam.homeworks;

public class MyApp {

    static float n;
    static float e;
    static char degree;

    public static void main(String[] args) {

        n = 53.5488F;
        e = 9.9872f;

        degree = '\u00B0';

        System.out.println("Latitude" + ": " + n + degree +
                " Longitude" + ": " + e + degree);
    }
}