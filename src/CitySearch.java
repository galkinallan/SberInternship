import java.util.Arrays;
import java.util.List;

public class CitySearch {

    public static void findMaxPopulation(List<City> list) {
        City[] cities = new City[list.size()];
        list.toArray(cities);
        int index = 0;
        City maxPopulationCity = cities[0];

        for (int i = 1; i < cities.length; i++) {
            if (cities[i].getPopulation() > maxPopulationCity.getPopulation()) {
                index = i;
                maxPopulationCity = cities[i];
            }
        }
        System.out.println("[" + index + "] = " + maxPopulationCity.getPopulation());
    }
}
