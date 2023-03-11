package ref_dev.collection3;

import java.util.HashMap;

public class Example3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1= new HashMap<Integer,String>();
        HashMap<Integer,String> hm2= new HashMap<Integer,String>();
        hm1.put(1,"White");
        hm1.put(2,"Orange");
        hm1.put(3, "Black");
     System.out.println(hm1);

        hm2.put(4,"Blue");
        hm2.put(5,"Green");
        hm2.put(6,"Red");
        System.out.println(hm2);

        hm2.putAll(hm1);
        System.out.println("\n All values in hm2:" +hm2);

    }
    
}
