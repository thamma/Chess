package me.thamma.Chess;

public class Coordinate {

	/*
	 * Functional Coodinate implementation with vector operations
	 */

	public int x;
	public int y;

	/**
	 * 
	 * @param x
	 *            The column
	 * @param y
	 *            The row
	 */
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 
	 * @param input
	 *            The position as string; for instance "a1"
	 */
	public Coordinate(String input) {
		assert (input.length() == 2);
		this.x = input.charAt(0) - 'a';
		this.y = input.charAt(1) - '1';
	}

	/**
	 * 
	 * @return The position as String; for instance "a1"
	 */
	@Override
	public String toString() {
		final char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		return "" + alpha[this.x] + (this.y + 1);
	}

	/**
	 * 
	 * @return Whether the coordinate is on the board
	 */
	public boolean inBounds() {
		return this.x >= 0 && this.x < 8 && this.y >= 0 && this.y <= 8;
	}

	/**
	 *
	 * @param relative
	 *            The coordinate to be added
	 * @return The modified coordinate
	 */
	public Coordinate add(Coordinate relative) {
		return new Coordinate(this.x + relative.x, this.y + relative.y);
	}

	/**
	 *
	 * @param relative
	 *            The coordinate to be subtracted
	 * @return The modified coordinate
	 */
	public Coordinate sub(Coordinate relative) {
		return new Coordinate(this.x - relative.x, this.y - relative.y);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Coordinate)) {
			return false;
		}
		Coordinate c = (Coordinate) o;
		return c.x == this.x && c.y == this.y;
	}

}
