package ua.fam.homeworks;

import java.util.Arrays;
import java.util.Random;

public class Lottery {


        public static void main(String[] args) {

            Random random = new Random();

            int[] first = new int[7];
            for (int i = 0; i < first.length; i++) {
                first[i] = random.nextInt(10);
            }


            int[] second = new int[7];
            for (int i = 0; i < second.length; i++) {
                second[i] = random.nextInt(10);
            }

            Arrays.sort(first);
            Arrays.sort(second);

            System.out.println("First array: " + Arrays.toString(first));
            System.out.println("Second array: " + Arrays.toString(second));

            int matches = 0;
            for (int i = 0; i < first.length; i++) {
                if (first[i] == second[i]) {
                    matches++;
                }
            }

            System.out.println("Quantity of coincidences: " + matches);
        }
    }


