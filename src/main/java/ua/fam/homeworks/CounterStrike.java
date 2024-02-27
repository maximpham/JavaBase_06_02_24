package ua.fam.homeworks;

public class CounterStrike {

        public static void main(String[] args) {

            String teamName = "Team Right";

            int playerGreen= 12;
            int playerRed = 5;
            int playerBlue = 8;
            int playerWhite = 3;
            int playerGrey = 10;

            String teamName2 = "Team Left";

            int playerBlack = 20;
            int playerPurple = 14;
            int playerOrange = 1;
            int playerPink = 5;
            int playerYellow = 2;

            int pointsTeamRight = (playerGreen + playerRed + playerBlue
                    + playerWhite + playerGrey) /5;
            int pointsTeamLeft = (playerBlack + playerPurple + playerOrange +
                    playerPink + playerYellow) /5;

            if (pointsTeamRight > pointsTeamLeft){

                System.out.println("Winner is: " + teamName + " with "
                        + pointsTeamRight + " points");
            } else {
                System.out.println("Winner is: " + teamName2 + " with "
                        + pointsTeamLeft + " points");
            }
        }
    }

