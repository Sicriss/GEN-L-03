public class GoSquare extends Square
{
    GoSquare(String s)
    {
        super(s);
    }

    @Override
    public void landedOn(Player player)
    {
        player.addCash(200);
        System.out.println(player.getName() + " landed on " + this.getName() + " and received 200 !");
    }
}
