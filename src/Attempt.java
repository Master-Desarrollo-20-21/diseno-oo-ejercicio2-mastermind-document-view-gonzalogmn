import utils.Console;

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
        if(this.combination != null) {
            Console.getInstance().writeln(this.combination.getCombinationText() + " --> " + comparator.getBlacks(combination) + " blacks and " + comparator.getWhites(combination) + " whites");
        }
    }

}
