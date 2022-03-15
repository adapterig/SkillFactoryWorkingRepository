package module3;

public class SeaBoard {
    private String[][] field;
    final int[][] surCoord = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public SeaBoard() {
        this.field = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.field[i][j] = ".";
            }
        }
    }

    public String[][] getField() {
        String[][] array = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = field[i][j];
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        return array;
    }

    public void shoot(int line, int column, String issue) {
        if (this.check(line, column).equals(".")) {
            switch (issue) {
                case "m":
                    this.field[line][column] = "#";
                    break;
                case "h":
                    this.field[line][column] = "x";
                    break;
                case "d":
                    this.field[line][column] = "x";
                    this.fillSharp(line, column);
                    for (int i = 1; i < 10; i++) {
                        int x = line - i;
                        int y = column;
                        if (x < 0) break;
                        if (this.field[x][y].equals("x")) {
                            fillSharp(x, y);
                        } else if (!this.field[x][y].equals("x")) {
                            break;
                        }
                    }
                    for (int i = 1; i < 10; i++) {
                        int x = line + i;
                        int y = column;
                        if (x >= 10) break;
                        if (this.field[x][y].equals("x")) {
                            fillSharp(x, y);
                        } else if (!this.field[x][y].equals("x")) {
                            break;
                        }
                    }
                    for (int i = 1; i < 10; i++) {
                        int x = line;
                        int y = column - i;
                        if (y < 0) break;
                        if (this.field[x][y].equals("x")) {
                            fillSharp(x, y);
                        } else if (!this.field[x][y].equals("x")) {
                            break;
                        }
                    }
                    for (int i = 1; i < 10; i++) {
                        int x = line;
                        int y = column + i;
                        if (y >= 10) break;
                        if (this.field[x][y].equals("x")) {
                            fillSharp(x, y);
                        } else if (!this.field[x][y].equals("x")) {
                            break;
                        }
                    }

            }

        } else {
            System.out.println("?");
        }

    }

    String check(int line, int column) {
        return this.field[line][column];
    }

    private void fillSharp(int line, int column) {
        for (int i = 0; i < 8; i++) {
            int x = line + surCoord[i][0];
            int y = column + surCoord[i][1];
            if (x >= 0 && x < 10 && y >= 0 && y < 10) {
                if (this.field[x][y].equals(".")) {
                    this.field[x][y] = "#";
                }
            }
        }
    }
}
