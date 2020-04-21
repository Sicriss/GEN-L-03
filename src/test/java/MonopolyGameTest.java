import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonopolyGameTest
{
    @Test
    void theNumberOfPlayersHasToBeCorrect()
    {
        assertThrows(IllegalArgumentException.class, () -> {MonopolyGame monopolyGame = new MonopolyGame(new String[]{"Paul"});});
    }
}
