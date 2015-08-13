package me.thamma.Chess;

public class ChessPiecePawn extends ChessPieceBase {

	/**
	 * @param coordinate
	 *            The coordinate the piece is at
	 * @param color
	 *            The color the piece belongs to
	 */
	public ChessPiecePawn(Color color, Coordinate coordinate) {
		super(color, coordinate);
	}

	@Override
	public boolean canMove(Coordinate target) {
		if (getCoordinate().equals(target) || !target.inBounds()) {
			return false;
		}
		if (getColor() == Color.WHITE) {
			return target.x == getCoordinate().x
					&& target.y == getCoordinate().y + 1;
		} else {
			return target.x == getCoordinate().x
					&& target.y == getCoordinate().y - 1;
		}
	}

	@Override
	public void performMove(Coordinate target) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCode() {
		return "p";
	}

}
