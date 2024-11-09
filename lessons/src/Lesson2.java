import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Введите целое число a: ");
        //int a = scanner.nextInt();
        //1System.out.print("Введите целое число b: ");
        //1int b = scanner.nextInt();
        //1boolean result=checkSumSign(a, b);
        //1System.out.print(result);
        //2checkNumSign(a);
        //3boolean result=checkNumSign2(a);
        //3System.out.print(result);
        //4System.out.print("Введите целое число count: ");
        //4int count = scanner.nextInt();
        //4printStrCont("Hello", count);
        //5System.out.print("Введите год ");
        //5int year = scanner.nextInt();
        //5boolean result=checkNumSign2(year);
        //5System.out.print(result);
        //6fillArray();
        //7fillArray100();
        //8changeArray();
        //9fillDiagonal(3);
        //10returnArray(5, 3.1);
    }

    //1.Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    private static boolean checkSumSign(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    //2.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    // в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    private static void checkNumSign(int c) {
        if (c >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    //3.Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    private static boolean checkNumSign2(int a) {
        return a < 0;
    }

    //4.Написать метод, которому в качестве аргументов передается
    // строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз
    private static void printStrCont(String str, int count) {
        for (int i = 0; i < count; i++) System.out.println(str);
    };

    //5. Написать метод, который определяет, является ли год високосным, и возвращает boolean
    // (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static boolean checkYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        // (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
    };

    //6.Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void fillArray() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Array before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("Array after:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    //7. Задать пустой целочисленный массив длиной 100.
    //С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
    private static void fillArray100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        };
    }

    //8.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2

    private static void changeArray() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Array before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            //else arr[i] = arr[i];
        }
        System.out.print("Array after:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        };
    };

    //9.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    // диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], ..., [n][n]
    private static void fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        };
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    };

    //10.Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    private static void returnArray(int len, double initialValue) {
        double[] arr = new double[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        };
        System.out.print("Array: { ");
        for (double i : arr) {
            System.out.print(i + " ");
        };
        System.out.print("}");
    }

    ;


}







