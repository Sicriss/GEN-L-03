import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DieTest
{
    @RepeatedTest(20)
    void theDieValueShouldRemainPossible()
    {
        Die d = new Die();

        d.roll();

        assert(d.getValue() <= 6 && d.getValue() >= 1);
    }
}
