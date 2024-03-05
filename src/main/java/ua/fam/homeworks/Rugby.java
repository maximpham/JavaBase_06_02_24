package ua.fam.homeworks;

import java.util.Random;

public class Rugby {

    public static void main(String[] args) {

                Random random = new Random();

                int numPlayers = 25;

                int[] teamAges1 = new int[numPlayers];
                int[] teamAges2 = new int[numPlayers];

                int sumTeam1 = 0;
                System.out.println("Ages of players in Team 1:");
                for (int i = 0; i < numPlayers; i++) {
                    teamAges1[i] = random.nextInt(40 - 18 + 1) + 18;
                    sumTeam1 += teamAges1[i];
                    System.out.println("Player " + (i + 1) + ": " + teamAges1[i]);
                }

                int sumTeam2 = 0;
                System.out.println("\nAges of players in Team 2:");
                for (int i = 0; i < numPlayers; i++) {
                    teamAges2[i] = random.nextInt(40 - 18 + 1) + 18;
                    sumTeam2 += teamAges2[i];
                    System.out.println("Player " + (i + 1) + ": " + teamAges2[i]);
                }

                double avgTeam1 = (double) sumTeam1 / numPlayers;
                double avgTeam2 = (double) sumTeam2 / numPlayers;

                System.out.println("\nAverage age for Team 1: " + avgTeam1);
                System.out.println("Average age for Team 2: " + avgTeam2);
            }
        }



