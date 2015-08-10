package me.thamma.Chess;

public class Board {

	private ChessPiece[][] grid;

	public Board() {
		this.grid = new ChessPiece[8][8];
	}

	/**
	 * 
	 * @param arg0
	 *            The color to test for
	 * @return Whether arg0 is checkmated
	 */
	public boolean isCheckmated(Color arg0) {
		// TODO
		return false;
	}

	/**
	 * 
	 * @param arg0
	 *            The color to test for
	 * @return Whether arg0 is mated
	 */
	public boolean isMated(Color arg0) {
		// TODO
		return false;
	}

	/**
	 * 
	 * @return Which players turn it is
	 */
	public Color getTurnPlayer() {
		// TODO
		return null;
	}

	/**
	 * 
	 * @param arg0
	 *            The coordinate moving from
	 * @param arg1
	 *            The coordinate moving to
	 * @return True only iff the move was permit and actually performed, else
	 *         false
	 */
	public boolean performMove(Coordinate arg0, Coordinate arg1) {
		// TODO
		return false;
	}
}
