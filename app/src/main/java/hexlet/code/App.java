package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\n");
        System.out.print("Your choice: ");
        int choice = user.nextInt();

        switch (choice) {
            case 1:
                Cli.greetings();
                break;
            case 2:
                Even.playEven();
                break;
            case 3:
                Calc.playCalc();
                break;
            case 4:
                Gcd.playGcd();
                break;
            case 5:
                Progression.playProgression();
                break;
            case 6:
                Prime.playPrime();
                break;
            default:
                System.out.println("Exit..");
                break;
        }
    }
}
