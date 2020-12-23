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
        Assert.assertEquals(piece1.getFicha()[0][0], 0);
        Piece piece2 = new Piece(2);
        Assert.assertEquals(piece2.getFicha()[0][0], 0);
        Piece piece3 = new Piece(3);
        Assert.assertEquals(piece3.getFicha()[0][0], 0);
        Piece piece4 = new Piece(4);
        Assert.assertEquals(piece4.getFicha()[0][0], 2);
        Piece piece5 = new Piece(5);
        Assert.assertEquals(piece5.getFicha()[0][0], 0);
        Piece piece6 = new Piece(6);
        Assert.assertEquals(piece6.getFicha()[0][0], 0);
        Piece piece7 = new Piece(7);
        Assert.assertEquals(piece7.getFicha()[0][0], 0);
    }

    @Test
    public void test_points(){
        Board board = new Board();
        Piece piece = new Piece(3);
        board.playPiece(piece, 0,0);
        board.playPiece(piece, 3,0);
        board.playPiece(piece, 6,0);
        board.drawBoard();
        Assert.assertEquals(board.getPoints(), 120);
        board.playPiece(piece, 0,0);
        board.playPiece(piece, 0,1);
        board.playPiece(piece, 0,2);
        board.drawBoard();
        Assert.assertEquals(board.getPoints(), 150);
        Piece piece1 = new Piece(2);
        board.playPiece(piece1, 0,0);
        board.playPiece(piece1, 0,3);
        board.playPiece(piece1, 0,6);
        board.drawBoard();
        Assert.assertEquals(board.getPoints(), 120);

    }
}
