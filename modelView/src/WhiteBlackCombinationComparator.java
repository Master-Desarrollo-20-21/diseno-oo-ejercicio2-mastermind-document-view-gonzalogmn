import utils.Console;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhiteBlackCombinationComparator {
    private Combination referenceCombination;

    public WhiteBlackCombinationComparator(Combination referenceCombination) {
        this.referenceCombination = referenceCombination;
    }

    public int getWhites(Combination combination) {
        int numberOfWhites = 0;
        Set<String> distinctColors = new HashSet<String>(Arrays.asList(combination.getCombinationText().split("")));
        for(String color: distinctColors) {
            if(referenceCombination.hasColor(color.charAt(0))) {
                numberOfWhites++;
            }
        }
        return numberOfWhites;
    }

    public int getBlacks(Combination combination) {
        int numberOfBlacks = 0;
        char[] combinationColors = combination.getCombinationText().toCharArray();
        for(int i = 0; i < combinationColors.length; i++) {
            if(referenceCombination.hasColor(combinationColors[i], i)) {
                numberOfBlacks++;
            }
        }
        return numberOfBlacks;
    }
}
