import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest
{
    ArrayList<Die> diceList;
    Board board;

    @BeforeEach
    public void initializePlayerConstructorValues()
    {
        diceList = new ArrayList<Die>();

        for (int i = 0; i < 2; ++i)
        {
            diceList.add(new Die());
        }

        board = new Board();
    }

    @Test
    void thePlayerNameShouldBeCorrect()
    {
        Player p = new Player("Jean-Paul", diceList, board);
        assertEquals("Jean-Paul", p.getName());
    }

    @Test
    void thePlayerShouldStartInTheGoCell()
    {
        Player p = new Player("Jean-Paul", diceList, board);
        assertEquals("GO", p.getLocation().getName());
    }
}
