import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.forEach(n -> System.out.println(n));

        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        numbers.stream().map(n -> n * n).forEach(System.out::println);
    }
}

