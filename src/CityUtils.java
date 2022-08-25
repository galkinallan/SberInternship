import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityUtils {

    public static List<City> parse() {
        List<City> list = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/resources/Задача ВС Java Сбер.csv"));
            scanner.useDelimiter(";|\n");
            while (scanner.hasNext()) {
                list.add(new City(Integer.parseInt(scanner.next()), scanner.next(), scanner.next(), scanner.next(),
                        Integer.parseInt(scanner.next()), scanner.next().replace("\r", "")));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public static void print(List<City> cities) {
        for (City city : cities) {
            System.out.println(city.toString());
        }
    }


}
