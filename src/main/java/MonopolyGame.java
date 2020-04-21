public class MonopolyGame
{
    private final static int NUMBER_ROUNDS = 20;
    private Player[] playerList;
    private Die[] diceList = {new Die(), new Die()};
    private Board board = new Board();

    public static void main (String[] args)
    {
        try
        {
            MonopolyGame game = new MonopolyGame(args);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public MonopolyGame(String[] playerNames)
    {
        if (playerNames.length > 8 || playerNames.length < 2)
            throw new IllegalArgumentException("The number of players is incorrect");

        this.playerList = new Player[playerNames.length];

        for (int i = 0; i < playerNames.length; ++i)
        {
            this.playerList[i] = new Player(playerNames[i]);
        }

        playGame();
    }

    public void playGame()
    {
        // Each round
        for (int i = 0; i < NUMBER_ROUNDS; ++i)
        {
            playRound();
        }
    }

    public void playRound()
    {
        // Each turn
        for (Player p : this.playerList)
        {
            p.takeTurn();
        }
    }
}
