import java.util.ArrayList;

public class Cup
{
    ArrayList<Die> diceList;

    public Cup(int diceNumber)
    {
        diceList = new ArrayList<Die>();

        for (int i = 0; i < diceNumber; ++i)
        {
            diceList.add(new Die());
        }
    }

    public void roll()
    {
        for (Die d : diceList)
        {
            d.roll();
        }
    }

    public int getValue()
    {
        int value = 0;

        for (Die d : diceList)
        {
            value += d.getValue();
        }

        return value;
    }
}
