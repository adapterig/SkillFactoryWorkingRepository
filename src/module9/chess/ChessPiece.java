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

    static boolean checkMove(int line, int column, int toLine, int toColumn, ChessBoard board) {
        if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) {
            if (line == toLine && column == toColumn) {
                return false;
            } else if (board.board[toLine][toColumn] != null &&
                    board.board[line][column].getColor().equals(board.board[toLine][toColumn].getColor())) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();

}
