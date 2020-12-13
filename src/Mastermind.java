public class Mastermind {

    private Game game;
    private Player player;

    public Mastermind() {
        player = new Player();
        this.game = new Game(player);
    }

    public void play() {
        this.game = new Game(player);
        this.game.play();
        resume();
    }

    public void resume() {
        boolean resume = this.player.resume();
        if(resume == true) {
            this.play();
        }

    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
