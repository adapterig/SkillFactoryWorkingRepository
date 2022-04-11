package module9.chess;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (this.checkMove(line, column, toLine, toColumn, chessBoard)) {
            if (Math.abs(line - toLine) == Math.abs(column - toColumn)) {
                if (toLine - line > 1 && toColumn - column > 1) {
                    for (int i = line + 1; i < toLine; i++) {
                        if (chessBoard.board[i][i] != null) {
                            return false;
                        }
                    }
                } else if (toLine - line < -1 && toColumn - column < -1) {
                    for (int i = line - 1; i > toLine; i--) {
                        if (chessBoard.board[i][i] != null) {
                            return false;
                        }
                    }
                } else if (toLine - line < -1 && toColumn - column > 1) {
                    for (int i = line + 1; i < toColumn; i++) {
                        if (chessBoard.board[line - i][i] != null) {
                            return false;
                        }
                    }
                } else if (toLine - line > 1 && toColumn - column < -1) {
                    for (int i = line + 1; i < toLine; i++) {
                        if (chessBoard.board[i][column - i] != null) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
