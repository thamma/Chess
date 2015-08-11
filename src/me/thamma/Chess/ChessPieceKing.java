package me.thamma.Chess;

public class ChessPieceKing extends ChessPieceBase {

	public ChessPieceKing(Color color, Coordinate coordinate) {
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
		return getColor() + " King";
	}

	@Override
	public boolean isThreatened() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCode() {
		return "K";
	}

}
