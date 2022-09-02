import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import comparators.CompDistrictAndName;
import comparators.NameComparator;
import models.City;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users/Sasha\\Downloads\\Sber_virtual_internship_1\\Задача ВС Java Сбер.csv"));
        String line = null;
        Scanner sc = null;
        int index = 0;
        List<City> cityList = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            City city = new City();
            sc = new Scanner(line);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String file = sc.next();
                if (index == 1)
                    city.setName(file);
                else if (index == 2)
                    city.setRegion(file);
                else if (index == 3)
                    city.setDistrict(file);
                else if (index == 4)
                    try {
                        city.setPopulation(Integer.parseInt(file));
                    } catch (NumberFormatException e) {}
                else if (index == 5)
                    city.setFoundation(file);
                index++;
            }
            index = 0;
            cityList.add(city);
        }
        reader.close();

        Scanner in = new Scanner(System.in);
        String menu = ("\nВыберите вариант сортировки данных справочника городов: \n" +
                "1. Вывод всех городов\n" +
                "2. Сортировка списка городов по наименованию в алфавитном порядке по убыванию\n" +
                "3. Сортировка списка городов по федеральному округу и наименование города внутри каждого федерального округа в алфавитном порядке по убыванию\n" +
                "4. Вывод города с наибольшим населением\n" +
                "5. Поиск количества городов в разрезе регионов\n" +
                "6. Выход");
        System.out.println(menu);

        boolean isQuit = false;
        while (!isQuit)
        {
            int num = in.nextInt();
        switch (num) {
            case 1:
                System.out.println(cityList);
                break;
            case 2:
                Comparator nameComparator = new NameComparator();
                Collections.sort(cityList, nameComparator.reversed());
                System.out.println(cityList);
                break;
            case 3:
                Comparator compDistrictAndName = new CompDistrictAndName();
                Collections.sort(cityList, compDistrictAndName.reversed());
                System.out.println(cityList);
                break;
            case 4:
                Map<Integer, Integer> cityWithLargestNumberOfInhabitans= CitySearch.cityWithLargestNumberOfInhabitans(cityList);
                CitySearch.printPopulation(cityWithLargestNumberOfInhabitans);
                break;
            case 5:
                Map<String, Integer> cityNumbersByRegion = CitySearch.cityNumbersByRegion(cityList);
                CitySearch.printRegion(cityNumbersByRegion);

                Map<String, Integer> cityNumbersByRegionNext = CitySearch.cityNumbersByRegionNext(cityList);
                CitySearch.printRegion(cityNumbersByRegionNext);
                break;
            case 6:
                isQuit = true;
                break;
            default:
                System.out.println("Такого варианта сортировки не существует");

        }
            System.out.println(menu);
        }

    }

}
