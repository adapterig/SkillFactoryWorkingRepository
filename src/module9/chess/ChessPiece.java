package module9.chess;

public abstract class ChessPiece {
    String color;
    boolean check;

    public ChessPiece(String color) {
        this.color = color;
        this.check = true;
    }

    public String getColor() {
        return this.color;
    }

    static boolean checkBorders(int line, int column, int toLine, int toColumn) {
        if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
            if (line == toLine && column == toColumn) {
                return false;
            } else return true;
        } else return false;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn)
            ;

    public abstract String getSymbol();

}
