package me.thamma.Chess;

public interface ChessPiece {

	/**
	 * 
	 * @param arg0
	 *            The coordinate to move to
	 * @return Whether the move is valid
	 * @see https://de.wikipedia.org/wiki/Schach#Zugregeln
	 */
	public boolean canMove(Coordinate arg0);

	/**
	 * 
	 * @param arg0
	 *            The coordinate to move to
	 */
	public void performMove(Coordinate arg0);

	/**
	 * 
	 * @return The coordinate the Piece is at
	 */
	public Coordinate getCoordinate();

	/**
	 * 
	 * @return Which color the piece belongs to
	 */
	public Color getColor();

	/**
	 * 
	 * @return The name of the Piece
	 */
	public String getName();
	
	/**
	 * 
	 * @return The code of the Piece
	 * 
	 * Bishop - b
	 * King - K
	 * Knight - k
	 * Pawn - p
	 * Queen - Q
	 * Rook - r
	 */
	public String getCode();

	/**
	 * 
	 * @return Whether the piece is threatened by another
	 */
	public boolean isThreatened();
}