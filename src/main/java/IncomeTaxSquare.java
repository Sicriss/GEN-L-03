import static java.lang.Math.min;

public class IncomeTaxSquare extends Square
{
    IncomeTaxSquare(String s)
    {
        super(s);
    }

    @Override
    public void landedOn(Player player)
    {
        player.reduceCash(min(200, 0.1 * player.getNetWorth()));
    }
}
