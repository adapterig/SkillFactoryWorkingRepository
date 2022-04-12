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

    public static boolean checkMove(int line, int column, int toLine, int toColumn, ChessBoard board) {
        if (toLine >= 0 && toLine <= 7 && toColumn >= 0 && toColumn <= 7) { //проверка вхождения в границы поля
            if (line == toLine && column == toColumn) { // проверка наличия передвижения фигуры
                System.out.println("Фигура не изменила своего положения");
                return false;
            } else if (board.board[toLine][toColumn] != null && // проверка наличия в точке назначения фигуры того же цвета
                    board.board[line][column].getColor().equals(board.board[toLine][toColumn].getColor())) {
                System.out.println("координата занята фигурой такого же цвета");
                return false;
            } else {
                return true;
            }
        }
        System.out.println("Вышли за пределы поля");
        return false;
    }

    public static boolean checkMoveDiagonals(int line, int column, int toLine, int toColumn, ChessBoard chessBoard) {
        if (Math.abs(line - toLine) == Math.abs(column - toColumn)) {
            if (toLine - line > 1 && toColumn - column > 1) {
                for (int i = 1; i < toLine-line; i++) {
                    if (chessBoard.board[line + i][column + i] != null) {
                        System.out.println("Фигура на пути 1 1");
                        return false;
                    }
                }
            } else if (toLine - line < -1 && toColumn - column < -1) {
                for (int i = 1; i > line - toLine; i++) {
                    if (chessBoard.board[line - i][column - i] != null) {
                        System.out.println("Фигура на пути -1 -1");
                        return false;
                    }
                }
            } else if (toLine - line < -1 && toColumn - column > 1) {
                for (int i = 1; i < line - toLine; i++) {
                    if (chessBoard.board[line - i][column + i] != null) {
                        System.out.println("Фигура на пути -1 1");
                        return false;
                    }
                }
            } else if (toLine - line > 1 && toColumn - column < -1) {
                for (int i = 1; i < toLine - line; i++) {
                    if (chessBoard.board[line + i][column - i] != null) {
                        System.out.println("Фигура на пути 1 -1");
                        return false;
                    }
                }
            }
            return true;
        }
        System.out.println("Движение не по диагонали");
        return false;
    }

    public static boolean checkMoveLinesAndColumns(int line, int column, int toLine, int toColumn, ChessBoard chessBoard){
        if (line == toLine && column != toColumn || column == toColumn && line != toLine) {
            if (toLine - line > 1) {
                for (int i = line + 1; i < toLine; i++) {
                    if (chessBoard.board[i][column] != null) {
                        System.out.println("Фигура на пути 1 0");
                        return false;
                    }
                }
            }
            if (toLine - line < -1) {
                for (int i = line - 1; i > toLine; i--) {
                    if (chessBoard.board[i][column] != null) {
                        System.out.println("Фигура на пути -1 0");
                        return false;
                    }
                }
            } else if (toColumn - column > 1) {
                for (int i = column + 1; i < toColumn; i++) {
                    if (chessBoard.board[line][i] != null) {
                        System.out.println("Фигура на пути 0 1");
                        return false;
                    }
                }
            } else if (toColumn - column < -1) {
                for (int i = column - 1; i > toColumn; i--) {
                    if (chessBoard.board[line][i] != null) {
                        System.out.println("Фигура на пути 0 -1");
                        return false;
                    }
                }

            }
            return true;
        }
        System.out.println("Движение не по линии");
        return false;
    }

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();

}
