package lambda;

import org.junit.Test;
import ru.job4j.lambda.FunctionRange;

import java.util.Arrays;
import java.util.List;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FunctionRangeTest {
    /**
     * Linear function
     */
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionRange.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    /**
     * Quadratic function
     */
    @Test
    public void whenQuad() {
        List<Double> result = FunctionRange.diapason(5, 13, x -> x * x - x - 5);
        List<Double> expected = Arrays.asList(15D, 25D, 37D, 51D, 67D, 85D, 105D, 127D);
        assertThat(result, is(expected));
    }

    /**
     * Exponential function
     */
    @Test
    public void whenPow() {
        List<Double> result = FunctionRange.diapason(2, 7, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(4D, 27D, 256D, 3125D, 46656D);
        assertThat(result, is(expected));
    }
}
