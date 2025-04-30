import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

    public class CalculatorTest {
        @ Test
        void testSubtraction() {
            assertEquals("0.0",
 Calculator.Run("5-5"));
        }

        @Test
        void testAddition() {
            assertEquals("10.0",
Calculator.Run("5+5"));
        }

        @Test
        void testMultiplication() {
            assertEquals("25.0",
  Calculator.Run("5*5"));

        }

        @Test
         void testDivision() {
             assertEquals("1.0",
Calculator.Run("5/5"));
        }

        @Test
        void testMultipleOperation() {
            assertEquals("5.0",
Calculator.Run("5/5+2*2"));
    }
