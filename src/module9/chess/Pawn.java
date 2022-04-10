package module9.chess;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (this.checkBorders(line, column, toLine, toColumn)) {
            if (getColor().equals("White")) {
                if (line == 1 && column == toColumn && (toLine - line) == 1 || (toLine - line) == 2) {
                    return true;
                } else if (column == toColumn && (toLine - line) == 1) {
                    return true;
                }
            } else if (getColor().equals("Black")) {
                if (line == 7 && column == toColumn && (toLine - line) == -1 || (toLine - line) == -2) {
                    return true;
                } else if (column == toColumn && (toLine - line) == -1) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
