package module9.chess;

public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (this.checkMove(line, column, toLine, toColumn, chessBoard)) {
            if (Math.abs(line - toLine) == Math.abs(column - toColumn) ||
                    line == toLine && column != toColumn || column == toColumn && line != toLine) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
