package me.thamma.Chess;

public abstract class ChessPieceBase implements ChessPiece {

	private Color color;
	private Coordinate coordinate;

	/**
	 * @param coordinate
	 *            The coordinate the piece is at
	 * @param color
	 *            The color the piece belongs to
	 */
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

	@Override
	public boolean isThreatened() {
		Board b = null;
		//TODO
		//Board b should be the board the ChessPiece is on
		for (ChessPiece p : b) {
			if (p.canMove(this.getCoordinate()))
				return true;
		}
		return false;
	}

	@Override
	public String getName() {
		return this.getColor() + " " + this.getClass().getName().replaceFirst("me.thamma.Chess.ChessPiece", "");
	}

}