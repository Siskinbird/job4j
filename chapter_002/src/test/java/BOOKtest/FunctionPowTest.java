package BOOKtest;
import static org.junit.Assert.*;

import BOOK.FunctionPow;
import org.junit.Test;


public class FunctionPowTest {
    @Test
    public void test() {
        assertEquals(4, FunctionPow.calculate(2), 0.01);
        assertEquals(9, FunctionPow.calculate(3), 0.01);
    }
}