package ru.job4j.collection;

import java.util.*;

/**
 /* Directory of departments
 * @author Dmitry Chizhov
 * @since 25.07.20
 * @version 1.10
 */

public class Departments {
    /**
     * Method fillGaps sorts departments
     *
     * @param deps - Departments
     * @return - Returns a sorted list
     */

    public static List<String> fillGaps(List<String> deps) {
        TreeSet<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (!start.equals("")) {
                    tmp.add(start + "/" + el);
                    start = start + "/" + el;
                } else {
                    tmp.add(el);
                    start = el;
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * Method sortAsc for sorting departments in ascending order
     *
     * @param orgs
     */

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    /**
     * Method sortAsc for sorting departments in descending order
     *
     * @param orgs
     */

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}