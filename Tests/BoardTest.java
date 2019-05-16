import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {

    @Before
    public void setUp(){
        Board board = new Board();
    }


    @Test
    public void emptyBoardIs3ArraysOf3Dots(){
        Board board = new Board();
        String expected = "...\n...\n...\n";
        String actual = board.printTheBoard();

        Assert.assertEquals(expected, actual);
    }

}