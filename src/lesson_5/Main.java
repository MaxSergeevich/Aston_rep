package lesson_5;

public class Main {
    public static void main(String[] args) {

        String[][] validArray = {
                {"0", "1", "5", "14"},
                {"5", "6", "97", "8"},
                {"9", "1", "6", "7"},
                {"3", "2", "4", "3"}
        };

        try {
            int result = ArrayProcessor.processArray(validArray);
            System.out.println("Тест #1 (корректный массив): сумма = " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        String[][] invalidArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {
            int result = ArrayProcessor.processArray(invalidArray);
            System.out.println("Тест #2 (неправильный размер): сумма = " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Тест #2 (неправильный размер): Ошибка — " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        String[][] invalidDataArray = {
                {"21", "332", "83", "4"},
                {"5200", "74", "15", "5"},
                {"99", "100", "4", "21"},
                {"76", "aa", "6", "5"}
        };

        try {
            int result = ArrayProcessor.processArray(invalidDataArray);
            System.out.println("Тест #3 (некорректные данные): сумма = " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Тест #3 (некорректные данные): Ошибка — " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        try {
            int result = ArrayProcessor.processArray(null);
            System.out.println("Тест 4 (null массив): сумма = " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Тест 4 (null массив): Ошибка — " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
        arrayIndexOutOfBounds();
    }

    private static void arrayIndexOutOfBounds() {
        int[] numbers = {312, 2, 6, 10, 78, 93};
        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);

        try {
            System.out.println("Попытка доступа к numbers[10]...");
            int value = numbers[8];
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.err.println("Сообщение: " + e.getMessage());
            System.err.println("Программа продолжает работу после обработки исключения.");
        }

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("Двумерный массив: " + java.util.Arrays.deepToString(matrix));

        try {
            System.out.println("Попытка доступа к matrix[5][0]...");
            int value = matrix[5][0];
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Поймано исключение для двумерного массива: " + e.getMessage());
        }
    }
}
