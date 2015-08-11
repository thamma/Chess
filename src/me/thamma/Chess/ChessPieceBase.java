package me.thamma.Chess;

public abstract class ChessPieceBase implements ChessPiece {
	
	private Color color;
	private Coordinate coordinate;

	@Override
	public Coordinate getCoordinate() {
		return coordinate;
	}

	@Override
	public Color getColor() {
		return color;
	}

}