package me.thamma.ChessGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import me.thamma.Chess.Color;

public class PieceButton extends JButton implements ActionListener {

	private static final long serialVersionUID = -501192490104863228L;
	private ImageIcon wBishop, wKing, wKnight, wPawn, wQueen, wRook, bBishop, bKing, bKnight, bPawn, bQueen, bRook;
	/**
	 * 0: nothing 1: wBishop 2: wKing 3: wKnight 4: wPawn 5: wQueen 6: wRook 7:
	 * bBishop 8: bKing 9: bKnight 10: bPawn 11: bQueen 12: bRook
	 * 
	 */
	private int value;
	private String figure;

	public PieceButton() {
//		this(0);
		setIcon(null);
	}

	public PieceButton(String name) {
		this.figure = name;
		String res = name.replaceFirst("hite ", "").replaceFirst("lack ", "");
		ImageIcon locale = new ImageIcon(this.getClass().getResource("resources\\" + res + ".png"));
		setIcon(locale);
		this.value = 0;
	}

	@Deprecated
	public PieceButton(int value) {
		this.value = value;
		wBishop = new ImageIcon(this.getClass().getResource("resources\\wBishop.png"));
		wKing = new ImageIcon(this.getClass().getResource("resources\\wKing.png"));
		wKnight = new ImageIcon(this.getClass().getResource("resources\\wKnight.png"));
		wPawn = new ImageIcon(this.getClass().getResource("resources\\wPawn.png"));
		wQueen = new ImageIcon(this.getClass().getResource("resources\\wQueen.png"));
		wRook = new ImageIcon(this.getClass().getResource("resources\\wRook.png"));
		bBishop = new ImageIcon(this.getClass().getResource("resources\\bBishop.png"));
		bKing = new ImageIcon(this.getClass().getResource("resources\\bKing.png"));
		bKnight = new ImageIcon(this.getClass().getResource("resources\\bKnight.png"));
		bPawn = new ImageIcon(this.getClass().getResource("resources\\bPawn.png"));
		bQueen = new ImageIcon(this.getClass().getResource("resources\\bQueen.png"));
		bRook = new ImageIcon(this.getClass().getResource("resources\\bRook.png"));
		switchIcon();
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("call");
		value++;
		value %= 13;
		switchIcon();

	}

	@Deprecated
	private void switchIcon() {
		switch (value) {
		case 0:
			setIcon(null);
			break;
		case 1:
			setIcon(wBishop);
			break;
		case 2:
			setIcon(wKing);
			break;
		case 3:
			setIcon(wKnight);
			break;
		case 4:
			setIcon(wPawn);
			break;
		case 5:
			setIcon(wQueen);
			break;
		case 6:
			setIcon(wRook);
			break;
		case 7:
			setIcon(bBishop);
			break;
		case 8:
			setIcon(bKing);
			break;
		case 9:
			setIcon(bKnight);
			break;
		case 10:
			setIcon(bPawn);
			break;
		case 11:
			setIcon(bQueen);
			break;
		case 12:
			setIcon(bRook);
			break;
		}
	}

}
