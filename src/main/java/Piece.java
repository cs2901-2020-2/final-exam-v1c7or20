public class Piece {

    private char[][] piece = new char[3][3];
    public Piece(int nr_piece){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                piece[i][j] = 'V';
            }
        }
        switch (nr_piece){
            case 0:
                piece[0][0] = 'H';
                piece[1][0] = 'H';
                piece[2][0] = 'H';
                piece[2][1] = 'H';
                piece[2][2] = 'H';
                break;
            case 1:
                piece[0][0] = 'H';
                piece[0][1] = 'H';
                piece[0][2] = 'H';
                piece[1][2] = 'H';
                piece[2][2] = 'H';
                break;
            case 2:
                piece[0][0] = 'H';
                piece[0][1] = 'H';
                piece[0][2] = 'H';
                break;
            case 3:
                piece[0][0] = 'H';
                piece[1][0] = 'H';
                piece[2][0] = 'H';
                break;
            case 4:
                piece[0][1] = 'H';
                piece[1][1] = 'H';
                piece[2][1] = 'H';
                piece[2][0] = 'H';
                piece[2][2] = 'H';
                break;
            case 5:
                piece[0][1] = 'H';
                piece[1][1] = 'H';
                piece[2][1] = 'H';
                piece[0][0] = 'H';
                piece[0][2] = 'H';
                break;
            case 6:
                piece[0][0] = 'H';
                piece[1][0] = 'H';
                piece[2][0] = 'H';
                piece[2][1] = 'H';
                break;
            case 7:
                piece[0][0] = 'H';
                piece[1][0] = 'H';
                piece[2][0] = 'H';
                piece[0][1] = 'H';
                break;

        }
    }
}
