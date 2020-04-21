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

        for (int i = 0; i < NUMBER_SQUARES; ++i)
        {
            switch (i)
            {
                case 0:
                    squares.add(new GoSquare("GO"));
                    break;
                case 10:
                    squares.add(new RegularSquare("Jail"));
                    break;
                case 20:
                    squares.add(new IncomeTaxSquare("Taxes"));
                    break;
                case 30:
                    squares.add(new GoToJailSquare("GoToJail", squares.get(10)));
                    break;
                default:
                    squares.add(new RegularSquare("Square " + String.valueOf(i)));
                    break;
            }
        }
    }

    public Square getSquare(Square oldLocation, int offset)
    {
        return squares.get(squares.indexOf(oldLocation) + offset % squares.size());
    }

}
