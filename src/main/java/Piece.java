public class Piece
{
    private String name;
    private Square location;

    public Piece(String name, Square startingPos)
    {
        this.name = name;
        this.location = startingPos;
    }

    public String getName()
    {
        return name;
    }

    public Square getLocation()
    {
        return location;
    }

    public void setLocation(Square square)
    {
        this.location = square;
    }
}
