package me.thamma.ChessGUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import me.thamma.Chess.Board;
import me.thamma.Chess.ChessPiece;
import me.thamma.Chess.ChessPieceBishop;
import me.thamma.Chess.ChessPieceKing;
import me.thamma.Chess.ChessPieceKnight;
import me.thamma.Chess.ChessPiecePawn;
import me.thamma.Chess.ChessPieceQueen;
import me.thamma.Chess.ChessPieceRook;
import me.thamma.Chess.Color;
import me.thamma.Chess.Coordinate;

public class BoardGUI extends JFrame {

	private JPanel grid;
	private PieceButton[][] buttons;
	private Board board;

	public BoardGUI(Board board) {
		super("Chess");
		this.board = board;
		this.setSize(800, 800);
		this.setLocation(400, 150);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		redraw();

		this.setVisible(true);
	}

	public Board getBoard() {
		return this.board;
	}

	public void redraw() {
		this.grid = new JPanel();
		grid.setLayout(new GridLayout(8, 8));
		if (buttons == null)
			buttons = new PieceButton[8][8];
		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j < 8; j++) {
				if (board.getGrid()[j][i] != null) {
					setPiece(board.getGrid()[j][i]);
				} else {
					buttons[j][i] = new PieceButton();
					grid.add(buttons[j][i]);
				}
			}
		}
		this.add(grid);
		grid.revalidate();
		grid.repaint();
		System.out.println(this.board);
	}

	private void setPiece(ChessPiece p) {
		int i = p.getCoordinate().x;
		int j = p.getCoordinate().y;
		buttons[i][j] = new PieceButton(p.getName());
		grid.add(buttons[i][j]);
	}

}
