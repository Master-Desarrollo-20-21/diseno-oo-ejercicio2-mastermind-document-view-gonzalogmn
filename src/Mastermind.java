import utils.Console;

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
            attempts[i] = new Attempt(player, this.secretCombination);
        }
    }

    public void play() {
        Console console = new Console();
        console.out("----- MASTERMIND -----\n");
        for(int i = 0; i < MAX_ATTEMPTS; i++) {
            Attempt attempt = this.attempts[i];
            console.out("\n\n");
            console.out(i+1 + " attempt(s)\n");
            console.out("xxxx\n");
            printPlayedAttempts();
            attempt.execute();
            if(attempt.isSucessful()) {
                console.out("You've won!!! ;-)\n");
                resume();
                return;
            }
        }
        console.out("You've lost!!! :-(");
        resume();
    }

    public void resume() {
        boolean resume = this.player.resume();
        if(resume == true) {
            this.play();
        }
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

    private void printPlayedAttempts() {
        for(Attempt attempt: attempts) {
            attempt.printResult();
        }
    }

}
