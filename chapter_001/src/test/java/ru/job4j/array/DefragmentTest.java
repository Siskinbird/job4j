package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {
    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", null};
        assertThat(compressed, is(expected));
    }
    @Test
    public void single1FirstNull() {
        String[] input = {null, "I", "wanna"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna",  null};
        assertThat(compressed, is(expected));
    }
    @Test
    public void single2FirstNull() {
        String[] input = {null, "I", "wanna", "be", null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", null, null};
        assertThat(compressed, is(expected));
    }


    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}