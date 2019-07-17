public class Main {

    public static void main(String[] args) {
      int newScore =  CalculateScore ("jon", 500);
        System.out.println("New score is " +newScore);
    }

    public static int CalculateScore( String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

}
