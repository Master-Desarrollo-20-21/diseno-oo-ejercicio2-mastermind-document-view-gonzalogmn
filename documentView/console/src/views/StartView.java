package views;

import models.Game;

public class StartView extends WithGameView {
    public StartView(Game game) {
        super(game);
    }

    public void interact() {
        Message.TITLE.writeln();
    }
}
