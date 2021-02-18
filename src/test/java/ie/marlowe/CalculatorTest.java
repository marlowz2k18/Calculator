package ie.marlowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        calculator myCalc = new calculator();
        int result = myCalc.add(10, 50);
        assertEquals(60, result, 0);
    }

}
