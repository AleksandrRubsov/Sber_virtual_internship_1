package comparators;

import java.util.Comparator;

import models.City;

public class CompDistrictAndName implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        int result = o1.getDistrict().compareTo(o2.getDistrict());
        if(result==0)
        {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
