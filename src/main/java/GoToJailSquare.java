public class GoToJailSquare extends Square
{
    private Square jailReference;

    GoToJailSquare(String s, Square jail)
    {
        super(s);
        this.jailReference = jail;
    }

    @Override
    public void landedOn(Player player)
    {
        player.setLocation(jailReference);
        System.out.println(player.getName() + " landed on " + this.getName() + " and was sent to " + jailReference.getName());
    }
}
