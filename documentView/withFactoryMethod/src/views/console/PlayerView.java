package views.console;

import models.Color;
import models.Combination;
import utils.Console;
import views.Message;

import java.util.Arrays;

public class PlayerView {

    public Combination interact() {
        Console console = Console.getInstance();
        String proposedCombination;
        do {
            Message.PROPOSE_COMBINATION.write();
            proposedCombination = console.readString();
            console.writeln(proposedCombination);
            if(!Combination.isValid(proposedCombination)) {
                console.writeln("models.Combination should have " + Combination.COMBINATION_LENGTH + " characters and colors must be " + Arrays.toString(Color.values()).toLowerCase());
            }
        } while(!Combination.isValid(proposedCombination));

        return new Combination(proposedCombination);
    }
}
