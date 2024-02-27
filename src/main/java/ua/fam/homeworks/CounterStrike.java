package ua.fam.homeworks;

import java.util.Scanner;

import java.util.Scanner;

public class CounterStrike {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first team: ");
        String team1_name = scanner.nextLine();

        System.out.print("Kills of 1st player: ");
        int team1_score1 = scanner.nextInt();
        System.out.print("Kills of 2nd player: ");
        int team1_score2 = scanner.nextInt();
        System.out.print("Kills of 3rd player: ");
        int team1_score3 = scanner.nextInt();
        System.out.print("Kills of 4th player: ");
        int team1_score4 = scanner.nextInt();
        System.out.print("Kills of 5th player: ");
        int team1_score5 = scanner.nextInt();
        double avg_team1 = (double) (team1_score1 + team1_score2 + team1_score3 + team1_score4
                + team1_score5) / 5;

        scanner.nextLine();

        System.out.print("Enter the second team: ");
        String team2_name = scanner.nextLine();

        System.out.print("Kills of 1st player: ");
        int team2_score1 = scanner.nextInt();
        System.out.print("Kills of 2nd player: ");
        int team2_score2 = scanner.nextInt();
        System.out.print("Kills of 3rd player: ");
        int team2_score3 = scanner.nextInt();
        System.out.print("Kills of of 4th player: ");
        int team2_score4 = scanner.nextInt();
        System.out.print("Kills of 5th player: ");
        int team2_score5 = scanner.nextInt();
        double avg_team2 = (double) (team2_score1 + team2_score2 + team2_score3 + team2_score4
                + team2_score5) / 5;

        String winner;
        double result;
        if (avg_team1 > avg_team2) {
            winner = team1_name;
            result = avg_team1;
        } else if (avg_team2 > avg_team1) {
            winner = team2_name;
            result = avg_team2;
        } else {
            winner = "Draw";
            result = avg_team1;
        }

        System.out.println("The Winner is:  " + winner + " with " + result + " points.");
    }
}


