package me.thamma.Chess;

import me.thamma.ChessGUI.BoardGUI;

public class Main {

	public static void main(String[] args) {
		/*
		 * Feel free to test and drop some comments here
		 */
		
		BoardGUI gui = new BoardGUI();
		Board b = new Board(true);
		System.out.println(b);

	}

}
