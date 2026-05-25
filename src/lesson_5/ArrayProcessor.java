package lesson_5;

public class ArrayProcessor {

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array == null || array.length != 4) {
            throw new MyArraySizeException("Массив должен содержать 4 строки. Текущий размер: " +
                    (array == null ? "null" : array.length) + " строк/ки");
        }

        for (int i = 0; i < 4; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " должна содержать 4 элемента. Текущий размер: " +
                        (array[i] == null ? "null" : array[i].length) + " элемента/ов");
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования. В ячейке [" + i + "][" + j +
                            "]: значение '" + array[i][j] + "' невозможно преобразовать в int");
                }
            }
        }
        return sum;
    }
}

