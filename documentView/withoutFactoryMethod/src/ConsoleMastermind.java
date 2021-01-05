import models.Game;
import views.View;
import views.console.ConsoleView;

public class ConsoleMastermind {
    private Game game;
    private View view;

    public ConsoleMastermind() {
        this.game = new Game();
        this.view = new ConsoleView(this.game);
    }

    public void play() {
        this.game = new Game();
        this.view = new ConsoleView(this.game);
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
        new ConsoleMastermind().play();
    }

}
