package boardgame;

public class Game {
    public static void main(String[] args) {
        Application application = new Application();
        Board board = new Board();
        System.out.print("Empezando el juego");
        while (!board.verifyEnd()){
            application.playGame(board);
        }
    }
}
