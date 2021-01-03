import models.Game;
import views.View;

public class Mastermind {
    private Game game;
    private View view;

    public Mastermind() {
        this.game = new Game();
        this.view = new View(this.game);
    }

    public void play() {
        this.game = new Game();
        this.view = new View(this.game);
        this.view.interact();
        resume();
    }

    public void resume() {
        boolean resume = this.view.toResume();
        if(resume == true) {
            this.play();
        }
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
