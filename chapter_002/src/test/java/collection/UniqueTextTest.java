package collection;

import org.junit.Test;
import ru.job4j.collection.UniqueText;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class UniqueTextTest {
     /**
     /* Тесты для метода isEquals реализующего проверку текста на идентичность
     * @author Dmitry Chizhov
     * @since 14.07.20
     * @version 1.01
     */
    @Test
    /**
     * Когда проверяемый текст идентичен
     */
    public void isEquals() {
        String origin = "My cat eats a mouse and milk";
        String text = "My cat eats milk and a mouse";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }
    /**
     * Когда проверяемый текст не идентичный
     */
    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
    /**
     * Когда проверяемый текст не идентичный
     */
    @Test
    public void isNotEquals1() {
        String origin = "For the Horde";
        String text = "For the Alliance";
        assertThat(UniqueText.isEquals(origin, text), is(false));
    }
    /**
     * Когда проверяемый текст идентичный
     */
    @Test
    public void isEquals1() {
        String origin = "You speak of justice of cowardice I will show you what fear is and introduce you to the justice of death";
        String text = "You speak of cowardice of justice I show what you will fear is and introduce to you the death of justice";
        assertThat(UniqueText.isEquals(origin, text), is(true));
    }
}
