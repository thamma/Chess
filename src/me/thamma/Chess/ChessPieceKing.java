package me.thamma.Chess;

public class ChessPieceKing extends ChessPieceBase {

	/**
	 * @param coordinate
	 *            The coordinate the piece is at
	 * @param color
	 *            The color the piece belongs to
	 */
	public ChessPieceKing(Color color, Coordinate coordinate) {
		super(color, coordinate);
	}

	@Override
	public boolean canMove(Coordinate target) {
		if (getCoordinate().equals(target) || !target.inBounds()) {
			return false;
		}
		return Math.abs((target.x - this.getCoordinate().x)) == 1
				|| Math.abs((target.y - this.getCoordinate().y)) == 1;
	}

	@Override
	public void performMove(Coordinate target) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCode() {
		return "K";
	}

}
