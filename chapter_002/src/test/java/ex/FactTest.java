package ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNIsNegative() {
        Fact.calc(-3);
    }
}
