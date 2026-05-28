import lesson_7_junit_5.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTests {


    @Test
    @DisplayName("Right Triangle")
    void testRightTriangle() {
        assertEquals(6.0, Calculator.calculateArea(3, 4, 5));
        System.out.println("Тест выполнен: " + Calculator.calculateArea(3,4,5));
    }

    @Test
    @DisplayName("Equilateral Triangle")
    void testEquilateralTriangle() {
        assertEquals(6.928203230275509, Calculator.calculateArea(4, 4, 4));
        System.out.println("Тест выполнен: " + Calculator.calculateArea(4,4,4));
    }

    @Test
    @DisplayName("Invalid Triangle")
    void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculateArea(1, 1, 3));
        System.out.println("Тест выполнен: " + assertThrows(IllegalArgumentException.class, () ->
                Calculator.calculateArea(1, 1, 3)));
    }

    @Test
    @DisplayName("Negative Side Of Triangle")
    void testNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculateArea(-1, 2, 3));
        System.out.println("Тест выполнен: " + assertThrows(IllegalArgumentException.class, () ->
                Calculator.calculateArea(-1, 2, 3)));
    }
}
