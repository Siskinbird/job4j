package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Profile address list
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 08.08.2020
 * @version 1.10
 */

public class Profiles {
    public static void main(String[] args) {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Hell", "Scream", 6, 66)),
                new Profile(new Address("Heaven", "Angel", 9, 99)),
                new Profile(new Address("Moscow", "Putin", 13, 13)),
                new Profile(new Address("Khabarovsk", "Protest", 24, 42)));
        System.out.println(collect(profiles));
    }

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
}
