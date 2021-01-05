import utils.Console;

public enum Message {
    TITLE("--- MASTERMIND ---"),
    SECRET_COMBINATION_TITLE("Secret combination! : "),
    LINE_BREAK("\n"),
    ATTEMPTS("attempt(s)"),
    SECRET_COMBINATION("xxxx"),
    WIN("You've won!!! ;-)"),
    LOSE("You've lost!!! :-("),
    PROPOSE_COMBINATION("Propose a combination:"),
    RESUME("Do you want to continue");


    private String message;

    private Message(String message) {
        this.message = message;
    }

    void write() {
        Console.getInstance().write(this.message);
    }

    void writeln() {
        Console.getInstance().writeln(this.message);
    }

    @Override
    public String toString() {
        return this.message;
    }
}
