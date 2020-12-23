package boardgame;

public class Board {
    private char [][] table;

    public Board(){
        table = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                table[i][j] = 'V';
            }
        }
    }

    public void playPiece(Piece piece, int cord){
        if (cord < 9){
            for (int i = 0; i < 9; i++) {
                if (table[i][cord] != 'V'){

                    break;
                }
            }
        }
    }
}
