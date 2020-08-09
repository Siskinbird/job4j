package stream;

import org.junit.Test;
import ru.job4j.stream.Address;
import ru.job4j.stream.Profile;
import ru.job4j.stream.Profiles;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenSwapProfileToAddress() {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Hell", "Scream", 6, 66)),
                new Profile(new Address("Heaven", "Angel", 9, 99)),
                new Profile(new Address("Moscow", "Putin", 13, 13)),
                new Profile(new Address("Khabarovsk", "Protest", 24, 42)));
        List<Address> expect = Arrays.asList(
                new Address("Heaven", "Angel", 9, 99),
                new Address("Hell", "Scream", 6, 66),
                new Address("Khabarovsk", "Protest", 24, 42),
                new Address("Moscow", "Putin", 13, 13));
        assertThat(Profiles.collect(profiles), is(expect));
    }
    @Test
    public void whenDeleteDuplicate() {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Hell", "Scream", 6, 66)),
                new Profile(new Address("Hell", "Scream", 6, 66)),
                new Profile(new Address("Heaven", "Angel", 9, 99)),
                new Profile(new Address("Moscow", "Putin", 13, 13)),
                new Profile(new Address("Khabarovsk", "Protest", 24, 42)));
        List<Address> expect = Arrays.asList(
                new Address("Heaven", "Angel", 9, 99),
                new Address("Hell", "Scream", 6, 66),
                new Address("Khabarovsk", "Protest", 24, 42),
                new Address("Moscow", "Putin", 13, 13));
        assertThat(Profiles.collect(profiles), is(expect));
    }
}
