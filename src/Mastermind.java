public class Mastermind {
    public static final int MAX_ATTEMPTS = 15;

    private Player player;
    private Attempt[] attempts;
    private Combination secretCombination;

    public Mastermind() {
        this.player = new Player();
        this.secretCombination = new Combination();
        new Console().out("Secret combination! : " + this.secretCombination.getCombinationText() + "\n");
        this.attempts = new Attempt[MAX_ATTEMPTS];

        for(int i = 0; i < MAX_ATTEMPTS; i++) {
            attempts[i] = new Attempt(i+1, player);
        }
    }

    public void play() {
        Console console = new Console();
        console.out("----- MASTERMIND -----\n");
        for(Attempt attempt: attempts) {
            console.out("\n\n");
            console.out(attempt.getAttemptNumber() + " attempt(s)\n");
            console.out("xxxx\n");
            printPlayedAttempts();
            attempt.execute();
            if(isSecretCombination(attempt.getCombination())) {
                console.out("You've won!!! ;-)\n");
                resume();
                return;
            }
        }
        console.out("You've lost!!! :-(");
        resume();
    }

    public void resume() {
        Console console = new Console();
        console.out("RESUME? (y/n):\n");
        String resume = console.inString();
        if(resume.toLowerCase().equals("y")) {
            this.play();
        }
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

    private void printPlayedAttempts() {
        WhiteBlackCombinationComparator comparator = new WhiteBlackCombinationComparator(this.secretCombination);
        Console console = new Console();
        for(Attempt attempt: attempts) {
            Combination combination = attempt.getCombination();
            if(combination != null) {
                console.out(attempt.getCombination().getCombinationText() + " --> " + comparator.getBlacks(combination) + " blacks and " + comparator.getWhites(combination) + " whites\n");
            }
        }
    }

    private boolean isSecretCombination(Combination proposedCombination) {
        return proposedCombination.equals(secretCombination);
    }

}
