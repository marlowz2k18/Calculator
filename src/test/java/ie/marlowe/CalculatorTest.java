package ie.marlowe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private calculator c;

    @BeforeEach
    void init(){
        c = new calculator();
    }

    @Test
    public void testAdd() {
        c = new calculator();
        int result = c.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    public void testMult(){
        c = new calculator();
        int result1 = c.multiply(5, 4);
        assertEquals(20, result1, 0);
    }

    @Test
    public void testDivide(){
        c = new calculator();
        int result2 = c.divide(20, 10);
        assertEquals(2, result2, 0);
    }

}
