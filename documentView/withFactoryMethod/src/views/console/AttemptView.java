package views.console;

import models.Attempt;
import models.Combination;
import models.WhiteBlackResult;
import utils.Console;

public class AttemptView {
    private Attempt attempt;

    public AttemptView(Attempt attempt) {
        this.attempt = attempt;
    }

    public void interact() {
        Combination combination = new PlayerView().interact();
        this.attempt.setCombination(combination);
    }

    public boolean isSucessful() {
        return this.attempt.isSucessful();
    }
    public void printResult() {
        WhiteBlackResult comparator = this.attempt.getResult();
        if(this.attempt.hasBeenExecuted()) {
            Console.getInstance().writeln(this.attempt.getCombinationText() + " --> " + comparator.getBlacks() + " blacks and " + comparator.getWhites() + " whites");
        }
    }
}
