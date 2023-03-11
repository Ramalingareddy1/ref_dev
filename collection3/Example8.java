package ref_dev.collection3;
import java.util.*;

public class Example8 {
    public static void main(String[] args) {
        HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
     hash_map.put(1, "Red");
     hash_map.put(2, "Green");
     hash_map.put(3, "Black");
     hash_map.put(4, "White");
     hash_map.put(5, "Blue");
     System.out.println(hash_map);

     String val = hash_map.get(3);

     System.out.println(" Value of the key is 3 is:  "+val);
    }
    
}
