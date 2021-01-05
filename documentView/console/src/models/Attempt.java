package models;

public class Attempt {
    private Combination combination;
    private Combination secretCombination;

    public Attempt(Combination secretCombination) {
        this.secretCombination = secretCombination;
    }

    public void setCombination(Combination combination) {
        this.combination = combination;
    }

    public boolean isSucessful() {
        return this.combination != null && this.combination.equals(this.secretCombination);
    }

    public boolean hasBeenExecuted() {
        return this.combination != null;
    }

    public WhiteBlackResult getResult() {
        assert this.hasBeenExecuted();
        return new WhiteBlackResult(this.secretCombination, this.combination);
    }

    public String getCombinationText() {
        return this.combination.getCombinationText();
    }
}
