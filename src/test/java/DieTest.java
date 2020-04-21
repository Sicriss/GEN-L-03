import org.graalvm.compiler.hotspot.stubs.OutOfBoundsExceptionStub;
import org.junit.jupiter.api.Test;

public class DieTest
{
    @Test
    void theDieValueShouldRemainPossible()
    {
        Die d = new Die();

        for (int i = 0; i < 100; i++)
        {
            d.roll();

            assert(d.getValue() <= 6 && d.getValue() >= 1);
        }
    }
}
