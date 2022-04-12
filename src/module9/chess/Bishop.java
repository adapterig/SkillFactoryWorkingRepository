package module9.chess;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkMove(line, column, toLine, toColumn, chessBoard)) {
            return checkMoveDiagonals(line, column, toLine, toColumn, chessBoard);
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
