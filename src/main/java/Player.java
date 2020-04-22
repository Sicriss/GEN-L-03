import java.util.ArrayList;

public class Player
{
    private String name;
    private Piece piece;
    private Cup cup;
    private Board board;
    private double money;

    public Player(String name, Cup cup, Board board)
    {
        this.name = name;
        this.cup = cup;
        this.board = board;
        this.piece = new Piece(name + "'s Piece", board.getStartingPos());
        this.money = 1500;
    }

    public void takeTurn()
    {
        int value = cup.getValue();

        cup.roll();

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
