import java.util.*;

public class Case1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        for (Integer integer : list) {
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.println();
        Collections.sort(list,(o1, o2) -> o1-o2);
        for (Integer integer : list) {
            System.out.print(integer);
            System.out.print(" ");
        }
    }

    private static void oldWay(List<Integer> list) {
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
    }
}
