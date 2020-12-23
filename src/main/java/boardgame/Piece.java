package boardgame;

public class Piece {

    public int[][] getFicha() {
        return ficha;
    }

    private int[][] ficha = new int[5][2];
    public Piece(int nrPiece){
        for (int i = 0; i < 3; i++) {
                ficha[i][0] = -1;
                ficha[i][1] = -1;
        }
        switch (nrPiece){
            case 0:
                ficha[0][0] = 0;
                ficha[0][1] = 0;
                ficha[1][0] = 1;
                ficha[1][1] = 0;
                ficha[2][0] = 2;
                ficha[2][1] = 0;
                ficha[3][0] = 2;
                ficha[3][1] = 1;
                ficha[4][0] = 2;
                ficha[4][1] = 2;
                break;
            case 1:
                ficha[0][0] = 0;
                ficha[0][1] = 0;
                ficha[1][0] = 0;
                ficha[1][1] = 1;
                ficha[2][0] = 0;
                ficha[2][1] = 2;
                ficha[3][0] = 1;
                ficha[3][1] = 2;
                ficha[4][0] = 2;
                ficha[4][1] = 2;
                break;
            case 2:
                ficha[0][0] = 0;
                ficha[0][1] = 0;
                ficha[1][0] = 0;
                ficha[1][1] = 1;
                ficha[2][0] = 0;
                ficha[2][1] = 2;
                break;
            case 3:
                ficha[0][0] = 0;
                ficha[0][1] = 0;
                ficha[1][0] = 1;
                ficha[1][1] = 0;
                ficha[2][0] = 2;
                ficha[2][1] = 0;
                break;
            case 4:
                ficha[0][0] = 2;
                ficha[0][1] = 0;
                ficha[1][0] = 2;
                ficha[1][1] = 1;
                ficha[2][0] = 2;
                ficha[2][1] = 2;
                ficha[3][0] = 1;
                ficha[3][1] = 1;
                ficha[4][0] = 0;
                ficha[4][1] = 1;
                break;
            case 5:
                ficha[0][0] = 0;
                ficha[0][1] = 0;
                ficha[1][0] = 0;
                ficha[1][1] = 1;
                ficha[2][0] = 0;
                ficha[2][1] = 2;
                ficha[3][0] = 1;
                ficha[3][1] = 1;
                ficha[4][0] = 2;
                ficha[4][1] = 1;
                break;
            case 6:
                ficha[0][0] = 0;
                ficha[0][1] = 0;
                ficha[1][0] = 1;
                ficha[1][1] = 0;
                ficha[2][0] = 2;
                ficha[2][1] = 0;
                ficha[3][0] = 2;
                ficha[3][1] = 1;
                break;
            case 7:
                ficha[0][0] = 0;
                ficha[0][1] = 0;
                ficha[1][0] = 1;
                ficha[1][1] = 0;
                ficha[2][0] = 2;
                ficha[2][1] = 0;
                ficha[3][0] = 0;
                ficha[3][1] = 1;
                break;
            default:
                break;
        }
    }
}
