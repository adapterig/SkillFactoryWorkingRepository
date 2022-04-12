package module9.chess;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkMove(line, column, toLine, toColumn, chessBoard)) {
            if (getColor().equals("White")) {
                if (line == 1 && column == toColumn && toLine == 3 &&
                        chessBoard.board[2][column] == null && chessBoard.board[3][column] == null) {
                    return true;
                } else if (column == toColumn && (toLine - line) == 1 && chessBoard.board[toLine][toColumn] == null) {
                    return true;
                } else if (Math.abs(toColumn - column) == 1 && (toLine - line) == 1 &&
                        chessBoard.board[toLine][toColumn] != null) {
                    return true;
                }
            } else if (getColor().equals("Black")) {
                if (line == 6 && column == toColumn && toLine == 4 &&
                        chessBoard.board[5][column] == null && chessBoard.board[4][column] == null) {
                    return true;
                } else if (column == toColumn && (toLine - line) == -1 && chessBoard.board[toLine][toColumn] == null) {
                    return true;
                } else if (Math.abs(toColumn - column) == 1 && (toLine - line) == -1 &&
                        chessBoard.board[toLine][toColumn] != null) {
                    return true;
                }
            }
            System.out.println("Пешка так не ходит / не рубит");
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
