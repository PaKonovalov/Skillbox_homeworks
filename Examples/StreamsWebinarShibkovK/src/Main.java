import java.util.*;
import java.util.stream.Stream;

// https://www.youtube.com/watch?v=scXHtNMeAu0 видео к примерам

public class Main {
    public static void main(String[] args) {
//       Пример 1
//       Stream.of("455", "5848", "turt")
//               .map(String::length)
//               .map(i -> i * 4)
//               .map(String::valueOf)
//               .peek(x -> System.out.println("peek: " + x))
//               .map(String::length)
//               .forEach(System.out::println);

//       Пример 2

//        Stream<List<Integer>> stream = Stream.of(List.of(1, 4, 5), List.of(1), List.of(4, 7));
//                stream.sorted(Comparator.comparing(List::size))
//                .peek(x -> System.out.println("peek: " + x)) // вывод промежуточного результата
//                .sorted(Collections.reverseOrder(List::indexOf)) // реверс
//                .forEach(System.out::println);


//       Пример 3 так не работает

//        List<String> list = List.of("1", "2");
//        Stream<String> streamExThree = list.stream()
//                .map(s -> "->" + s);
//
//        list.add("3");
//
//        streamExThree.forEach(System.out::println);

//       Пример 4 так работает

//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        Stream<String> streamExFour = list.stream()
//                .map(s -> "-> " + s);
//
//        list.add("3");
//
//        streamExFour.forEach(System.out::println);

//       Пример 5 Optional

//        Optional<Integer> streamExFive = Stream.of(1, 2, 3, 4)
//                .filter(i -> i > 10)
//                .max(Integer::compare);
//        if(streamExFive.isPresent()) System.out.println(streamExFive.get());
//        else System.out.println("Максимальное значение не найдено");

//       Пример 6 Match

        boolean hashMoreThanTen = Stream.of(1, 2, 3, 4)
                .peek(System.out::println)
                .anyMatch(i -> i > 10); // false

    }
}
