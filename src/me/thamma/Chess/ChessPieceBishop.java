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
	public boolean canMove(Coordinate arg0) {
		// TODO Auto-generated method stub0
		return false;
	}

	@Override
	public void performMove(Coordinate arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCode() {
		return "b";
	}

}
