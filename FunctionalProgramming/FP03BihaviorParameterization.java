import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03BihaviorParameterization {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> lst = applyAndCollecte(numbers, x -> x * x);
        System.out.println(lst);
    }
    
    private static List<Integer> applyAndCollecte(List<Integer> numbers, Function<Integer, Integer> applyFunction) {
        return numbers.stream()
            .map(applyFunction)
            .collect(Collectors.toList());
    }
}