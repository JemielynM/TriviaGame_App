import java.util.*;

public class TriviaGame {
    static Scanner input = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        System.out.println("🎮 Welcome to Java Trivia!");
        playGame();
    }

    public static void playGame() {
        String[][] questions = {
            {"What does JVM stand for?", "Java Virtual Machine", "Java Variable Method", "Join Variable Module", "Java Visual Model", "A"},
            {"Which keyword is used to create a subclass?", "super", "extends", "class", "implements", "B"},
            {"What is the default value of int in Java?", "0", "null", "undefined", "-1", "A"}
        };

        for (String[] q : questions) {
            System.out.println("\n" + q[0]);
            System.out.println("A) " + q[1]);
            System.out.println("B) " + q[2]);
            System.out.println("C) " + q[3]);
            System.out.println("D) " + q[4]);

            System.out.print("Your answer: ");
            String answer = input.nextLine().toUpperCase();

            if (answer.equals(q[5])) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Incorrect. Correct answer was: " + q[5]);
            }
        }

        System.out.println("\nGame Over! Your final score: " + score + "/" + questions.length);
    }
}
