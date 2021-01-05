package models;

public class Game {
    public static final int MAX_ATTEMPTS = 10;

    private Attempt[] attempts;
    private Combination secretCombination;

    public Game() {
        this.secretCombination = new Combination();
        this.attempts = new Attempt[MAX_ATTEMPTS];

        for(int i = 0; i < MAX_ATTEMPTS; i++) {
            attempts[i] = new Attempt(this.secretCombination);
        }
    }

    public int getMaxAttempts() {
        return this.MAX_ATTEMPTS;
    }

    public Attempt getAttempt(int i) {
        assert i > 0 && i < MAX_ATTEMPTS;
        return this.attempts[i];
    }
}
