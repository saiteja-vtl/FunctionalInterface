import java.util.ArrayList;
import java.util.List;

// Define a functional interface for demonstration
interface ListExamplein {
    void manipulateList(List<Integer> numbers);
}

// Implementing class that has the main method
public class ListExample implements ListExamplein {

    @Override
    public void manipulateList(List<Integer> numbers) {
        numbers.forEach(n -> System.out.println(n));

        System.out.println("\nEven numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\nSquared numbers:");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ListExample example = new ListExample();
        example.manipulateList(numbers);
    }
}


