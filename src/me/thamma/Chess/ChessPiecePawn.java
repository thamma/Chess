package me.thamma.Chess;

public class ChessPiecePawn extends ChessPieceBase {

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
		// TODO Auto-generated method stub
		return getColor() + " Pawn";
	}

	@Override
	public boolean isThreatened() {
		// TODO Auto-generated method stub
		return false;
	}

}
