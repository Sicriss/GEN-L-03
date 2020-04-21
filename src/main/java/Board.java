import java.util.ArrayList;

public class Board
{
    private ArrayList<Square> squares;

    public Square getStartingPos()
    {
        return this.squares.get(0);
    }

    public Board()
    {

    }
}
