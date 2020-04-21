import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest
{
    @Test
    void theStartingPosShouldBeNamesCorrectly()
    {
        Board b = new Board();
        Square s = b.getStartingPos();
        assertEquals("GO", s.getName());
    }

    @Test
    void theNewLocationShouldBeCalculatedProperly()
    {
        Board b = new Board();
        Square s = b.getStartingPos();
        Square s2 = b.getSquare(s, 14);
        assertEquals("Square 14", s2.getName());
    }
}
