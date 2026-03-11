import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudent;
    
    public Course(String name, String category, int reviewScore, int noOfStudent) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudent = noOfStudent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString () {
        return name + ":" + noOfStudent + ":" + reviewScore;
    }
};


public class FP04CustomClass {
    public static void main(String [] args) {
        List<Course> courses = List.of(
            new Course("React", "Framework", 95, 1200),
            new Course("Django", "Framework", 98, 1200),
            new Course("RestAPI", "WebDev", 78, 900),
            new Course("AWS", "Cloud", 93, 720),
            new Course("Docker", "Contenirization", 77, 210)
        );
        
        Predicate<Course> ReviewScoreGraterThan90 = course -> course.getReviewScore() > 90;
        
        System.out.println(
            courses.stream()
            .allMatch(ReviewScoreGraterThan90)
        );
        System.out.println(
            courses.stream()
            .noneMatch(ReviewScoreGraterThan90)
        );
        System.out.println(
            courses.stream()
            .anyMatch(ReviewScoreGraterThan90)
        );

        Comparator<Course> comparingByStudentNumber
                    = Comparator.comparing(Course::getNoOfStudent)
                        .thenComparing(Course::getReviewScore)
                        .reversed();
        
        System.out.println(
            courses.stream()
            .sorted(comparingByStudentNumber)
            .skip(2)
            .limit(2)
            .toList()
        );
        
        System.out.println(
            courses.stream()
            .collect(
                Collectors.groupingBy(
                    Course::getCategory,
                    Collectors.counting()
                )
            )
        );
        
        System.out.println(
            courses.stream()
            .collect(
                Collectors.groupingBy(
                    Course::getCategory,
                    Collectors.maxBy(Comparator.comparing(Course::getReviewScore))
                )
            )
        );
        
        System.out.println(
            courses.stream()
            .collect(
                Collectors.groupingBy(
                    Course::getCategory,
                    Collectors.mapping(
                        Course::getName,
                        Collectors.toList()
                    )
                )
            )
        );
        
    };
};
