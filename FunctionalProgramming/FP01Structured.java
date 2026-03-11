import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 3, 6, 17, 4, 12, 30));
        System.out.println("-----------------------------");
        printEvenNumbersInListStructured(List.of(12, 3, 6, 17, 4, 12, 30));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number: numbers)
            System.out.println(number);
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number: numbers)
            if (number % 2 == 0)
                System.out.println(number);
    }
}
