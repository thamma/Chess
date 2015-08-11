package me.thamma.Chess;

public abstract class ChessPieceBase implements ChessPiece {

    private Color color;
    private Coordinate coordinate;

    public ChessPieceBase(Color color, Coordinate coordinate) {
		this.color = color;
		this.coordinate = coordinate;
	}

	@Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public Color getColor() {
        return color;
    }

}