import java.util.List;
// import java.util.function.Function;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 2, 5, 3);
        int sum = addListFunctional(numbers);
        System.out.println(sum);
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
            // .reduce(0, (a, b) -> a + b);
            .reduce(0, Integer::sum);
    }
}
