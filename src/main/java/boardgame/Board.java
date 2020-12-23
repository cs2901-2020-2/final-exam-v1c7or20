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

    public void drawBoard(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("------------------\n");

    }

    public boolean playPiece(Piece piece, int cordX, int cordY){
        if (cordX < 9 && cordY <9 && table[cordX][cordY] == 'V'){
            if (checkData(piece, cordX, cordY)) return false;
            for (int i = 0; i < 5; i++) {
                int xPiece = piece.getFicha()[i][0];
                int yPiece = piece.getFicha()[i][1];
                if (xPiece != -1 && yPiece != -1){
                    table[cordX+xPiece][cordY+yPiece] = 'H';
                }
            }
        }
        return true;
    }

    private boolean checkData(Piece piece, int cordX, int cordY) {
        for (int i = 0; i < 5; i++) {
            int xPiece = piece.getFicha()[i][0];
            int yPiece = piece.getFicha()[i][1];
            if (xPiece != -1 && yPiece != -1 && table[cordX +xPiece][cordY +yPiece] != 'V'){
                    return true;
            }
        }
        return false;
    }

    public int getPoints(){
        int totalScore = 0;
        totalScore += verifyBlocks();
        totalScore += verifyColumnOrF();
        return totalScore;
    }

    public boolean verifyEnd(){
        return false;
    }

    private int verifyBlocks(){
        int score = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (table[i][j] == 'H' && table[i][j+1] == 'H'
                && table[i][j+2] == 'H' && table[i+1][j] == 'H'
                && table[i+1][j+1] == 'H' && table[i+1][j+2] == 'H'
                && table[i+2][j] == 'H' && table[i+2][j+1] == 'H'
                && table[i+2][j+2] == 'H'){
                    table[i][j] = 'V';
                    table[i][j+1] = 'V';
                    table[i][j+2] = 'V';
                    table[i+1][j] = 'V';
                    table[i+1][j+1] = 'V';
                    table[i+1][j+2] = 'V';
                    table[i+2][j] = 'V';
                    table[i+2][j+1] = 'V';
                    table[i+2][j+2] = 'V';
                    score += 150;
                }
            }
        }
        return score;
    }

    private int verifyColumnOrF(){
        int score = 0;
        for (int i = 0; i < 9; i++) {
            if (table[i][0] == 'H' && table[i][1] == 'H' && table[i][2] == 'H'
            && table[i][3] == 'H' && table[i][4] == 'H' && table[i][5] == 'H'
            && table[i][6] == 'H' && table[i][7] == 'H' && table[i][8] == 'H'){
                table[i][0] = 'V';
                table[i][1] = 'V';
                table[i][2] = 'V';
                table[i][3] = 'V';
                table[i][4] = 'V';
                table[i][5] = 'V';
                table[i][6] = 'V';
                table[i][7] = 'V';
                table[i][8] = 'V';
                score += 120;
            }
            if (table[0][i] == 'H' && table[1][i] == 'H' && table[2][i] == 'H'
            && table[3][i] == 'H' && table[4][i] == 'H' && table[5][i] == 'H'
            && table[6][i] == 'H' && table[7][i] == 'H' && table[8][i] == 'H'){
                table[0][i] = 'V';
                table[1][i] = 'V';
                table[2][i] = 'V';
                table[3][i] = 'V';
                table[4][i] = 'V';
                table[5][i] = 'V';
                table[6][i] = 'V';
                table[7][i] = 'V';
                score += 120;
            }
        }
        return score;
    }

}
