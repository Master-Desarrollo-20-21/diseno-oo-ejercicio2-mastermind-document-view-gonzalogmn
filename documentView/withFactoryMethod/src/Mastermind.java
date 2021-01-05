import models.Game;
import views.View;

public abstract class Mastermind {
    private Game game;
    private View view;

    protected Mastermind() {
        this.game = new Game();
        this.view = this.createView(this.game);
    }

    public void play() {
        this.game = new Game();
        this.view = this.createView(this.game);
        this.view.interact();
        resume();
    }

    protected abstract View createView(Game game);

    public void resume() {
        boolean resume = this.view.toResume();
        if(resume == true) {
            this.play();
        }
    }
}
