import java.util.Comparator;
import java.util.List;

public class CitySorter {

    public static void sortByName(List<City> list) {
        list.sort(Comparator.comparing(City::getName));
    }

    public static void sortByNameAndDistrict(List<City> list) {
        list.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
    }

}

