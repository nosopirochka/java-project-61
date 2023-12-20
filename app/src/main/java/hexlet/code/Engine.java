package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static boolean toControl(String gameAnswer, String answer, String name) {
        if (gameAnswer.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, gameAnswer);
            System.out.printf("Let's try again, %s!\n", name);
            return false;
        }
    }

    public static void getMeetings() {
        var name = Cli.greetings();
        System.out.printf("Hello, %s!\n", name);
    }

    public static void getCalc() {
        Scanner myUser = new Scanner(System.in);
        var name = Cli.greetings();
        System.out.printf("Hello, %s!\n", name);
        var game = new Calc();
        System.out.println("What is the result of the expression?");
        var attempt = 3;

        for (int i = 0; i < attempt; i++) {
            var question = game.generateExample();
            System.out.printf("Question: %s\n", question);
            System.out.print("Your answer: ");
            var answer = myUser.next();
            var gameAnswer = game.getAnswer(question);

            var control = Engine.toControl(gameAnswer, answer, name);
            if (!control) {
                myUser.close();
                return;
            }
        }
        myUser.close();
        System.out.printf("Congratulations, %s!\n", name);

    }

    public static void getEven() {
        Scanner myUser = new Scanner(System.in);
        var name = Cli.greetings();
        System.out.printf("Hello, %s!\n", name);
        var game = new Even();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var attempt = 3;

        for (int i = 0; i < attempt; i++) {
            var question = game.generateExample();
            System.out.printf("Question: %s\n", question);
            System.out.print("Your answer: ");
            var answer = myUser.next();

            var gameAnswer = game.getAnswer(question);

            var control = Engine.toControl(gameAnswer, answer, name);
            if (!control) {
                myUser.close();
                return;
            }
        }
        myUser.close();
        System.out.printf("Congratulations, %s!\n", name);

    }

    public static void getGcd() {
        Scanner myUser = new Scanner(System.in);
        var name = Cli.greetings();
        System.out.printf("Hello, %s!\n", name);
        var game = new Gcd();
        System.out.println("Find the greatest common divisor of given numbers.");
        var attempt = 3;

        for (int i = 0; i < attempt; i++) {
            var question = game.generateExample();
            System.out.printf("Question: %s\n", question);
            System.out.print("Your answer: ");
            var answer = myUser.next();

            var gameAnswer = game.getAnswer(question);

            var control = Engine.toControl(gameAnswer, answer, name);
            if (!control) {
                myUser.close();
                return;
            }
        }
        myUser.close();
        System.out.printf("Congratulations, %s!\n", name);

    }

    public static void getPrime() {
        Scanner myUser = new Scanner(System.in);
        var name = Cli.greetings();
        System.out.printf("Hello, %s!\n", name);
        var game = new Prime();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var attempt = 3;

        for (int i = 0; i < attempt; i++) {
            var question = game.generateExample();
            System.out.printf("Question: %s\n", question);
            System.out.print("Your answer: ");
            var answer = myUser.next();

            var gameAnswer = game.getAnswer(question);

            var control = Engine.toControl(gameAnswer, answer, name);
            if (!control) {
                myUser.close();
                return;
            }
        }
        myUser.close();
        System.out.printf("Congratulations, %s!\n", name);

    }

    public static void getProgression() {
        Scanner myUser = new Scanner(System.in);
        var name = Cli.greetings();
        System.out.printf("Hello, %s!\n", name);
        var game = new Progression();
        System.out.println("What number is missing in the progression?");
        var attempt = 3;

        for (int i = 0; i < attempt; i++) {
            var question = game.generateExample();
            System.out.printf("Question: %s\n", question);
            System.out.print("Your answer: ");
            var answer = myUser.next();

            var gameAnswer = game.getAnswer(question);

            var control = Engine.toControl(gameAnswer, answer, name);
            if (!control) {
                myUser.close();
                return;
            }
        }
        myUser.close();
        System.out.printf("Congratulations, %s!\n", name);

    }
}
