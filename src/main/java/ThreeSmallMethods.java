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
        int personalNumberLength = 10;
        int index = personalNumber.length() - 2;
        char secondToLastNumberChar = personalNumber.charAt(index);
        int secondToLastNumber = Integer.parseInt(String.valueOf(secondToLastNumberChar));

        //Refactor
        if (personalNumber.length() < personalNumberLength || personalNumber.length() > personalNumberLength) {
            return false;
        }

        if (secondToLastNumber % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int firstTwoDigitInteger(int[] numbers) {
        return -1;
    }
}
