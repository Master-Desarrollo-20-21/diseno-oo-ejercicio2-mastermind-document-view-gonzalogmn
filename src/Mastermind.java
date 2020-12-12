import utils.Console;

public class Mastermind {
    public static final int MAX_ATTEMPTS = 10;

    private Player player;
    private Attempt[] attempts;
    private Combination secretCombination;

    public Mastermind() {
        this.reset();
    }

    public void play() {
        this.reset();
        Console.getInstance().writeln(Message.SECRET_COMBINATION_TITLE + " " + this.secretCombination.getCombinationText());
        Message.TITLE.writeln();
        for(int i = 0; i < MAX_ATTEMPTS; i++) {
            Attempt attempt = this.attempts[i];
            Message.LINE_BREAK.writeln();
            Console.getInstance().writeln(String.valueOf(i+1) + " " + Message.ATTEMPTS);
            Message.SECRET_COMBINATION.writeln();
            printPlayedAttempts();
            attempt.execute();
            if(attempt.isSucessful()) {
                Message.WIN.writeln();
                resume();
                return;
            }
        }
        Message.LOSE.writeln();
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

    private void reset() {
        this.player = new Player();
        this.secretCombination = new Combination();
        this.attempts = new Attempt[MAX_ATTEMPTS];

        for(int i = 0; i < MAX_ATTEMPTS; i++) {
            attempts[i] = new Attempt(player, this.secretCombination);
        }
    }

}
