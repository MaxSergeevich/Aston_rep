import lesson_7_junit_5.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTests {
    private Calculator Calculator;

    @BeforeEach
    void setUp() {
        Calculator = new Calculator();
    }


    @Test
    @DisplayName("Factorial 0")
    void testFactorialZero() {
        assertEquals(1, Calculator.factorial(0));
        System.out.println("Тест выполнен: " + Calculator.factorial(0));
    }

    @Test
    @DisplayName("Factorial Positive")
    void testFactorialFive() {
        assertEquals(3628800, Calculator.factorial(10));
        System.out.println("Тест выполнен: " + Calculator.factorial(10));
    }

    @Test
    @DisplayName("Factorial Negative")
    void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.factorial(-5));
        System.out.println("Тест выполнен: " + assertThrows(IllegalArgumentException.class, () ->
                Calculator.factorial(-5)));
    }
}

