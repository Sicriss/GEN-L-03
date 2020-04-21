import java.util.Random;

public class Die
{
    private final static int MAX_VAL = 6;
    private int faceValue;

    public void roll()
    {
        faceValue = new Random().nextInt(MAX_VAL) + 1;
    }

    public int getValue()
    {
        return faceValue;
    }
}
