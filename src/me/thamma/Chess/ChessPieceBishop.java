package me.thamma.Chess;

public class ChessPieceBishop extends ChessPieceBase {

	public ChessPieceBishop(Color color, Coordinate coordinate) {
		super(color, coordinate);
	}

	@Override
	public boolean canMove(Coordinate arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void performMove(Coordinate arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		return getColor() + " Bishop";
	}

	@Override
	public boolean isThreatened() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCode() {
		return "b";
	}

}
