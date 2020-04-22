import java.util.ArrayList;

public class MonopolyGame
{
    private final static int NUMBER_ROUNDS = 20;
    private final static int NUMBER_DICES = 2;
    private Cup cup;
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

        cup = new Cup(NUMBER_DICES);

        board = new Board();

        playerList = new ArrayList<Player>();

        for (String name : playerNames)
        {
            playerList.add(new Player(name, cup, board));
        }

        System.out.println("The game is about to begin");

        playGame();

        System.out.println("The game has ended, the results are below.");

        for (Player p : playerList)
        {
            System.out.println(p.getName() + " - " + p.getNetWorth());
        }
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
