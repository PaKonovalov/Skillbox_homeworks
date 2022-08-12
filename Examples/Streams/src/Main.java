import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Sergey", 38));
        personArrayList.add(new Person("Dasha", 7));
        personArrayList.add(new Person("Gala", 3));
        personArrayList.add(new Person("Sasha", 6));
        personArrayList.add(new Person("Anna", 18));

        // обыный вывод содержимого коллекции
//        for (Person p: personArrayList)
//            System.out.println(p);

        // вывод содержимого коллекции используя лямбда-выражения и Stream
        //personArrayList.stream().forEach((Person p) -> { System.out.println(p); });
        // можно ивидоизменить написанное выше, т.к. параметр один,можно убрать тип (Person) и фигурные скобки
        //personArrayList.stream().forEach(p -> System.out.println(p));
        // и еще можно сократить, комплятор предложит сам. условно запись ниже означает,
        // что список компилятор для каждого элемента personArrayList вызвать метод System.out.println
        personArrayList.stream().forEach(System.out::println);

        // удобсто использования метода stream() раскрывается если нам необходимо сортировать список, пример ниже
//        personArrayList.stream().filter(p -> {
//           return p.getAge() >= 18;
//
//        }).forEach(System.out::println);
        // улучшаеи, т.к. в лямбда-выражении одна строка
        //personArrayList.stream().filter( p -> p.getAge() >= 18 ).forEach(System.out::println);
        // сортировка через stream() используя comparator
        personArrayList.stream().filter( p -> p.getAge() >= 18 ).sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);


    }
}

