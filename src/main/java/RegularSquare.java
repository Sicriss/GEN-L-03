public class RegularSquare extends Square
{
    RegularSquare(String s)
    {
        super(s);
    }

    @Override
    public void landedOn(Player player)
    {
        // Nothing to be done here.
        System.out.println(player.getName() + " landed on " + this.getName());
    }
}
