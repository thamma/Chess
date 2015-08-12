package me.thamma.ChessGUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

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

	private JPanel board;
	private PieceButton[][] buttons;

	public BoardGUI() {
		super("Chess");
		this.board = new JPanel();
		this.setSize(800, 800);
		this.setLocation(400, 150);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		board.setLayout(new GridLayout(8, 8));
		initButtons();
		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j < 8; j++) {
				board.add(buttons[j][i]);
			}
		}
		this.add(board);
		this.setVisible(true);
	}

	private void initButtons() {
		this.buttons = new PieceButton[8][8];
		for (int i = 0; i < 8; i++) {
			this.buttons[i][1] = new PieceButton(4);
			this.buttons[i][2] = new PieceButton(0);
			this.buttons[i][3] = new PieceButton(0);
			this.buttons[i][4] = new PieceButton(0);
			this.buttons[i][5] = new PieceButton(0);
			this.buttons[i][6] = new PieceButton(10);
		}
		/**
		 * 0: nothing 1: wBishop 2: wKing 3: wKnight 4: wPawn 5: wQueen 6: wRook 7:
		 * bBishop 8: bKing 9: bKnight 10: bPawn 11: bQueen 12: bRook
		 * 
		 */
		this.buttons[0][0] = new PieceButton(6);
		this.buttons[1][0] = new PieceButton(3);
		this.buttons[2][0] = new PieceButton(1);
		this.buttons[3][0] = new PieceButton(5);
		this.buttons[4][0] = new PieceButton(2);
		this.buttons[5][0] = new PieceButton(1);
		this.buttons[6][0] = new PieceButton(3);
		this.buttons[7][0] = new PieceButton(6);

		this.buttons[0][7] = new PieceButton(12);
		this.buttons[1][7] = new PieceButton(9);
		this.buttons[2][7] = new PieceButton(7);
		this.buttons[3][7] = new PieceButton(11);
		this.buttons[4][7] = new PieceButton(8);
		this.buttons[5][7] = new PieceButton(7);
		this.buttons[6][7] = new PieceButton(9);
		this.buttons[7][7] = new PieceButton(12);

	}

}
