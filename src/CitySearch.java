
import models.City;

import java.util.*;
import java.util.stream.Collectors;

public class CitySearch  {
    public static Map<Integer, Integer> cityWithLargestNumberOfInhabitans(List<City> cityList)
    {
        int indexPopulation = -1;
        int min = Integer.MIN_VALUE;
        City[] arrCity = cityList.toArray(new City[0]);

        for(int i = 0 ;i < arrCity.length;i++)
        {
            int curPopulation = arrCity[i].getPopulation();
            if(curPopulation > min)
            {
                indexPopulation = i;
                min = curPopulation;
            }
        }
        return Map.of(indexPopulation,min);
    }
    public static Map<String, Integer> cityNumbersByRegion(List<City> cityList) {
        final Map<String, Integer> result = new HashMap<>();
        for (City city : cityList) {
            String key = city.getRegion();
            int sum = 1;
            if (result.containsKey(key)) {
                sum += result.get(key);
            }
            result.put(key, sum);
        }
        return result;
    }
    public static Map<String, Integer> cityNumbersByRegionNext(List<City> cityList) {
        return cityList.stream().collect(Collectors.toMap(City::getRegion, city -> 1, Integer::sum));
    }


    public static void printPopulation(Map<Integer, Integer> map) {
        map.forEach((key, value) -> System.out.printf("[%d] = %d%n", key, value));
    }

    public static void printRegion(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.printf("%s - %d%n", key, value));
    }




}
