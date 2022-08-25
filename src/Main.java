import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<City> list = new ArrayList<>();
        list = CityUtils.parse();
        CityCounter.countCitiesByRegion(list);
    }
}
