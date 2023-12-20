package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\n");
        System.out.print("Your choice: ");
        var choice = user.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Exit..");
                break;
            case 1:
                Engine.getMeetings();
                break;
            case 2:
                Engine.getEven();
                break;
            case 3:
                Engine.getCalc();
                break;
            case 4:
                Engine.getGcd();
                break;
            case 5:
                Engine.getProgression();
                break;
            case 6:
                Engine.getPrime();
                break;
        }
    }
}
