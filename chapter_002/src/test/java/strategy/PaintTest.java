package strategy;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import ru.job4j.oop.strategy.Paint;
import ru.job4j.oop.strategy.Square;
import ru.job4j.oop.strategy.Triangle;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;


/**
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
        private final PrintStream stdout = System.out; // поле содержит дефолтный вывод в консоль.
        private final ByteArrayOutputStream out = new ByteArrayOutputStream(); // буфер для результата.

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                this.out.toString(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("++++")
                                .add("+     +")
                                .add("+     +")
                                .add("++++")
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                this.out.toString(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("  ^  ")
                                .add(" ^ ^ ")
                                .add("^^^^^")
                                .toString()
                )
        );
    }
}