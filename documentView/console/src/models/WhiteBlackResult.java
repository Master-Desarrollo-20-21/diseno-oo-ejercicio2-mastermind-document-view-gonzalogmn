package models;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhiteBlackResult {
    private Combination referenceCombination;
    private Combination combination;

    public WhiteBlackResult(Combination referenceCombination, Combination combination) {
        this.referenceCombination = referenceCombination;
        this.combination = combination;
    }

    public int getWhites() {
        int numberOfWhites = 0;
        Set<String> distinctColors = new HashSet<String>(Arrays.asList(this.combination.getCombinationText().split("")));
        for(String color: distinctColors) {
            if(this.referenceCombination.hasColor(color.charAt(0))) {
                numberOfWhites++;
            }
        }
        return numberOfWhites;
    }

    public int getBlacks() {
        int numberOfBlacks = 0;
        char[] combinationColors = this.combination.getCombinationText().toCharArray();
        for(int i = 0; i < combinationColors.length; i++) {
            if(this.referenceCombination.hasColor(combinationColors[i], i)) {
                numberOfBlacks++;
            }
        }
        return numberOfBlacks;
    }
}
