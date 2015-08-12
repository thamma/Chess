package me.thamma.Chess;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board implements Iterable<ChessPiece> {

	public ChessPiece[][] grid;

	public Board() {
		this.grid = new ChessPiece[8][8];
		init();
	}

	/**
	 * Initializes the board
	 */
	private void init() {
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
				cp = (ChessPiece) pieces[i].getConstructor(Coordinate.class, Color.class)
						.newInstance(new Coordinate(posWhite[i]), Color.WHITE);
				this.addPiece(cp);
				cp = (ChessPiece) pieces[i].getConstructor(Coordinate.class, Color.class)
						.newInstance(new Coordinate(posBlack[i]), Color.BLACK);
				this.addPiece(cp);
				cp = new ChessPiecePawn(new Coordinate(posWhitePawn[i]), Color.WHITE);
				this.addPiece(cp);
				cp = new ChessPiecePawn(new Coordinate(posBlackPawn[i]), Color.BLACK);
				this.addPiece(cp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param arg0
	 *            The color to test for
	 * @return Whether arg0 is checkmated
	 */
	public boolean isCheckmated(Color arg0) {
		//worth checking for mate first? Has O(n) cost at most but safes testing all cases of checkmate
		if (!isMated(arg0))
			return false;
		//TODO
		return false;
	}
	
	/**
	 * 
	 * @return Whether the game is a draw (King is not mated but cannot perform a move)
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
	 * @return Iterator containing all ChessPieces on the board
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
}
