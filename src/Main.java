import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(printThreeWords() + '\n');
        System.out.println("Задание 2");
        System.out.println(checkSumSign(4,-5) + '\n');
        System.out.println("Задание 3");
        System.out.println(printColor(111) + '\n');
        System.out.println("Задание 4");
        System.out.println(compareNumbers(10,11)+ '\n');
        System.out.println("Задание 5");
        System.out.println(calcSum(5,16));
        System.out.println();
        System.out.println("Задание 6");
        System.out.println(numberPlus(-4));
        System.out.println("Задание 7");
        System.out.println(numberTrue(-5));
        System.out.println();
        System.out.println("Задание 8");
        System.out.println(stringNum("Слово",2));
        System.out.println("Задание 9");
        System.out.println(year(1000));
        System.out.println();
        System.out.println("Задание 10");
        System.out.println(array());
        System.out.println("Задание 11");
        System.out.println(array100());
        System.out.println("Задание 12");
        System.out.println(array12());
        System.out.println("Задание 13");
        System.out.println(diagonalArray(5,5));
        System.out.println("Задание 14");
        System.out.println(lenArray(9,4));
    }

    //Задание 1
    public static String printThreeWords() {
        String str = "Orange" + "\n" + "Banana" + "\n" + "Apple";
        return str;
    }
    //Задание 2
    public static String checkSumSign(int a, int b) {
        if (a + b>= 0) {
            return "Сумма положительная";
        }
        else return "Сумма отрицательная";
    }
    //Задание 3
    public static String printColor(int value) {
        String color = "";
        if (value <= 0) {
            color = "Красный";
        } else if (0< value && value<= 100) {
            color = "Желтый";
        } else if (value>100) {
            color = "Зеленый";
        }
        return color;
    }
    //Задание 4
    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else return "a < b";
    }
    //Задание 5
    public static boolean calcSum(int a,int b) {
        boolean sum = false;
        if (10 <= a + b && a + b <= 20) {
            sum = true;
        } else {
            sum = false;
        }
        return sum;
    }
    //Задание 6
    public static String numberPlus(int a){
        String string = "";
        if (a<0) {
            string = "Число отрицательное";
        } else if (a>=0) {
            string = "Число положительное";
        }
        return string + '\n';
    }
    //Задание 7
    public static boolean numberTrue(int a) {
        boolean numb = false;
        if (a<0) {
            numb = true;
        } else {
            numb = false;
        }
        return numb;
    }
    //Задание 8
    public static String stringNum(String string, int a) {
        for (int i = 1; i < a; i++) {
            System.out.println(string);
        }
        return string + '\n';
    }
    //Задание 9
    public static boolean year(int year) {
        if (year% 400 == 0) {
            return true;
        } else if (year% 100 == 0) {
            return false;
        } else if (year% 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //Задание 10
    public static String array() {
        int args = 5;
        int[] array = new int[]{1, 0, 1, 0, 1, 0};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));;
        int i = 0;
        while (i <= args) {
            array[i] ^= 1;
            i++;
        }
        System.out.println("Изменённый массив:");
        return Arrays.toString(array) + '\n';
    }
    //Задание 11
    public static String array100() {
        int[] arr = new int[101];
        for (int i = 1; i<=100; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "]=" + i);
        }
        return "";
    }
    //Задание 12
    public static String array12() {
        int args = 11;
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < args; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Изменённый массив:");
        return Arrays.toString(array) + '\n';
    }
    //Задание 13
    public static String diagonalArray(int x, int y) {
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return "";
    }
    //Задание 14
    public static String lenArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return Arrays.toString(array);
        }
    }
