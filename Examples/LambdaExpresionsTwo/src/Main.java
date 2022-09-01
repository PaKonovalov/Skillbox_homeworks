import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.ls.LSOutput;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    private static String staffFile = ".idea/data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static <A> void main(String[] args) {
        // ArrayList<Employee> staff = loadStaffFromFile();
        // 1. реализация компаратора через анонимный класс
//        Collections.sort(staff, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getSalary().compareTo(o2.getSalary());
//            }
//        });

        // 2. реализация через лямбда-выражения
        //Collections.sort( staff, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));

        // 3. реализация через Указатели на методы
        //Collections.sort( staff, Comparator.comparing(Employee::getSalary));

        // 1. Перебор списка с использованием цикла for (стандартный вариант)
//        for(Employee employee : staff){
//            System.out.println(employee);
//        }

        // 2. Перебор списка с использованием цикла forEach и лямбда выражения
        //staff.forEach(employee -> System.out.println(employee));

        // System.out.println("Old salsries");
        // 2.1 поскольку мы вызываем единственный метод мы можем переписать предыдущую реализацию используя указатели на метод
//        staff.forEach(System.out::println);
//
//        int salaryIncrease = 10000;
//        staff.forEach(e -> e.setSalary(e.getSalary() + salaryIncrease));
//
//        System.out.println("\nNew salsries");
//        staff.forEach(System.out::println);

        // Использование stream.api
        //staff.stream().filter(e -> e.getSalary() >= 100_000).forEach(System.out::println);

        //отвлеченный пример Использование stream.api
        //  Stream<Integer> numbers = Stream.of(1, 2 , 3, 4, 5, 6, 7, 8, 9, 10);
        //  numbers.filter(num -> num % 2 == 0).forEach(System.out::println);

//        staff.stream()
//                .map(Employee::getSalary)
//                .filter(s -> s >= 100_000)
//                .reduce((s1, s2) -> s1 + s2)
//                .isPresent(System.out::prin

// Пример использования Generics
//
//        LRUcache<Employee> cache = new LRUcache<>(5);
//        for (Employee employee : staff) {
//            cache.addElement(employee);
//        }
//        cache.getAllElements().forEach(System.out::println);

        // пример мавен с использованием json файла
        try {
            String data = getDataFromFile(".idea/data/StaffJSON.json");
            JSONParser parser = new JSONParser();
            JSONArray array = (JSONArray) parser.parse(data);
            for(Object item : array){
                JSONObject jsonObject = (JSONObject) item;
                System.out.println(jsonObject.get("name"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }

    private static String getDataFromFile(String path){

        StringBuilder builder = new StringBuilder();

        try {
           List<String> lines = Files.readAllLines(Paths.get(path));
           for (String line : lines){
               builder.append(line);
           }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return builder.toString();
    }
}

