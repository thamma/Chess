package me.thamma.Chess;

public class ChessPieceKnight extends ChessPieceBase {

    /**
     * @param arg0 The coordinate the piece is at
     * @param arg1 The color the piece belongs to
     */
    public ChessPieceKnight(Coordinate arg0, Color arg1) {
        super(arg0, arg1);
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

}
