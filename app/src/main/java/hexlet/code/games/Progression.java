package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;


public class Progression {
    public static void playProgression() {
        var messageForGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] example = new String[3];
        String[] answers = new String[3];
        var forTry = 3;
        for (var i = 0; i < forTry; i++) {
            var exampleFromGenerate = generateExample();
            example[i] = exampleFromGenerate;
            var answerFromGenerate = getAnswer(exampleFromGenerate);
            answers[i] = answerFromGenerate;
        }
        Engine.playGame(messageForGame, example, answers);
    }
    public static String generateExample() {
        var minLengthOfProgression = 5;
        var maxLengthOfProgression = 10;
        var lengthForProgression = RandomUtils.nextInt(minLengthOfProgression, maxLengthOfProgression);

        var minStep = 5;
        var maxStep = 10;
        var step = RandomUtils.nextInt(minStep, maxStep);

        var minStartNumber = 1;
        var maxStartNumber = 100;
        var startNumber = RandomUtils.nextInt(minStartNumber, maxStartNumber);

        var minRandomIndex = 0;
        var maxRandomIndex = lengthForProgression - 1;
        var randomIndex = RandomUtils.nextInt(minRandomIndex, maxRandomIndex);

        String[] arrayForProgression = new String[lengthForProgression];
        arrayForProgression[0] = String.valueOf(startNumber);

        for (int i = 1; i < lengthForProgression; i++) {
            startNumber += step;
            arrayForProgression[i] = String.valueOf(startNumber);
        }
        arrayForProgression[randomIndex] = "..";

        return String.join(" ", arrayForProgression);
    }

    public static String getAnswer(String answer) {
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
