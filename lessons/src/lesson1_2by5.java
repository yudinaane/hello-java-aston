public class lesson1_2by5 {
    public static void checkSumSign() {
        int a = 1;
        int b = -5;
        if (a + b >= 0) {
            System.out.println("Summ is positive");
        } else {
            System.out.println("Summ is negative");
        }
    }

    public static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("Red");
        } else {
            if ((value > 0) & (value <= 100)) {
                System.out.println("Yelow");
            } else {
                System.out.println("Green");
            }
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 2;
        if (a >= b) {
            System.out.print("a >= b");
        } else {
            System.out.print("a<b");
        }
    }


    public static void main(String[] args) {
        checkSumSign();
        printColor();
        compareNumbers();
    }
}

