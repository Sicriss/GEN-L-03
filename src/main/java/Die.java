import java.util.Random;

public class Die
{
    public int faceValue;

    public void roll()
    {
        faceValue = new Random().nextInt(6) + 1;
    }
}
