import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Case3 {
    public static void main(String[] args) {
        int[] ints ={1,2,3};
        Arrays.sort(ints);
        List<String> list =new ArrayList<String>();
        Collections.sort(list);
        Collections.sort(list,(o1, o2) -> o1.compareTo(o2));
    }
}
