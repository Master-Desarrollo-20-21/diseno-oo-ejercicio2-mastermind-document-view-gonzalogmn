import utils.Console;
import utils.YesNoDialog;

import java.util.Arrays;

public class Player {
    public Combination proposeCombination() {
        Console console = Console.getInstance();
        String proposedCombination;
        do {
            Message.PROPOSE_COMBINATION.write();
            proposedCombination = console.readString();
            console.writeln(proposedCombination);
            if(!Combination.isValid(proposedCombination)) {
                console.writeln("Combination should have " + Combination.COMBINATION_LENGTH + " characters and colors must be " + Arrays.toString(Color.values()).toLowerCase());
            }
        } while(!Combination.isValid(proposedCombination));

        return new Combination(proposedCombination);
    }

    public boolean resume() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }
}
