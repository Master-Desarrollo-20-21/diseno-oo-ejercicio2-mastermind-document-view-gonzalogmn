package views;

import models.Game;

public class View extends WithGameView {
    private StartView startView;
    private PlayView playView;
    private ResumeView resumeView;

    public View(Game game) {
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
