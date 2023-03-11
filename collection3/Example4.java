package ref_dev.collection3;

import java.util.HashMap;

public class Example4 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(1,"White");
        hm.put(2, "Red");
        hm.put(3, "Blue");
        hm.put(4,"Green");
        hm.put(5, "Black");
        System.out.println(hm);

        boolean result =hm.isEmpty();
        System.out.println("Is hash map is empty:"+ result);
        

        hm.clear();
        System.out.println(hm);
        result=hm.isEmpty();
        System.out.println("Is hash map is empty:"+ result);
    
    }
    
}
