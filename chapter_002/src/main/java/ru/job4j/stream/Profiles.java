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
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
}
