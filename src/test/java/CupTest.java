import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CupTest
{
    @RepeatedTest(10)
    void aCupShouldProduceNumbersInTheCorrectRange()
    {
        Cup c = new Cup(3);

        c.roll();

        assert (c.getValue() >= 3 && c.getValue() <= 18);
    }
}
