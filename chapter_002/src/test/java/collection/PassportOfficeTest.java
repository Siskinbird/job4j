package collection;

import org.junit.Test;
import ru.job4j.collection.Citizen;
import ru.job4j.collection.PassportOffice;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 /* Класс PassportOfficeTest реализует тесты для метода add класса PassportOffice
 * @author Dmitry Chizhov
 * @since 15.07.20
 * @version 1.00
 */
public class PassportOfficeTest {
    @Test
    public void add() {
        Citizen citizen = new Citizen("666iddqd666", "Lily Weatherwax");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }
}
