package views;

import models.Game;
import views.console.PlayView;
import views.console.ResumeView;
import views.console.StartView;

public abstract class View extends WithGameView {

    public View(Game game) {
        super(game);
    }

    public abstract void interact();

    public abstract boolean toResume();
}
