import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class IncomeTaxSquareTest
{
    @Test
    void playerShouldReceiveMoneyOnTheGoSquare()
    {
        Cup cup = new Cup(2);

        Board board = new Board();

        Player player = new Player("Paul", cup, board);

        Square taxes = new IncomeTaxSquare("Taxes");

        player.setLocation(taxes);

        player.getLocation().landedOn(player);

        assertEquals(player.getNetWorth(), 1350);
    }
}
