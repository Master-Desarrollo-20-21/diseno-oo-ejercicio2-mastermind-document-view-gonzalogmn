package views.console;

import models.Game;
import views.Message;
import views.WithGameView;

public class StartView extends WithGameView {
    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        Message.TITLE.writeln();
    }
}
