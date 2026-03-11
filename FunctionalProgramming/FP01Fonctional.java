import java.util.List;

public class FP01Fonctional {
    public static void main(String[] args) {
        List<String> courses =
            List.of("Spring", "Spring Boot", "API", "Microservices",
                "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        // printAllNumbersInListFonctional(List.of(12, 3, 6, 17, 4, 12, 30));
        // System.out.println("-----------------------------");
        // printEvenNumbersInListFonctional(List.of(12, 3, 6, 17, 4, 12, 30));
        System.out.println("-----------------------------");
        printAllCoursesInListFonctional(courses);
        System.out.println("-----------------------------");
        printCoursesWithSpringInListFonctional(courses);
        System.out.println("-----------------------------");
        printCoursesLongerThan4(courses);
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