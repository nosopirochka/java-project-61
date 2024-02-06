package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    static final String EXIT = "0";
    static final String GREET = "1";
    static final String EVEN = "2";
    static final String CALC = "3";
    static final String GCD = "4";
    static final String PROGRESSION = "5";
    static final String PRIME = "6";


    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\n");
        System.out.print("Your choice: ");
        var choice = user.next();

        switch (choice) {
            case EXIT:
                System.out.println("Exit..");
                break;
            case GREET:
                Cli.greetings();
                break;
            case EVEN:
                Even.run();
                break;
            case CALC:
                Calc.run();
                break;
            case GCD:
                Gcd.run();
                break;
            case PROGRESSION:
                Progression.run();
                break;
            case PRIME:
                Prime.run();
                break;
            default:
                System.out.println("Wrong data. Please restart the game!");
                break;
        }
        user.close();
    }
}
