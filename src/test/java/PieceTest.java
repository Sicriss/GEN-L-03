import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PieceTest
{
    private Square s;
    private Square s2;
    private Piece p;

    @BeforeEach
    void initializeValues()
    {
        s = new RegularSquare("Square 1");
        s2 = new RegularSquare("Square 2");
        p = new Piece ("Piece de Jean-Paul",s);
    }

    @Test
    void thePieceShouldBeInitializedProperly()
    {
        assertEquals("Piece de Jean-Paul", p.getName());
        assertEquals(s, p.getLocation());
    }

    @Test
    void thePieceShouldBeMovedProperly()
    {
        p.setLocation(s2);
        assertEquals(s2, p.getLocation());
    }
}
