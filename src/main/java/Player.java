import java.util.ArrayList;

public class Player
{
    private String name;
    private Piece piece;
    private ArrayList<Die> dices;
    private Board board;
    private double money;

    public Player(String name, ArrayList<Die> dices, Board board)
    {
        this.name = name;
        this.dices = dices;
        this.board = board;
        this.piece = new Piece(name + "'s Piece", board.getStartingPos());
        this.money = 1500;
    }

    public void takeTurn()
    {
        int value = 0;

        for (Die d : dices)
        {
            d.roll();
            value += d.getValue();
        }

        System.out.println(name + " rolled " + String.valueOf(value));

        piece.setLocation(board.getSquare(piece.getLocation(), value));

        piece.getLocation().landedOn(this);
    }

    public String getName()
    {
        return this.name;
    }

    public Square getLocation()
    {
        return this.piece.getLocation();
    }

    public void setLocation(Square square)
    {
        this.piece.setLocation(square);
    }

    public double getNetWorth() { return this.money; }

    public Piece getPiece() { return this.piece; }

    public void reduceCash(double montant)
    {
        this.money -= montant;
    }

    public void addCash(double montant)
    {
        this.money += montant;
    }
}
