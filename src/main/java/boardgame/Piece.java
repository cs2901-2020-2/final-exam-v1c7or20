package boardgame;

public class Piece {

    private char[][] ficha = new char[3][3];
    public Piece(int nrPiece){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ficha[i][j] = 'V';
            }
        }
        switch (nrPiece){
            case 0:
                ficha[0][0] = 'H';
                ficha[1][0] = 'H';
                ficha[2][0] = 'H';
                ficha[2][1] = 'H';
                ficha[2][2] = 'H';
                break;
            case 1:
                ficha[0][0] = 'H';
                ficha[0][1] = 'H';
                ficha[0][2] = 'H';
                ficha[1][2] = 'H';
                ficha[2][2] = 'H';
                break;
            case 2:
                ficha[0][0] = 'H';
                ficha[0][1] = 'H';
                ficha[0][2] = 'H';
                break;
            case 3:
                ficha[0][0] = 'H';
                ficha[1][0] = 'H';
                ficha[2][0] = 'H';
                break;
            case 4:
                ficha[0][1] = 'H';
                ficha[1][1] = 'H';
                ficha[2][1] = 'H';
                ficha[2][0] = 'H';
                ficha[2][2] = 'H';
                break;
            case 5:
                ficha[0][1] = 'H';
                ficha[1][1] = 'H';
                ficha[2][1] = 'H';
                ficha[0][0] = 'H';
                ficha[0][2] = 'H';
                break;
            case 6:
                ficha[0][0] = 'H';
                ficha[1][0] = 'H';
                ficha[2][0] = 'H';
                ficha[2][1] = 'H';
                break;
            case 7:
                ficha[0][0] = 'H';
                ficha[1][0] = 'H';
                ficha[2][0] = 'H';
                ficha[0][1] = 'H';
                break;
            default:
                break;
        }
    }
}
