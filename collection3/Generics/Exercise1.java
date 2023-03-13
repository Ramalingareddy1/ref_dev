import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(12));

        for (Integer data : integerList) {
            System.out.printf("Integer value: %d\n", data);
        }
    }
}
