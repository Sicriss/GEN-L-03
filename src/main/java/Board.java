import java.util.ArrayList;

public class Board
{
    private static final int NUMBER_SQUARES = 40;
    private ArrayList<Square> squares;

    public Square getStartingPos()
    {
        return this.squares.get(0);
    }

    public Board()
    {
        squares = new ArrayList<Square>();

        squares.add(new Square("GO"));

        for (int i = 1; i < NUMBER_SQUARES; ++i)
        {
            squares.add(new Square("Square " + String.valueOf(i)));
        }
    }

    public Square getSquare(Square oldLocation, int offset)
    {
        return squares.get(squares.indexOf(oldLocation) + offset % squares.size());
    }

}
