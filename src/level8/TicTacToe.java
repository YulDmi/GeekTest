package level8;

public class TicTacToe {
    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = '0';
    private static int steps = 1;
    private static char[][] map;
    private static int count;


    public TicTacToe() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public void game(int X, int Y, String text) {

        if (text.equals("X")) map[X][Y] = DOT_X;
        if (text.equals("0")) map[X][Y] = DOT_O;
        if (isMapFull()) {

            new MyPanel("Ничья!!!");
        }
        if (isWin(DOT_X))
        {

            new MyPanel("Поздравляю!!! Выграли Х");
        }
        if (isWin(DOT_O)){

           new MyPanel("Поздравляю!!! Выграли 0");
        }
        steps++;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean isCellValid(int rowNumber, int colNumber, char dot) {
        if (rowNumber < 0 || rowNumber >= SIZE)
            return false;
        if (colNumber < 0 || colNumber >= SIZE)
            return false;
        return map[rowNumber][colNumber] == dot;
    }

    public static boolean isWin(char dot) {
        if (steps < 5) return false;
        for (int i = 0; i < SIZE; i++) {
            count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    if (getBooleanLine(dot, i, j)) {
                        return true;
                    }
                    if (getBooleanVertical(dot, i, j)) {
                        return true;
                    }
                    if (getBooleanRightDiagonal(dot, i, j)) {
                        return true;
                    }
                    if (getBooleanLeftDiagonal(dot, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    private static boolean getBooleanVertical(char dot, int i, int j) {
        count++;
        while (true) {
            if (isCellValid(++i, j, dot)) {
                count++;
                if (count == DOTS_TO_WIN) {
                    return true;
                }
            } else {
                count = 0;
                break;
            }
        }
        return false;
    }

    public static boolean getBooleanLine(char dot, int i, int j) {
        count++;
        while (true) {
            if (isCellValid(i, ++j, dot)) {
                count++;
                if (count == DOTS_TO_WIN) {
                    return true;
                }
            } else {
                count = 0;
                break;
            }
        }
        return false;
    }

    private static Boolean getBooleanRightDiagonal(char dot, int i, int j) {
        count++;
        while (true) {
            if (isCellValid(++i, --j, dot)) {
                count++;
                if (count == DOTS_TO_WIN) return true;
            } else {
                count = 0;
                break;
            }
        }
        return false;
    }

    private static Boolean getBooleanLeftDiagonal(char dot, int i, int j) {
        count++;
        while (true) {
            if (isCellValid(++i, ++j, dot)) {
                count++;
                if (count == DOTS_TO_WIN) return true;
            } else {
                count = 0;
                break;
            }
        }
        return false;
    }
   }
