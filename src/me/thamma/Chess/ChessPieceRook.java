package me.thamma.Chess;

public class ChessPieceRook extends ChessPieceBase {

	/**
	 * @param coordinate
	 *            The coordinate the piece is at
	 * @param color
	 *            The color the piece belongs to
	 */
	public ChessPieceRook(Color color, Coordinate coordinate) {
		super(color, coordinate);
	}

	@Override
	public boolean canMove(Coordinate target) {
		if (getCoordinate().equals(target) || !target.inBounds()) {
			return false;
		}
		return (target.x - this.getCoordinate().x) == 0
				^ (target.y - this.getCoordinate().y) == 0;
	}

	@Override
	public void performMove(Coordinate target) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCode() {
		return "r";
	}

}
