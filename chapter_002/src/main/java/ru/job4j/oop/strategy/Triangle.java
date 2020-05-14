package ru.job4j.oop.strategy;
import java.util.StringJoiner;

/**
 * @author Dmitrii Chizhov (dimavhig@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringJoiner pic = new StringJoiner(System.lineSeparator());
                pic.add("  ^  ");
                pic.add(" ^ ^ ");
                pic.add("^^^^^");
          return pic.toString();
    }

}
