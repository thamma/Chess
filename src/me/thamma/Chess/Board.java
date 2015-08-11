package me.thamma.Chess;

public class Board {

	private ChessPiece[][] grid;

	public Board() {
		this.grid = new ChessPiece[8][8];
	}

	public Board(Boolean init) {
		if (init) {
			initBoard();
		} else {
			this.grid = new ChessPiece[8][8];
		}
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

	/**
	 * Initializes the game with default positions
	 */
	private void initBoard() {
		this.grid = new ChessPiece[8][8];
		for (int i = 0; i < 8; i++) {
			this.grid[i][1] = new ChessPiecePawn(Color.White, new Coordinate(i,
					1));
			this.grid[i][6] = new ChessPiecePawn(Color.Black, new Coordinate(i,
					6));
		}
		this.grid[0][0] = new ChessPieceRook(Color.White, new Coordinate(0, 0));
		this.grid[1][0] = new ChessPieceKnight(Color.White,
				new Coordinate(1, 0));
		this.grid[2][0] = new ChessPieceBishop(Color.White,
				new Coordinate(2, 0));
		this.grid[3][0] = new ChessPieceQueen(Color.White, new Coordinate(3, 0));
		this.grid[4][0] = new ChessPieceKing(Color.White, new Coordinate(4, 0));
		this.grid[5][0] = new ChessPieceBishop(Color.White,
				new Coordinate(5, 0));
		this.grid[6][0] = new ChessPieceKnight(Color.White,
				new Coordinate(6, 0));
		this.grid[7][0] = new ChessPieceRook(Color.White, new Coordinate(7, 0));

		this.grid[0][7] = new ChessPieceRook(Color.Black, new Coordinate(0, 0));
		this.grid[1][7] = new ChessPieceKnight(Color.Black,
				new Coordinate(1, 0));
		this.grid[2][7] = new ChessPieceBishop(Color.Black,
				new Coordinate(2, 0));
		this.grid[3][7] = new ChessPieceQueen(Color.Black, new Coordinate(3, 0));
		this.grid[4][7] = new ChessPieceKing(Color.Black, new Coordinate(4, 0));
		this.grid[5][7] = new ChessPieceBishop(Color.Black,
				new Coordinate(5, 0));
		this.grid[6][7] = new ChessPieceKnight(Color.Black,
				new Coordinate(6, 0));
		this.grid[7][7] = new ChessPieceRook(Color.Black, new Coordinate(7, 0));
	}

	/**
	 * 
	 * @return A String representation of the board
	 */
	@Override
	public String toString() {
		String res = "";
		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j < 8; j++) {
				if (this.grid[j][i] == null) {
					res = res + "  ";
				} else {
					res = res + grid[j][i].getCode() + " ";
				}
			}
			res = res + "\n";
		}
		return res;
	}
}
