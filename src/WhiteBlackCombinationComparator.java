public class WhiteBlackCombinationComparator {
    private Combination combination;

    public WhiteBlackCombinationComparator(Combination combination) {
        this.combination = combination;
    }

    public int getWhites(Combination combination) {
        return 1;
    }

    public int getBlacks(Combination combination) {
        return 1;
    }
}
