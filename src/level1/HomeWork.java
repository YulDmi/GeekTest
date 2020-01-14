package level1;

public class HomeWork {
    byte by = 1;
    short cc = 16;
    int i = 250;
    long l = 1000L;
    char ch = 'h';
    boolean bool = true;
    double dob = 2.5;
    float fl = 0.3f;


    public static void main(String[] args) {
        System.out.println(formula(2.0f, 3.5f, 4.8f, 2.4f ));
        System.out.println(summaInInterval(3, 19));
        isPositive(-0);
        System.out.println(isNegative(-50));
        text("Dima");
        isYear(2019);
    }

    public static double formula(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    public static boolean summaInInterval (int a, int b) {

        return (a + b) >= 10 && (a + b)  <= 20;
    }
    public static void isPositive (int m) {
        if (m < 0 ) {
            System.out.println("Число " + m + " отрицательное.");
        }else System.out.println("Число " + m + " положительное.");
    }
    public static boolean isNegative (int n) {
        return n < 0;
    }
    public static void text (String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void isYear (int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Год "+ year + " високосный.");
        }else  System.out.println("Год "+ year + " не високосный.");
    }
}


/*
Создать пустой проект в IntelliJ IDEA и прописать метод main().
Создать переменные всех пройденных типов данных и инициализировать их значения.
Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float.
Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.
Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

 */