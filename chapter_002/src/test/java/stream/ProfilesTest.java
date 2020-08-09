package stream;

import org.junit.Test;
import ru.job4j.stream.Address;
import ru.job4j.stream.Profile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.stream.Profiles.collect;

public class ProfilesTest {
    @Test
    public void whenAllWorks(){
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Hell", "Scream", 6, 66)),
                new Profile(new Address("Heaven", "Angel", 9, 99)),
                new Profile(new Address("Moscow", "Putin", 13, 13)),
                new Profile(new Address("Khabarovsk", "Protest", 24, 42)));
        assertThat(collect(profiles), is(profiles.stream().map(Profile::getAddress).collect(Collectors.toList())));
    }
}
