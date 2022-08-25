import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityCounter {
    public static void countCitiesByRegion(List<City> list) {
        Map<String, Integer> regions = new HashMap<>();
        list.forEach(city -> regions.merge(city.getRegion(), 1, Integer::sum));
        regions.forEach((k, v) -> System.out.printf("[%s] = %d\n", k, v));
    }
}
