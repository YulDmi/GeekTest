package level4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    private static int steps = 0;
    private static char[][] map;
    private static int count;


    public static void main(String[] args) {
        initial();
        print();
        while (true) {
            turnHuman();
            print();
            if (isWin(DOT_X)) {
                System.out.println("Поздравляем!!! Ты победил!!! ");
                break;
            } else if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            turnAi();
            print();
            if (isWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            } else if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена!");
    }

    private static void turnHuman() {
        int rowNumber, colNumber;
        do {
            System.out.println("Куда будем ставить X?");
            System.out.println("Введите номер строки: ");
            rowNumber = scanner.nextInt() - 1;
            System.out.println("Введите номер столбца: ");
            colNumber = scanner.nextInt() - 1;
        } while (!isCellValid(rowNumber, colNumber, DOT_EMPTY));
        map[rowNumber][colNumber] = DOT_X;
        steps++;
    }

    private static void turnAi() {

        int rowNumber, colNumber;
        do {
            System.out.println(" ");
            rowNumber = random.nextInt(SIZE);
            colNumber = random.nextInt(SIZE);
        } while (!isCellValid(rowNumber, colNumber, DOT_EMPTY));
        map[rowNumber][colNumber] = DOT_O;
    }

    private static void print() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void initial() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static boolean isCellValid(int rowNumber, int colNumber, char dot) {
        if (rowNumber < 0 || rowNumber >= SIZE)
            return false;
        if (colNumber < 0 || colNumber >= SIZE)
            return false;
        return map[rowNumber][colNumber] == dot;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isWin(char dot) {
        if (steps < DOTS_TO_WIN) return false;
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

