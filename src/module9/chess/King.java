package module9.chess;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkMove(line, column, toLine, toColumn, chessBoard)) {
            if (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 1) {
                return true;
            } else if (Math.abs(line - toLine) == 0 && Math.abs(column - toColumn) == 1) {
                return true;
            } else if (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] != null && !board.board[i][j].getColor().equals(this.getColor())) {
                    if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                        //System.out.println("King is under attack");
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
