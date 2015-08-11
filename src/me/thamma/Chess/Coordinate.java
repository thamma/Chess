package me.thamma.Chess;

public class Coordinate {

	/*
		Functional Coodinate implementation with vector operations
	 */

	public int x;
	public int y;

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
		assert(arg0.length() == 2);
		this.x = arg0.charAt(0) - 'a';
		this.y = arg0.charAt(1) - '0';
	}

	/**
	 * 
	 * @return The position as String; for instance "a1"
	 */
	@Override
	public String toString() {
		final char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		return "" + alpha[this.x +1] + (this.y + 1);
	}

	/**
	 * 
	 * @return Whether the coordinate is on the board
	 */
	public boolean inBounds() {
		return this.x >= 0 && this.x <8 && this.y >= 0 && this.y <= 8;
	}

	/**
	 *
	 * @param arg0 The coordinate to be added
	 * @return The modified coordinate
	 */
	public Coordinate add(Coordinate arg0) {
		return new Coordinate(this.x + arg0.x, this.y + arg0.y);
	}

	/**
	 *
	 * @param arg0 The coordinate to be subtracted
	 * @return The modified coordinate
	 */
	public Coordinate sub(Coordinate arg0) {
		return new Coordinate(this.x - arg0.x, this.y - arg0.y);
	}


}
