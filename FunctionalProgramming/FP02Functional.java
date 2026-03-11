// import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 2, 5, 3);
        List<Integer> squarNumbers = squarAllNumbers(numbers);
        System.out.println(squarNumbers);
        // int sum = addListFunctional(numbers);
        // System.out.println(sum);
        List<String> name = List.of("Fahd", "Amine", "Ksouss");
        System.out.println(name.stream()
            .map(n -> n.length())
            .collect(Collectors.toList()));
        }

        private static List<Integer> squarAllNumbers(List<Integer> numbers) {
        return numbers.stream()
            .map(x -> x * x)
            .sorted()
            .collect(Collectors.toList());
        }
        
    @SuppressWarnings("unused")
    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
            // .reduce(0, (a, b) -> a + b);
            .reduce(0, Integer::sum);
    }
}
