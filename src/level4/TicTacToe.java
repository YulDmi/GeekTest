package level4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 4;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    private static char[][] map;

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
            rowNumber = scanner.nextInt();
            System.out.println("Введите номер столбца: ");
            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, colNumber));
        map[rowNumber - 1][colNumber - 1] = DOT_X;
    }

    private static void turnAi() {
        int rowNumber, colNumber;
        do {
            System.out.println(" ");
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, colNumber));
        map[rowNumber - 1][colNumber - 1] = DOT_O;
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

    private static boolean isCellValid(int rowNumber, int colNumber) {
        if (rowNumber < 1 || rowNumber > SIZE)
            return false;
        if (colNumber < 1 || colNumber > SIZE)
            return false;
        return map[rowNumber - 1][colNumber - 1] == DOT_EMPTY;
    }

    public static boolean isWin(char dot) {
        return winLine(dot) || winVertical(dot) || winDiagonal(dot);
    }

    public static boolean winDiagonal(char dot) {
        int count = 0;

        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) {
                count++;
                if (count == DOTS_TO_WIN) return true;
            } else count = 0;
        }
        count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - 1 - i] == dot) {
                count++;
                if (count == DOTS_TO_WIN) return true;
            } else count = 0;
        }
        return false;
    }

    private static boolean winVertical(char dot) {
        int count;
        for (int i = 0; i < SIZE; i++) {
            count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == dot) {
                    count++;
                    if (count == DOTS_TO_WIN) return true;
                } else count = 0;
            }
        }
        return false;
    }

    public static boolean winLine(char dot) {
        int count;
        for (int i = 0; i < SIZE; i++) {
            count = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    count++;
                    if (count == DOTS_TO_WIN) return true;
                } else count = 0;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}