import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(10, calculator.add(7, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void dif() {
        assertEquals(5, calculator.dif(8, 3));
        assertEquals(4, calculator.dif(10, 6));
        assertEquals(-3, calculator.dif(5, 8));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(24, 6));
        assertEquals(2, calculator.div(10, 5));
        assertThrows(IllegalArgumentException.class,
                () -> calculator.div(10, 0), "You can't divide by 0");
    }

    @Test
    void times() {
        assertEquals(27, calculator.times(9, 3));
        assertEquals(-1, calculator.times(-1, 1));
        assertEquals(0, calculator.times(0, 10));
    }

    @Test
    void solver() {
        assertEquals(18, calculator.solver(4, 5, 8, 2));
        assertEquals(11, calculator.solver(3, 4, 4, 2));
        assertThrows(IllegalArgumentException.class,
            () -> calculator.solver(3, 4, 4, 0), "You can't divide by 0");
    }

}
