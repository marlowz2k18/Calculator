package ie.marlowe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private calculator c;

    @BeforeEach
    void init(){
        c = new calculator();
    }

    @DisplayName("Add two number 10 and 50")
    @Test
    public void testAdd() {
        c = new calculator();
        int result = c.add(10, 50);
        assertEquals(60, result, 0);
    }


//    @Test
//    public void testAddFail(){
//        c = new calculator();
//        assertThrows(IllegalArgumentException.class, () -> c.add(5, 4));
//    }

    @DisplayName("Multiply by 5 and 4")
    @Test
    public void testMult(){
        c = new calculator();
        int result1 = c.multiply(5, 4);
        assertEquals(20, result1, 0);
    }

//    @Test
//    public void testMultFail(){
//        c = new calculator();
//        assertThrows(IllegalArgumentException.class, () -> c.multiply(10, 6));
//    }

    @Test
    public void testDivide(){
        c = new calculator();
        int result2 = c.divide(20, 10);
        assertEquals(2, result2, 0);
    }

    @Test
    public void testDivideFail(){
        c = new calculator();
        assertThrows(IllegalArgumentException.class, () -> c.divide(0, 4));
    }

}
