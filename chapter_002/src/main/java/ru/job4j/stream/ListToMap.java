package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * Class ListToMap turns a list of students into a map
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 09.08.2020
 * @version 1.00
 */
public class ListToMap {
    /**
     * Method mapIn turns a list of students into a map of Students
     * @param reworks - List of Students
     * @return - Map of Students
     */
    public static Map<String, Student> mapIn(List<Student> reworks) {
        return reworks.stream().collect(Collectors.toMap(Student::getSurname, obj -> obj,  (sur1, sur2) -> sur1));
    }
}
