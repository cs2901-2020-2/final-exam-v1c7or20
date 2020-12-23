package boardgame;

import java.util.Random;
import java.util.Scanner;


public class Application {

    public Piece generatePiece(){
        Random random = new Random();
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
    }


}
