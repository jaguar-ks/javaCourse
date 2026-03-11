import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<String> courses =
            List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> numbers = List.of(12, 3, 6, 17, 4, 12, 30, 15);
        // printAllNumbersInListFonctional(List.of(12, 3, 6, 17, 4, 12, 30));
        // System.out.println("-----------------------------");
        // printEvenNumbersInListFonctional(List.of(12, 3, 6, 17, 4, 12, 30));
        System.out.println("-----------------------------");
        printAllCoursesInListFonctional(courses);
        System.out.println("-----------------------------");
        printCoursesWithSpringInListFonctional(courses);
        System.out.println("-----------------------------");
        courses.stream()
            .map(course -> course.length())
            .forEach(System.out::println);
        System.out.println("-----------------------------");
        printCoursesLongerThan4(courses);
        System.out.println("-----------------------------");
        numbers.stream()
            .filter(number -> number % 2 != 0)
            .map(number -> number * number * number)
            .forEach(System.out::println);
        System.err.println(Integer.MAX_VALUE);
    }

    // private static void printAllNumbersInListFonctional(List<Integer> numbers) {
    //     numbers.stream()
    //         .forEach(System.out::println);
    // }

    private static void printAllCoursesInListFonctional(List<String> courses) {
        courses.stream()
            .forEach(System.out::println);
    }

    private static void printCoursesWithSpringInListFonctional(List<String> courses) {
        courses.stream()
            .filter(course -> course.contains("Spring"))
            .forEach(System.out::println);
    }

    private static void printCoursesLongerThan4(List<String> courses) {
        courses.stream()
            .filter(course -> course.length() >= 4)
            .forEach(System.out::println);
    }

    // private static void printEvenNumbersInListFonctional(List<Integer> numbers) {
    //     numbers.stream()
    //         .filter(number -> number % 2 == 0)
    //         .forEach(System.out::println);
    // }
}