public class WhiteBlackCombinationComparator {
    private Combination privateCombination;

    public WhiteBlackCombinationComparator(Combination privateCombination) {
        this.privateCombination = privateCombination;
    }

    public int getWhites(Combination combination) {
        return 1;
    }

    public int getBlacks(Combination combination) {
        return 1;
    }
}
