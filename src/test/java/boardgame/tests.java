package boardgame;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class tests {
    @Test
    public void test_draw(){
        Board board = new Board();
        board.drawBoard();
        Assert.assertTrue(true);
    }
}
