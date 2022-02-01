import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapCounter {

    public static int count(List<Integer> list, int k) {
        Collections.swap(list, 0, 2);
        return 1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


    }
}
