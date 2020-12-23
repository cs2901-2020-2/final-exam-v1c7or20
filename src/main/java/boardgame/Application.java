package boardgame;

import java.security.SecureRandom;
import java.util.Scanner;


public class Application {
    SecureRandom random = new SecureRandom();
    int totalPoints = 0;

    public Piece generatePiece(){
        int nrPiece = random.nextInt(8);
        return new Piece(nrPiece);
    }

    public void playGame(Board board){
        Scanner in = new Scanner(System.in);
        int cordX = 0;
        int cordY=0;
        System.out.print("Insert the coordinate X");
        cordX = in.nextInt();
        System.out.print("Insert the coordinate Y");
        cordY = in.nextInt();
        Piece inPlay = generatePiece();
        board.playPiece(inPlay, cordX,cordY);
        board.drawBoard();
        totalPoints += board.getPoints();
    }


}
