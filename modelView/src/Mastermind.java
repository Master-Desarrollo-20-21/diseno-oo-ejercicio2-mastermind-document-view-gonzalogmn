public class Mastermind {

    private Game game;

    public Mastermind() {
        this.game = new Game();
    }

    public void play() {
        this.game = new Game();
        this.game.play();
        resume();
    }

    public void resume() {
        boolean resume = this.game.toResume();
        if(resume == true) {
            this.play();
        }

    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
