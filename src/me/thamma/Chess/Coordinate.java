package me.thamma.Chess;

public class Coordinate {

	private int x;
	private int y;

	/**
	 * 
	 * @param arg0
	 *            The column
	 * @param arg1
	 *            The row
	 */
	public Coordinate(int arg0, int arg1) {
		this.x = arg0;
		this.y = arg1;
	}

	/**
	 * 
	 * @param arg0
	 *            The position as string; for instance "a1"
	 */
	public Coordinate(String arg0) {
		//TODO
	}

	/**
	 * 
	 * @return The position as String; for instance "a1"
	 */
	@Override
	public String toString() {
		//TODO
		return null;
	}

	/**
	 * 
	 * @return Whether the coordinate is on the board
	 */
	public boolean inBounds() {
		//TODO
		return false;
	}

}
