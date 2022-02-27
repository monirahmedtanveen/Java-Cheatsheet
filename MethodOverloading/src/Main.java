public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Iron Man", 500);
        System.out.println("New Score Is: " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player name, no player scored.");
        return 0;
    }
}
