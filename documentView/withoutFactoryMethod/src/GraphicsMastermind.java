import models.Game;
import views.View;
import views.graphics.GraphicsView;

public class GraphicsMastermind {
    private Game game;
    private View view;

    public GraphicsMastermind() {
        this.game = new Game();
        this.view = new GraphicsView(this.game);
    }

    public void play() {
        this.game = new Game();
        this.view = new GraphicsView(this.game);
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
        new GraphicsMastermind().play();
    }

}
