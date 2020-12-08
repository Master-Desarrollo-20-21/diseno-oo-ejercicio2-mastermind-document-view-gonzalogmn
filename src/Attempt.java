public class Attempt {
    private Player player;
    private Combination combination;
    private Combination secretCombination;

    public Attempt(Player player, Combination secretCombination) {
        this.player = player;
        this.secretCombination = secretCombination;
    }

    public void execute() {
        this.combination = this.player.proposeCombination();
    }

    public boolean isSucessful() {
        return this.combination != null && this.combination.equals(this.secretCombination);
    }

    public void printResult() {
        WhiteBlackCombinationComparator comparator = new WhiteBlackCombinationComparator(this.secretCombination);
        Console console = new Console();
        if(this.combination != null) {
            console.out(this.combination.getCombinationText() + " --> " + comparator.getBlacks(combination) + " blacks and " + comparator.getWhites(combination) + " whites\n");
        }
    }

}