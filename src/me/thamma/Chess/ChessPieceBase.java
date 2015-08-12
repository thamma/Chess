package me.thamma.Chess;

public abstract class ChessPieceBase implements ChessPiece {

	private Color color;
	private Coordinate coordinate;

	/**
	 * @param arg0
	 *            The coordinate the piece is at
	 * @param arg1
	 *            The color the piece belongs to
	 */
	public ChessPieceBase(Coordinate arg0, Color arg1) {
		this.coordinate = arg0;
		this.color = arg1;
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
		for (ChessPiece p : b) {
			if (p.canMove(this.getCoordinate()))
				return true;
		}
		return false;
	}

	@Override
	public String getName() {
		return this.getClass().getName().replaceFirst("me.thamma.Chess.ChessPiece", "");
	}

}