package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    static final int EXIT = 0;
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\n");
        System.out.print("Your choice: ");
        int choice = user.nextInt();

        switch (choice) {
            case EXIT:
                System.out.println("Exit..");
                break;
            case GREET:
                Cli.greetings();
                break;
            case EVEN:
                Even.playEven();
                break;
            case CALC:
                Calc.playCalc();
                break;
            case GCD:
                Gcd.playGcd();
                break;
            case PROGRESSION:
                Progression.playProgression();
                break;
            case PRIME:
                Prime.playPrime();
                break;
            default:
                System.out.println("Wrong data.\nPlease restart the game!");
                break;
        }
        user.close();
    }
}
