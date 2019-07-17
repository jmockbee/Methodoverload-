public class Main {

    public static void main(String[] args) {
      int newScore =  CalculateScore ("jon", 500);
        System.out.println("New score is " +newScore);
        CalculateScore(75);
        CalculateScore();
    }

    public static int CalculateScore( String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        // this below returns the score back up to int newScore
        return score * 1000;

    }

    public static int CalculateScore(  int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int CalculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
