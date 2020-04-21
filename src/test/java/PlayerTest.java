import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    void thePlayerMoneyAmountShouldBeCorrect()
    {
        Player p = new Player("Jean-Paul", diceList, board);
        assertEquals(1500, p.getNetWorth());
    }

    @Test
    void thePlayerPieceHasBeenCreatedProperly()
    {
        Player p = new Player("Jean-Paul", diceList, board);
        assertNotNull(p.getPiece());
    }


    @Test
    void thePlayerShouldStartInTheGoCell()
    {
        Player p = new Player("Jean-Paul", diceList, board);
        assertEquals("GO", p.getLocation().getName());
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0d, 3.0d, 15.3d, 50000.555})
    void thePlayerShouldReceiveMoneyAsExpected(double montant)
    {
        Player p = new Player("Jean-Paul", diceList, board);
        p.addCash(montant);
        assertEquals(p.getNetWorth(), 1500 + montant);
    }
}
