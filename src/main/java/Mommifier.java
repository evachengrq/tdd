public class Mommifier {
    public static String convert(String input) {
        if (input == null || input.length() == 0) {
            throw new IllegalArgumentException();
        }

        int inputLength = input.length();
        int numberOfVowels = getNumbersOfVowels(input, inputLength);
        if (numberOfVowels <= inputLength * 0.3) {
            return input;
        }
        if (hasNoContinuousVowels(input)) return input;
        return null;
    }

    private static boolean hasNoContinuousVowels(String input) {
        if (!input.contains("aa") && !input.contains("ee") && !input.contains("ii")
                && !input.contains("oo") && !input.contains("uu")) {
            return true;
        }
        return false;
    }

    private static int getNumbersOfVowels(String input, int inputLength) {
        int numberOfVowels = 0;
        for (int i = 0; i < inputLength; i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                numberOfVowels += 1;
            }
        }
        return numberOfVowels;
    }
}
