import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GoSquareTest
{
    @Test
    void playerShouldReceiveMoneyOnTheGoSquare()
    {
        Cup cup = new Cup(2);

        Board board = new Board();

        Player player = new Player("Paul", cup, board);

        player.getLocation().landedOn(player);

        assertEquals(1700, player.getNetWorth());
    }
}
