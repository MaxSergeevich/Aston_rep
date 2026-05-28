import lesson_7_junit_5.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTests {

        @Test
        @DisplayName("Equal Numbers")
        void testEqualNumbers() {
            assertEquals("10 равно 10", Calculator.compare(10, 10));
            System.out.println("Тест выполнен: " + Calculator.compare(10, 10));
        }


        @Test
        @DisplayName("First Greater")
        void testFirstGreater() {
            assertEquals("100 больше 11", Calculator.compare(100, 11));
            System.out.println("Тест выполнен: " + Calculator.compare(100, 11));
        }

        @Test
        @DisplayName("Second Greater")
        void testSecondGreater() {
            assertEquals("1 меньше 4", Calculator.compare(1, 4));
            System.out.println("Тест выполнен: " + Calculator.compare(1, 4));
        }
}
