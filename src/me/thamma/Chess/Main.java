package me.thamma.Chess;

import me.thamma.ChessGUI.BoardGUI;

public class Main {

	public static void main(String[] args) {
		/*
		 * Feel free to test and drop some comments here
		 */
		Board b = new Board(false);
		BoardGUI gui = new BoardGUI(b);
		gui.getBoard().addPiece(new ChessPieceKing(Color.WHITE, new Coordinate(4, 4)));
		gui.redraw();

	}

}
