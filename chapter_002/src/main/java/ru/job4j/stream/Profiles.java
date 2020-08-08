package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Profile address list
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 08.08.2020
 * @version 1.00
 */

public class Profiles {
    public static void main(String[] args) {
        List<Profile> profiles = new ArrayList<>();
        Profile profileA = new Profile(new Address("Hell", "Scream", 6, 66));
        Profile profileB = new Profile(new Address("Heaven", "Angel", 9, 99));
        Profile profileC = new Profile(new Address("Moscow", "Putin", 13, 13));
        Profile profileD = new Profile(new Address("Khabarovsk", "Protest", 24, 42));
        profiles.add(profileA);
        profiles.add(profileB);
        profiles.add(profileC);
        profiles.add(profileD);
        Profiles.collect(profiles);
        System.out.println(profiles);
    }

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
}
