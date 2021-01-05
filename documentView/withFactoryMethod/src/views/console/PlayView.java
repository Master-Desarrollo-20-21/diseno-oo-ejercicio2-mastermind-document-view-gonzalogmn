package views.console;

import models.Game;
import utils.Console;
import views.Message;
import views.WithGameView;

import java.util.ArrayList;
import java.util.List;

public class PlayView extends WithGameView {
    private List<AttemptView> attemptViews;

    public PlayView(Game game) {
        super(game);
        this.attemptViews = new ArrayList<>();
    }

    public void interact() {
        for(int i = 0; i < game.getMaxAttempts(); i++) {
                      Message.LINE_BREAK.writeln();
            Console.getInstance().writeln(i+1 + " " + Message.ATTEMPTS);
            Message.SECRET_COMBINATION.writeln();
            AttemptView attemptView = new AttemptView(game.getAttempt(i));
            attemptViews.add(attemptView);
            printPlayedAttempts();
            attemptView.interact();
            if(attemptView.isSucessful()) {
                Message.WIN.writeln();
                return;
            }
        }
        Message.LOSE.writeln();
    }

    private void printPlayedAttempts() {
        for(AttemptView attemptView : attemptViews) {
            attemptView.printResult();
        }
    }
}
