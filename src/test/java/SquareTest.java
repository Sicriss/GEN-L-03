import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest
{
    @Test
    void theSquareShouldGetTheCorrectName()
    {
        Square s1 = new RegularSquare("Reg");
        Square s2 = new GoSquare("GO");
        Square s3 = new IncomeTaxSquare("Inc");
        Square s4 = new GoToJailSquare("Jail", s2); // Not jail but for example
        assertEquals("Reg", s1.getName());
        assertEquals("GO", s2.getName());
        assertEquals("Inc", s3.getName());
        assertEquals("Jail", s4.getName());
    }
}
