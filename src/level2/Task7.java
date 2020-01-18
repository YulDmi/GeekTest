package level2;

public class Task7 {
    public static void main(String[] args) {
        int[] d2 = { 5, 3, 2, 11, 4, -5, 2, 4, 8, 10, 20};
        int [] d = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        print(d);
        changePosition(d, -4);
        print(d);
        changePosition(d, 4);
        print(d);
        changePosition(d, 4);
        print(d);
        changePosition(d2, 0);
        print(d2);
    }

    public static void changePosition(int[] arr, int n) {
        if (n != 0) {
            int b, i = 0;
            int a = arr[i], index = 0, count = 0;

            while (count < arr.length) {
                index += n;
                if (index < 0 || index > arr.length - 1) {
                    index = Math.abs(arr.length - Math.abs(index));
                }
                if (index == i) {
                    arr[i] = a;
                    i++;
                    a = arr[i];
                    index = i;
                }
                b = arr[index];
                arr[index] = a;
                a = b;
                count++;
            }
        }
    }


    public static void print(int[] a) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();

    }


}

/*
1 5 3 2 11 4 -5 2 4 8 10 20
4 8 10 20 1 5 3 2 11 4 -5 2
1 5 3 2 11 4 -5 2 4 8 10 20

 */