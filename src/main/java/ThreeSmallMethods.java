import java.util.Arrays;

public class ThreeSmallMethods {

    public boolean isYoung(int age) {
        //refactor
        if (age <= 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasLegalGenderManInSweden(String personalNumber) {
        int personalNumberMaxLength = 10;
        int personalNumberLength = personalNumber.length();
        int index = personalNumber.length() - 2;
        char secondToLastNumberChar = personalNumber.charAt(index);
        int secondToLastNumber = Integer.parseInt(String.valueOf(secondToLastNumberChar));

        if (personalNumberLength < personalNumberMaxLength || personalNumberLength > personalNumberMaxLength) {
            return false;
        }

        if (secondToLastNumber % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int firstTwoDigitInteger(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > -100 && numbers[i] < -9 || numbers[i] > 9 && numbers[i] < 100) {
                return numbers[i];
            }
        }
        return -1;
    }
}
