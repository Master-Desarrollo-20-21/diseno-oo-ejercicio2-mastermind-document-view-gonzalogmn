package views.console;

import models.Game;
import views.View;

public class ConsoleView extends View {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView(Game game) {
        super(game);
        this.startView = new StartView(game);
        this.playView = new PlayView(game);
        this.resumeView = new ResumeView(game);
    }

    public void interact() {
        this.startView.interact();
        this.playView.interact();
    }

    public boolean toResume() {
        return this.resumeView.interact();
    }
}
