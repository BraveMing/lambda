import java.util.Arrays;
import java.util.List;

public class Case5 {
    public static void main(String[] args) {
        // 不使用lambda表达式为每个订单加上12%的税
//        old();

// 使用lambda表达式
//        lambda();
        // 新方法：
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double bill = costBeforeTax.stream().map((cost) -> cost + 0.12*cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);
    }

    private static void lambda() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax.stream().map((cost) -> cost + 0.12*cost).forEach(System.out::println);
        costBeforeTax.forEach(System.out::println);
    }

    private static void old() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + .12*cost;
            System.out.println(price);
        }
    }
}
