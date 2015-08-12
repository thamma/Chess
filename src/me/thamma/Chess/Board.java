package me.thamma.Chess;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board implements Iterable<ChessPiece> {

	public ChessPiece[][] grid;

	/**
	 * 
	 * Initialized a setup Board
	 */
	public Board() {
		this.grid = new ChessPiece[8][8];
	}

	/**
	 * 
	 * Initialized a setup Board
	 * 
	 * @param gregory
	 *            Whether to use Gregory's initialize method, else Dominic's
	 */
	public Board(Boolean gregory) {
		this();
		if (gregory) {
			initGregory();
		} else {
			initDome();
		}
	}

	/**
	 * Initializes the board
	 */
	private void initDome() {
		try {
			String[] posWhite = { "a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1" };
			String[] posBlack = { "a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8" };
			String[] posWhitePawn = { "a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2" };
			String[] posBlackPawn = { "a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7" };
			Class[] pieces = { ChessPieceRook.class, ChessPieceKnight.class, ChessPieceBishop.class,
					ChessPieceQueen.class, ChessPieceKing.class, ChessPieceBishop.class, ChessPieceKnight.class,
					ChessPieceRook.class };
			for (int i = 0; i < posWhite.length; i++) {
				ChessPiece cp = null;
				cp = (ChessPiece) pieces[i].getConstructor(Color.class, Coordinate.class).newInstance(Color.WHITE,
						new Coordinate(posWhite[i]));
				this.addPiece(cp);
				cp = (ChessPiece) pieces[i].getConstructor(Color.class, Coordinate.class).newInstance(Color.BLACK,
						new Coordinate(posBlack[i]));
				this.addPiece(cp);
				cp = new ChessPiecePawn(Color.WHITE, new Coordinate(posWhitePawn[i]));
				this.addPiece(cp);
				cp = new ChessPiecePawn(Color.BLACK, new Coordinate(posBlackPawn[i]));
				this.addPiece(cp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initializes the game with default positions
	 */
	private void initGregory() {
		this.grid = new ChessPiece[8][8];
		for (int i = 0; i < 8; i++) {
			this.grid[i][1] = new ChessPiecePawn(Color.WHITE, new Coordinate(i, 1));
			this.grid[i][6] = new ChessPiecePawn(Color.BLACK, new Coordinate(i, 6));
		}
		this.grid[0][0] = new ChessPieceRook(Color.WHITE, new Coordinate(0, 0));
		this.grid[1][0] = new ChessPieceKnight(Color.WHITE, new Coordinate(1, 0));
		this.grid[2][0] = new ChessPieceBishop(Color.WHITE, new Coordinate(2, 0));
		this.grid[3][0] = new ChessPieceQueen(Color.WHITE, new Coordinate(3, 0));
		this.grid[4][0] = new ChessPieceKing(Color.WHITE, new Coordinate(4, 0));
		this.grid[5][0] = new ChessPieceBishop(Color.WHITE, new Coordinate(5, 0));
		this.grid[6][0] = new ChessPieceKnight(Color.WHITE, new Coordinate(6, 0));
		this.grid[7][0] = new ChessPieceRook(Color.WHITE, new Coordinate(7, 0));

		this.grid[0][7] = new ChessPieceRook(Color.BLACK, new Coordinate(0, 7));
		this.grid[1][7] = new ChessPieceKnight(Color.BLACK, new Coordinate(1, 7));
		this.grid[2][7] = new ChessPieceBishop(Color.BLACK, new Coordinate(2, 7));
		this.grid[3][7] = new ChessPieceQueen(Color.BLACK, new Coordinate(3, 7));
		this.grid[4][7] = new ChessPieceKing(Color.BLACK, new Coordinate(4, 7));
		this.grid[5][7] = new ChessPieceBishop(Color.BLACK, new Coordinate(5, 7));
		this.grid[6][7] = new ChessPieceKnight(Color.BLACK, new Coordinate(6, 7));
		this.grid[7][7] = new ChessPieceRook(Color.BLACK, new Coordinate(7, 7));

	}

	/**
	 * 
	 * @param arg0
	 *            The color to test for
	 * @return Whether arg0 is checkmated
	 */
	public boolean isCheckmated(Color arg0) {
		// worth checking for mate first? Has O(n) cost at most but safes
		// testing all cases of checkmate
		if (!isMated(arg0))
			return false;
		// TODO
		return false;
	}

	/**
	 * 
	 * @return Whether the game is a draw (King is not mated but cannot perform
	 *         a move)
	 */
	public boolean isDraw() {
		return false;
	}

	/**
	 * 
	 * @param arg0
	 *            The color to test for
	 * @return Whether arg0 is mated
	 */
	public boolean isMated(Color arg0) {
		ChessPieceKing p = (ChessPieceKing) getUniquePiece("king", arg0);
		return p.isThreatened();
	}

	/**
	 * 
	 * @param arg0
	 *            The name of the piece to search
	 * @return The first ChessPiece by the name arg0, if noone found null
	 */
	public ChessPiece getUniquePiece(String arg0, Color arg1) {
		for (ChessPiece p : this) {
			if (p.getColor().equals(arg1) && p.getName().equalsIgnoreCase(arg0))
				return p;
		}
		return null;
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
	 * 
	 * @param arg0
	 *            Sets a ChessPiece to its specific position on the board
	 */
	public void addPiece(ChessPiece arg0) {
		assert(arg0.getCoordinate().inBounds());
		this.grid[arg0.getCoordinate().x][arg0.getCoordinate().y] = arg0;
	}

	/**
	 *
	 * @return Iterator containing all ChessPieces on the board, never null
	 */
	@Override
	public Iterator<ChessPiece> iterator() {
		List<ChessPiece> l = new ArrayList<ChessPiece>();
		for (int i = 0; i < this.grid.length; i++) {
			for (int j = 0; j < this.grid[i].length; j++) {
				if (grid[i][j] != null) {
					l.add(grid[i][j]);
				}
			}
		}
		return l.iterator();
	}

	/**
	 * 
	 * @return The list off all ChessPieces. They can be null!
	 */
	public ChessPiece[][] getGrid() {
		return grid;
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
