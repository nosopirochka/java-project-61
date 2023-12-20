package hexlet.code;

import hexlet.code.games.*;

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
        game.getMessage();

        for (int i = 0; i < 3; i++) {
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
        game.getMessage();

        for (int i = 0; i < 3; i++) {
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
        game.getMessage();

        for (int i = 0; i < 3; i++) {
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
        game.getMessage();

        for (int i = 0; i < 3; i++) {
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
        game.getMessage();

        for (int i = 0; i < 3; i++) {
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
