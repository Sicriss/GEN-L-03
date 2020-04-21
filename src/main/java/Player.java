import java.util.ArrayList;

public class Player
{
    private String name;
    private Piece piece;
    private ArrayList<Die> dices;
    private Board board;

    public Player(String name, ArrayList<Die> dices, Board board)
    {
        this.name = name;
        this.dices = dices;
        this.board = board;
        this.piece = new Piece(name + "'s Piece", board.getStartingPos());
        // todo : piece;
    }

    public void takeTurn()
    {
        int value = 0;

        for (Die d : dices)
        {
            d.roll();
            value += d.getValue();
        }

        piece.setLocation(board.getSquare(piece.getLocation(), value));
    }

    public String getName()
    {
        return this.name;
    }
}
