import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GoToJailSquareTest
{
    @Test
    void playerShouldReceiveMoneyOnTheGoSquare()
    {
        Cup cup = new Cup(2);

        Board board = new Board();

        Player player = new Player("Paul", cup, board);

        Square jail = new RegularSquare("Jail");

        player.setLocation(new GoToJailSquare("GoToJail", jail));

        player.getLocation().landedOn(player);

        assertSame(player.getLocation(), jail);
    }
}
