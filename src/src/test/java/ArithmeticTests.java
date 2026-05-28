import lesson_7_junit_5.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticTests {

    @Test
    @DisplayName("Adding Of 2 Numbers")
    void testAddition() {
        assertEquals(2, Calculator.add(1, 1));
        System.out.println("Тест выполнен: " + Calculator.add(1, 1));
    }

    @Test
    @DisplayName("Subtracting Of 2 Numbers")
    void testSubtraction() {
        assertEquals(6, Calculator.subtract(9, 3));
        System.out.println("Тест выполнен: " + Calculator.subtract(9,3));
    }

    @Test
    @DisplayName("Multiplication Of 2 Numbers")
    void testMultiplication() {
        assertEquals(6, Calculator.multiply(2, 3));
        System.out.println("Тест выполнен: " + Calculator.multiply(2,3));
    }

    @Test
    @DisplayName("Division Of 2 Numbers")
    void testDivision() {
        assertEquals(5.625, Calculator.divide(45, 8));
        System.out.println("Тест выполнен: " + Calculator.divide(45,8));
    }

    @Test
    @DisplayName("Division By Zero")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(8, 0));
        System.out.println("Тест выполнен: " + assertThrows(ArithmeticException.class, () ->
                Calculator.divide(8, 0)));
    }
}
