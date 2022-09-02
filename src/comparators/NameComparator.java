package comparators;

import models.City;

import java.util.Comparator;

public class NameComparator implements Comparator<City> {
    public int compare(City o1, City o2) {
        int result = String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}