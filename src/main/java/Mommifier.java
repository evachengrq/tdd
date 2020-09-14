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

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputLength; i++) {
            if (hasContinuousVowels(input, i)) {
                stringBuilder.append(input, 0, i + 1)
                        .append("mommy")
                        .append(input, i + 1, inputLength);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean hasContinuousVowels(String input, int i) {
        return input.charAt(i) == 'a' && input.charAt(i + 1) == 'a'
                || input.charAt(i) == 'e' && input.charAt(i + 1) == 'e'
                || input.charAt(i) == 'i' && input.charAt(i + 1) == 'i'
                || input.charAt(i) == 'o' && input.charAt(i + 1) == 'o'
                || input.charAt(i) == 'u' && input.charAt(i + 1) == 'u';
    }

    private static boolean hasNoContinuousVowels(String input) {
        return !input.contains("aa") && !input.contains("ee") && !input.contains("ii")
                && !input.contains("oo") && !input.contains("uu");
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
