package level2;

public class Task6 {
    public static void main(String[] args) {
        int [] d = {2, -10, 2,-2, -2, -2, 4, 4};
        int [] d2 = {2, 2, 2, 1, 2, 2, 10, 1};
        int [] d3 = {3, 0, 0, 0 , 0};

        System.out.println(isPointEqualitySum(d));
        System.out.println(isPointEqualitySum(d2));
        System.out.println(isPointEqualitySum(d3));
    }
    public static boolean isPointEqualitySum (int[] arr) {
        int summ = 0;
        for (int i : arr) {
            summ += i;
        }
        if (summ % 2 != 0 ) return false;
        summ /=2;

        int m = 0;
        for (int i = 0; i < arr.length-1; i++) {
            m += arr[i];
            if (m == summ) return true;
            }
        return false;
    }

}
