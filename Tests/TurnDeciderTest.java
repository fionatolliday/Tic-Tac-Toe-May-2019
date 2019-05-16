import org.junit.Assert;
import org.junit.Test;

public class TurnDeciderTest {

    TurnDecider turnDecider = new TurnDecider();

    @Test
    public void Player1PlaysFirst(){
        String expected = "Player 1";
        String result = turnDecider.getCurrentPlayer();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void Player2PlaysSecond(){
        String expected = "Player 2";
        String result = turnDecider.getNextPlayer();

        Assert.assertEquals(expected, result);
    }
}
