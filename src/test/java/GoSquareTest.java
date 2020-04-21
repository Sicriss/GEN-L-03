import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GoSquareTest
{
    @Test
    void playerShouldReceiveMoneyOnTheGoSquare()
    {
        ArrayList<Die> diceList = new ArrayList<Die>();

        for (int i = 0; i < 2; ++i)
        {
            diceList.add(new Die());
        }

        Board board = new Board();

        Player player = new Player("Paul", diceList, board);

        player.getLocation().landedOn(player);

        assertEquals(1700, player.getNetWorth());
    }
}
