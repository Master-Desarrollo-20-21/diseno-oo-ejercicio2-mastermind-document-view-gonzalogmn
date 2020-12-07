import java.util.Arrays;
import java.util.Random;

public class Combination {
    public static final int COMBINATION_LENGTH = 4;
    private Color[] combination;

    public Combination(String combinationText) {
        assert(isValid(combinationText));
        this.combination = toCombination(combinationText);
    }

    public Combination() {
        this.combination = getRandomCombination();
    }

    public static boolean isValid(String combinationText) {
        return combinationText.length() == COMBINATION_LENGTH && hasCombinationTextCorrectColors(combinationText);
    }

    public String getCombinationText() {
        return Arrays.toString(this.combination).toLowerCase();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Combination that = (Combination) o;
        return Arrays.equals(combination, that.combination);
    }

    private static boolean hasCombinationTextCorrectColors(String combinationText) {
        for(char character : combinationText.toCharArray()) {
            if(!Color.isCorrectColor(character)) {
                return false;
            }
        }
        return true;
    }

    private Color[] toCombination(String combinationText) {
        assert(isValid(combinationText));
        Color[] combination = new Color[COMBINATION_LENGTH];

        for(int i = 0; i < COMBINATION_LENGTH; i++) {
            combination[i] = Color.getColor(combinationText.charAt(i));
        }
        return combination;
    }

    private Color[] getRandomCombination() {
        Color[] combination = new Color[COMBINATION_LENGTH];
        Random random = new Random();
        for(int i = 0; i < COMBINATION_LENGTH; i++) {
            int MAX = Color.values().length - 1;
            combination[i] = Color.values()[random.nextInt(MAX)];
        }
        return combination;
    }
}
