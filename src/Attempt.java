public class Attempt {
    private int attemptNumber;
    private Player player;
    private Combination combination;

    public Attempt(int attemptNumber, Player player) {
        this.attemptNumber = attemptNumber;
        this.player = player;
    }

    public void execute() {
        this.combination = this.player.proposeCombination();
    }

    public Combination getCombination() {
        return this.combination;
    }

    public int getAttemptNumber() {
        return this.attemptNumber;
    }

}
