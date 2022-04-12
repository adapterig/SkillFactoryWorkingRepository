package module9.chess;

public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkMove(line, column, toLine, toColumn, chessBoard)) {
            return checkMoveLinesAndColumns(line, column, toLine, toColumn, chessBoard) ||
                    checkMoveDiagonals(line, column, toLine, toColumn, chessBoard);
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
