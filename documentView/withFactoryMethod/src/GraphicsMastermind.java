import models.Game;
import views.View;
import views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected View createView(Game game) {
        return new GraphicsView(game);
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
