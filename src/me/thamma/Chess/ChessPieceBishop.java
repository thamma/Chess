package me.thamma.Chess;

public class ChessPieceBishop extends ChessPieceBase {

	/**
	 * @param coordinate
	 *            The coordinate the piece is at
	 * @param color
	 *            The color the piece belongs to
	 */
	public ChessPieceBishop(Color color, Coordinate coordinate) {
		super(color, coordinate);
	}

	@Override
	public boolean canMove(Coordinate target) {
		if (getCoordinate().equals(target) || !target.inBounds()) {
			return false;
		}
		return Math.abs(target.x - getCoordinate().x) == Math.abs(target.y
				- getCoordinate().y);

	}

	@Override
	public void performMove(Coordinate target) {
		// TODO Auto-generated method stub
	}

	@Override
	public String getCode() {
		return "b";
	}

}
