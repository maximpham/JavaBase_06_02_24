package ua.fam.homeworks;

import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;


        while (true) {

            System.out.println("Enter a number from 0 to 10: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();

                int random = (int) (Math.random() * 10);
                if (num > 10) {
                    System.out.println("wrong number, try again");
                } else if (num == random) {
                    System.out.println(random + " - WIN!!");
                    break;
                } else {

                    System.out.println(random + " - LOSE");
                }
            } else {
                System.out.println("wrong data, try again");
                scanner.nextLine();
            }
        }
    }
}






