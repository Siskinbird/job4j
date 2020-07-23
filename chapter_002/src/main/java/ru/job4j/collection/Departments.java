package ru.job4j.collection;

import java.util.*;

/**
 /* Directory of departments
 * @author Dmitry Chizhov
 * @since 23.07.20
 * @version 1.00
 */

public class Departments {
    /**
     * Method fillGaps sorts departments
     * @param deps - Departments
     * @return - Returns a sorted list
     */

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (!start.equals("")){
                    tmp.add(start + "/" + el);
                    start = start + "/" + el;
                }else {
                    tmp.add(el);
                    start = el;
                }
            }
        }
        ArrayList rst = new ArrayList(tmp);
        sortAsc(rst);
        return rst;
    }

    /**
     * Method sortAsc for sorting departments in ascending order
     * @param orgs
     */

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    /**
     * Method sortAsc for sorting departments in descending order
     * @param orgs
     */

    public static void sortDesc(List<String> orgs) {
        orgs.sort(Collections.reverseOrder());
    }
}
