package level2;

public class HomeWork2 {
    public static void main(String[] args) {
        // task 1
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) a[i] = 1;
            else a[i] = 0;
        }
        print(a);

        //task2
        int[]b = new int[8];
        int c = 0;
        for (int i = 0; i < b.length; i++){
            b[i] = c;
            c += 3;
        }
        print(b);

        //task3
        int [] d = {1, 5, 3, 2, 11, 4, -5, 2, 4, 8, 10, 1 };
        for (int i = 0; i< d.length; i++){
           if (d[i] < 6) d[i] *=2;
        }
        print(d);

    //task4
    int [][] arr = new int[7][7];
    int k = arr.length-1;
    for (int i = 0; i < arr.length; i++) {
        arr[i][i] = 1;
        arr[k][i] = 1;
        k -= 1;
    }
    print(arr);
    //task5
        System.out.println(max(d));
        System.out.println(min(d));

    }


    public static void print(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
    }

    public static void print(int[][] a) {
        for (int[] i : a) {
            for (int j : i)
            System.out.print(j + " ");
            System.out.println();

        } System.out.println();
    }

    public static int max (int[] a) {
        int max = a[0];
        for (int i : a) {
           if(i > max) max = i;
        } return max;
    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i : a){
            if(i < min) min = i;
        }return min;
    }


}





/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 */