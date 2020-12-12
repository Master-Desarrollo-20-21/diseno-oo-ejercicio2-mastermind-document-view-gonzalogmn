import utils.Console;

import java.util.Arrays;

public class Player {
    public Combination proposeCombination() {
        Console console = new Console();
        String proposedCombination;
        do {
            console.out("Propose a combination:");
            proposedCombination = console.inString();
            console.out(proposedCombination + "\n");
            if(!Combination.isValid(proposedCombination)) {
                console.out("Combination should have " + Combination.COMBINATION_LENGTH + " characters and colors must be " + Arrays.toString(Color.values()).toLowerCase() + "\n");
            }
        } while(!Combination.isValid(proposedCombination));

        return new Combination(proposedCombination);
    }

    public boolean resume() {
        Console console = new Console();
        console.out("RESUME? (y/n):\n");
        String resume = console.inString();
        if(resume.toLowerCase().equals("y")) {
            return true;
        }
        return false;
    }
}
