package Lab4014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Game Name : ");
        String inputGameName = scanner.nextLine();

        System.out.println("-------------------------");

        System.out.println("Enter Your Scores 1 :");
        int inputScore1 = scanner.nextInt();

        System.out.println("-------------------------");

        System.out.println("Enter Your Scores 2 :");
        int inputScore2 = scanner.nextInt();

        System.out.println("-------------------------");

        System.out.println("Enter Your Scores 3 :");
        int inputScore3 = scanner.nextInt();

        int[] originalScores = {inputScore1, inputScore2, inputScore3};

        ScoreBoard blehscore1 = new ScoreBoard(inputGameName, originalScores);

        ScoreBoard blehscore2 = new ScoreBoard(blehscore1);

        originalScores[0] = 999;

        System.out.println("----------result----------");

        blehscore1.displayScores();
        blehscore2.displayScores();

        scanner.close();

    }
}
