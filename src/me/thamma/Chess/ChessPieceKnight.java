package me.thamma.Chess;

public class ChessPieceKnight extends ChessPieceBase {

    public ChessPieceKnight(Color color, Coordinate coordinate) {
		super(color, coordinate);
	}

	@Override
    public boolean canMove(Coordinate arg0) {
        Coordinate move = arg0.sub(this.getCoordinate());
        return (move.x * move.x + move.y * move.y) == 5;
    }

    @Override
    public void performMove(Coordinate arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public String getName() {
        return getColor() + " Knight";
    }

    @Override
    public boolean isThreatened() {
        // TODO Auto-generated method stub
        return false;
    }

	@Override
	public String getCode() {
		return "k";
	}

}
