package module9.chess;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (this.checkMove(line, column, toLine, toColumn, chessBoard)) {
            if (line == toLine && column != toColumn || column == toColumn && line != toLine) {
                if (toLine - line > 1) {
                    for (int i = line + 1; i < toLine; i++) {
                        if (chessBoard.board[i][column] != null) {
                            return false;
                        }
                    }
                }
                if (toLine - line < -1) {
                    for (int i = line - 1; i > toLine; i--) {
                        if (chessBoard.board[i][column] != null) {
                            return false;
                        }
                    }
                } else if (toColumn - column > 1) {
                    for (int i = column + 1; i < toColumn; i++) {
                        if (chessBoard.board[line][i] != null) {
                            return false;
                        }
                    }
                } else if (toColumn - column < -1) {
                    for (int i = column - 1; i > toColumn; i--) {
                        if (chessBoard.board[line][i] != null) {
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
        return "R";
    }
}
