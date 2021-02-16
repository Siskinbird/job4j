package collection;
import org.junit.Test;
import ru.job4j.collection.Order;
import ru.job4j.collection.OrderConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 /* Класс OrderConvertTest реализует тестирование для класса OrderConvert
 * @author Dmitry Chizhov
 * @since 16.07.20
 * @version 1.00
 */
public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = List.of(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }
}