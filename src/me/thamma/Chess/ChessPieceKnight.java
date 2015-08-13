package me.thamma.Chess;

public class ChessPieceKnight extends ChessPieceBase {

	/**
	 * @param coordinate
	 *            The coordinate the piece is at
	 * @param color
	 *            The color the piece belongs to
	 */
	public ChessPieceKnight(Color color, Coordinate coordinate) {
		super(color, coordinate);
	}

	@Override
	public boolean canMove(Coordinate target) {
		if (getCoordinate().equals(target) || !target.inBounds()) {
			return false;
		}
		Coordinate move = target.sub(this.getCoordinate());
		return (move.x * move.x + move.y * move.y) == 5;
	}

	@Override
	public void performMove(Coordinate target) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCode() {
		return "k";
	}

}
