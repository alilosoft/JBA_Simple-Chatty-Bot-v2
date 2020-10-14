import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(discordantFix(scanner.next()));
        // good sol: https://hyperskill.org/learn/step/3791#solutions-594998
        // better one: https://hyperskill.org/learn/step/3791#solutions-585055
        // this one also: https://hyperskill.org/learn/step/3791#solutions-585023
    }

    private static int discordantFix(String word) {
        int vowelsInRow = 0;
        int consonantsInRow = 0;
        int fixV = 0;
        int fixC = 0;
        String[] letters = word.split("");
        for (int i = 0; i < letters.length - 1; i++) {
            if (isVowel(letters[i])) {
                vowelsInRow++;
                consonantsInRow = 0;
                if (vowelsInRow == 2 && isVowel(letters[i + 1])) {
                    fixV++;
                    vowelsInRow = 0;
                }
            } else {
                consonantsInRow++;
                vowelsInRow = 0;
                if (consonantsInRow == 2 && !isVowel(letters[i + 1])) {
                    fixC++;
                    consonantsInRow = 0;
                }
            }
        }
        return fixV + fixC;
    }

    private static boolean isVowel(String letter) {
        return "aeiouy".contains(letter.toLowerCase());
    }

}