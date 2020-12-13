import utils.Console;

public class Game {
    public static final int MAX_ATTEMPTS = 10;

    private Player player;
    private Attempt[] attempts;
    private Combination secretCombination;

    public Game(Player player) {
        this.player = player;
        this.reset();
    }

    public void play() {
        this.reset();
        Console.getInstance().writeln(Message.SECRET_COMBINATION_TITLE + " " + this.secretCombination.getCombinationText());
        Message.TITLE.writeln();
        for(int i = 0; i < MAX_ATTEMPTS; i++) {
            Attempt attempt = this.attempts[i];
            Message.LINE_BREAK.writeln();
            Console.getInstance().writeln(i+1 + " " + Message.ATTEMPTS);
            Message.SECRET_COMBINATION.writeln();
            printPlayedAttempts();
            attempt.execute();
            if(attempt.isSucessful()) {
                Message.WIN.writeln();
                return;
            }
        }
        Message.LOSE.writeln();
    }

    private void printPlayedAttempts() {
        for(Attempt attempt: attempts) {
            attempt.printResult();
        }
    }

    private void reset() {
        this.secretCombination = new Combination();
        this.attempts = new Attempt[MAX_ATTEMPTS];

        for(int i = 0; i < MAX_ATTEMPTS; i++) {
            attempts[i] = new Attempt(player, this.secretCombination);
        }
    }
}
