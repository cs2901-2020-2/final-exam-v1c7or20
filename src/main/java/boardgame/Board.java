package boardgame;

import java.util.logging.Logger;

public class Board {
    private char [][] table;
    private static final Logger logger = Logger.getLogger(Board.class.getName());

    public Board(){
        table = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                table[i][j] = 'V';
            }
        }
    }

    public void drawBoard(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                logger.info(table[i][j] + " ");
            }
            logger.info("\n");
        }
    }

    public boolean playPiece(Piece piece, int cordX, int cordY){
        if (cordX < 9 && cordY <9){
            if (table[cordX][cordY] == 'V'){
                for (int i = 0; i < 5; i++) {
                    int xPiece = piece.getFicha()[i][0];
                    int yPiece = piece.getFicha()[i][1];
                    if (xPiece != -1 && yPiece != -1){
                        if (table[cordX+xPiece][cordY+yPiece] != 'V'){
                            return false;
                        }
                    }
                }
                for (int i = 0; i < 5; i++) {
                    int xPiece = piece.getFicha()[i][0];
                    int yPiece = piece.getFicha()[i][1];
                    if (xPiece != -1 && yPiece != -1){
                        table[cordX+xPiece][cordY+yPiece] = 'H';
                    }
                }
            }
        }
        return true;
    }
}
