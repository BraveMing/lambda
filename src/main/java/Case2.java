import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Case2 {
    public static void main(String[] args) {
        // Java 8之前：
//        oldWay();
        // Java 8之后：
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(o -> System.out.println(o));
    }

    private static void oldWay() {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (String feature : features) {
            System.out.println(feature);
        }
    }
}
