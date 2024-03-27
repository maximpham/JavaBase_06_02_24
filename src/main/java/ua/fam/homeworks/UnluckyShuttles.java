package ua.fam.homeworks;

public class UnluckyShuttles {

    public static boolean isUnlucky(int number) {

        return String.valueOf(number).contains("4") || String.valueOf(number).contains("9");
    }

    public static void printShuttles(int count) {
        int shuttleNumber = 1;
        int printedShuttles = 0;

        while (printedShuttles < count) {
            if (!isUnlucky(shuttleNumber)) {
                System.out.println("Space Shuttle #" + printedShuttles + ": " + shuttleNumber);
                printedShuttles++;
            }
            shuttleNumber++;
        }
    }

    public static void main(String[] args) {
        int numberOfShuttles = 100;
        printShuttles(numberOfShuttles);
    }
}

