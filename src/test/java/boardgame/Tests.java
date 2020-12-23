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
}
