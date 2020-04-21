import java.util.ArrayList;

public class MonopolyGame
{
    private final static int NUMBER_ROUNDS = 20;
    private final static int NUMBER_DICES = 2;
    private ArrayList<Die> diceList;
    private Board board;
    private ArrayList<Player> playerList;

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

        diceList = new ArrayList<Die>();

        for (int i = 0; i < NUMBER_DICES; ++i)
        {
            diceList.add(new Die());
        }

        board = new Board();

        playerList = new ArrayList<Player>();

        for (String name : playerNames)
        {
            playerList.add(new Player(name, diceList, board));
        }

        playGame();
    }

    private void playGame()
    {
        // Each round
        for (int i = 0; i < NUMBER_ROUNDS; ++i)
        {
            playRound();
        }
    }

    private void playRound()
    {
        // Each turn
        for (Player p : this.playerList)
        {
            p.takeTurn();
        }
    }
}
