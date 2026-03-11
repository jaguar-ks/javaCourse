import java.util.List;

public class FP01Fonctional {
    public static void main(String[] args) {
        printAllNumbersInListFonctional(List.of(12, 3, 6, 17, 4, 12, 30));
        System.out.println("-----------------------------");
        printEvenNumbersInListFonctional(List.of(12, 3, 6, 17, 4, 12, 30));
    }

    private static void printAllNumbersInListFonctional(List<Integer> numbers) {
        numbers.stream()
            .forEach(System.out::println);
    }

    private static void printEvenNumbersInListFonctional(List<Integer> numbers) {
        numbers.stream()
            .filter(number -> number % 2 == 0)
            .forEach(System.out::println);;
    }
}