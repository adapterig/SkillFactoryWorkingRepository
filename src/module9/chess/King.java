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

    public static boolean findAndCheckKingIsUnderAttack(ChessBoard board, int line, int column, int toLine, int toColumn, String currentColor) {
        //создаем копию доски с фигурами, делаем ход и проверяем не оказался ли король под атакой
        ChessBoard tempBoard = new ChessBoard(currentColor);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] == null) {
                    tempBoard.board[i][j] = null;
                } else {
                    switch (board.board[i][j].getSymbol()) {
                        case "K":
                            tempBoard.board[i][j] = new King(board.board[i][j].getColor());
                            break;
                        case "H":
                            tempBoard.board[i][j] = new Horse(board.board[i][j].getColor());
                            break;
                        case "P":
                            tempBoard.board[i][j] = new Pawn(board.board[i][j].getColor());
                            break;
                        case "Q":
                            tempBoard.board[i][j] = new Queen(board.board[i][j].getColor());
                            break;
                        case "R":
                            tempBoard.board[i][j] = new Rook(board.board[i][j].getColor());
                            break;
                        case "B":
                            tempBoard.board[i][j] = new Bishop(board.board[i][j].getColor());
                            break;
                        default:
                           // System.out.println("неправильная буква");
                            break;
                    }
                }
            }

        }
        tempBoard.board[toLine][toColumn] = tempBoard.board[line][column];
        tempBoard.board[line][column] = null;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tempBoard.board[i][j] != null && tempBoard.board[i][j].getSymbol().equals("K") &&
                        tempBoard.board[i][j].getColor().equals(currentColor)) {
                    //System.out.println("король найден" + currentColor);
                    if (isUnderAttack(tempBoard, i, j)) {
                        return true;
                    } else return false;
                }
            }
        }
        //System.out.println("Король не найден!" + currentColor);
        return false;
    }


    public static boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board.board[i][j] != null && !board.board[i][j].getColor().equals(board.board[line][column].getColor())) {
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
