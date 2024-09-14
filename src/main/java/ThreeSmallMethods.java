public class ThreeSmallMethods {

    public boolean isYoung(int age) {
        if (age <= 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasLegalGenderManInSweden(String personalNumber) {
        int personalNumberLength = 10;

        if (personalNumber.length() < personalNumberLength || personalNumber.length() > personalNumberLength) {
            return false;
        }
        return false;
    }

    public int firstTwoDigitInteger(int[] numbers) {
        return -1;
    }
}
