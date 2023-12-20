package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;


public class Progression {
    public void getMessage() {
        System.out.println("What number is missing in the progression?");
    }

    public String generateExample() {
        var lengthForProgression = RandomUtils.nextInt(5, 10);
        var step = RandomUtils.nextInt(5, 10);
        var startNumber = RandomUtils.nextInt(1, 100);
        var randomIndex = RandomUtils.nextInt(0, lengthForProgression - 1);
        String[] arrayForProgression = new String[lengthForProgression];
        arrayForProgression[0] = String.valueOf(startNumber);

        for (int i = 1; i < lengthForProgression; i++) {
            startNumber += step;
            arrayForProgression[i] = String.valueOf(startNumber);
        }
        arrayForProgression[randomIndex] = "..";

        return String.join(" ", arrayForProgression);
    }

    public String getAnswer(String answer) {
        var index = 0;
        var arrayFromExample = answer.split(" ");
        for (int i = 0; i < arrayFromExample.length; i++) {
            if (arrayFromExample[i].equals("..")) {
                index = i;
                break;
            }
        }
        return Progression.forGetAnswer(index, arrayFromExample);
    }

    public static String forGetAnswer(int index, String[] progression) {
        if (index <= 1) {
            var number1 = progression[progression.length - 1];
            var number2 = progression[progression.length - 2];
            var diff = Integer.parseInt(number1) - Integer.parseInt(number2);
            if (index == 0) {
                return String.valueOf(Integer.parseInt(progression[index + 1]) - diff);
            } else {
                return String.valueOf(Integer.parseInt(progression[index - 1]) + diff);
            }
        } else {
            var number1 = progression[1];
            var number2 = progression[0];
            var diff = Integer.parseInt(number1) - Integer.parseInt(number2);
            return String.valueOf(Integer.parseInt(progression[index - 1]) + diff);
        }

    }
}
