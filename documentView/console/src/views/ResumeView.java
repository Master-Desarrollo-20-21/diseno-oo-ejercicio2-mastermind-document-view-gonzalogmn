package views;

import models.Game;
import utils.YesNoDialog;

public class ResumeView extends WithGameView {
    public ResumeView(Game game) {
        super(game);
    }

    public boolean interact() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }
}
