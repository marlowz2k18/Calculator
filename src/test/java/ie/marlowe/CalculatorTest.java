package ie.marlowe;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    public void testAdd() {
        calculator myCalc = new calculator();
        int result = myCalc.add(10, 50);
        assertEquals(60, result, 0);
    }

}
