package boardgame;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Tests {
    @Test
    public void test_draw(){
        Board board = new Board();
        board.drawBoard();
        Assert.assertTrue(true);
    }

    @Test
    public void test_play(){
        Board board = new Board();
        board.drawBoard();
        Piece piece = new Piece(0);
        board.playPiece(piece, 0,0);
        board.drawBoard();
        Assert.assertTrue(true);
    }

    @Test
    public void test_piece_gen(){
        Piece piece0 = new Piece(0);
        Assert.assertEquals(piece0.getFicha()[0][0], 0);
        Piece piece1 = new Piece(1);
        Assert.assertEquals(piece0.getFicha()[0][0], 0);
        Piece piece2 = new Piece(2);
        Assert.assertEquals(piece0.getFicha()[0][0], 0);
        Piece piece3 = new Piece(3);
        Assert.assertEquals(piece0.getFicha()[0][0], 0);
        Piece piece4 = new Piece(4);
        Assert.assertEquals(piece0.getFicha()[0][0], 0);
        Piece piece5 = new Piece(5);
        Assert.assertEquals(piece0.getFicha()[0][0], 0);
        Piece piece6 = new Piece(6);
        Assert.assertEquals(piece0.getFicha()[0][0], 0);
        Piece piece7 = new Piece(7);
        Assert.assertEquals(piece0.getFicha()[0][0], 0);


    }
}
