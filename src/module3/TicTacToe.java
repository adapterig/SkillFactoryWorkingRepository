package module3;

public class TicTacToe {
    String[][] field;
    String player;

    public TicTacToe() {
        newGame();
    }

    void newGame() {
        field = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        player = "X";
    }

    String[][] getField() {
        return field;
    }

    String makeMove(int x, int y) {
        String check = this.checkGame();
        if (check != null) return "Game was ended";
        if (!field[x - 1][y - 1].equals("-")) return "Cell " + (x) + ", " + (y) + " is already occupied";
        field[x-1][y-1] = player;
        check = checkGame();
        if (check != null) {
            if (check.equals("X")) return "Player X won";
            else if (check.equals("0")) return "Player 0 won";
            else return "Draw";
        }
        player = player.equals("X") ? "0" : "X";
        return "Move completed";
    }

    String checkGame() {
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("0") || field[i][j].equals("-")) check = false;
            }
            if (check) return "X";
        }
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("X") || field[i][j].equals("-")) check = false;
            }
            if (check) return "0";
        }
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[j][i].equals("0") || field[j][i].equals("-")) check = false;
            }
            if (check) return "X";
        }
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (field[j][i].equals("X") || field[j][i].equals("-")) check = false;
            }
            if (check) return "0";
        }
        boolean check = true;
        for (int i = 0; i < 3; i++) {
            if (field[i][i].equals("X") || field[i][i].equals("-")) check = false;
        }
        if (check == true) return "0";
        check = true;
        for (int i = 0; i < 3; i++) {
            if (field[i][2 - i].equals("X") || field[i][2 - i].equals("-")) check = false;
        }
        if (check == true) return "0";

        check = true;
        for (int i = 0; i < 3; i++) {
            if (field[i][i].equals("0") || field[i][i].equals("-")) check = false;
        }
        if (check == true) return "X";
        check = true;
        for (int i = 0; i < 3; i++) {
            if (field[i][2 - i].equals("0") || field[i][2 - i].equals("-")) check = false;
        }
        if (check == true) return "X";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("-")) return null;
            }
        }
        return "D";
    }
}
