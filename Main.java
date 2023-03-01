public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] integerArr = new int[3];
        integerArr[0] = 1;
        integerArr[1] = 2;
        integerArr[2] = 3;

        double[] decimalArr = {1.57, 7.654, 9.986};

        char[] randomArr = {1, 3, 5, 7, 9};
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] integerArr = new int[3];
        integerArr[0] = 1;
        integerArr[1] = 2;
        integerArr[2] = 3;
        for (int i = 0; i < integerArr.length; i++) {
            if (i == integerArr.length - 1) {
                System.out.println(integerArr[i]);
                break;
            }
            System.out.print(integerArr[i] + ",");
        }
        System.out.println();

        double[] decimalArr = {1.57, 7.654, 9.986};
        for (int i = 0; i < decimalArr.length; i++) {
            if (i == decimalArr.length - 1) {
                System.out.println(decimalArr[i]);
                break;
            }
            System.out.print(decimalArr[i] + ",");
        }
        System.out.println();

        int[] randomArr = {1, 3, 5, 7, 9};
        for (int i = 0; i < randomArr.length; i++) {
            if (i == randomArr.length - 1) {
                System.out.println(randomArr[i]);
                break;
            }
            System.out.print(randomArr[i] + ",");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] integerArr = new int[3];
        integerArr[0] = 1;
        integerArr[1] = 2;
        integerArr[2] = 3;
        int index = integerArr.length - 1;
        for (int i = index; i >= 0; i--) {
            if (i == 0) {
                System.out.println(integerArr[i]);
                break;
            }
            System.out.print(integerArr[i] + ",");
        }
        System.out.println();

        double[] decimalArr = {1.57, 7.654, 9.986};
        int indexTwo = decimalArr.length - 1;
        for (int i = indexTwo; i >= 0; i--) {
            if (i == 0) {
                System.out.println(decimalArr[i]);
                break;
            }
            System.out.print(decimalArr[i] + ",");
        }
        ;
        System.out.println();

        int[] randomArr = {1, 3, 5, 7, 9};
        int indexThree = randomArr.length - 1;
        for (int i = indexThree; i >= 0; i--) {
            if (i == 0) {
                System.out.println(randomArr[i]);
                break;
            }
            System.out.print(randomArr[i] + ",");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4");
        int[] integerArr = new int[3];
        integerArr[0] = 1;
        integerArr[1] = 2;
        integerArr[2] = 3;
        for (int i = 0; i < integerArr.length; i++) {
            if ((integerArr[i] + 1) % 2 == 0) {
                integerArr[i] = integerArr[i] + 1;
                System.out.println(integerArr[i]);
            } else {
                System.out.println(integerArr[i]);
            }
        }
    }
}

