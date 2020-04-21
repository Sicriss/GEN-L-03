import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest
{
    @Test
    void theSquareShouldGetTheCorrectName()
    {
        Square s = new Square("GO");
        assertEquals("GO", s.getName());
    }
}
