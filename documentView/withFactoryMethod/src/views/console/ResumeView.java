package views.console;

import models.Game;
import utils.YesNoDialog;
import views.Message;
import views.WithGameView;

public class ResumeView extends WithGameView {
    public ResumeView(Game game) {
        super(game);
    }

    public boolean interact() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }
}
