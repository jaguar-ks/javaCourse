import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 4, 2, 5, 3);
        int sum = addListStructured(numbers);
        System.out.println(sum);
    }

    public static int addListStructured(List<Integer> numbers) {
        int sum = 0;
        for (int number: numbers)
            sum += number;
        return sum;
    }
}