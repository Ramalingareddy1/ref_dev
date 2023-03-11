package ref_dev.collection3;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(1,"White");
        hm.put(2, "Red");
        hm.put(3,"Orange");
        hm.put(4,"Black");
        hm.put(5,"Blue");

        for(Map.Entry x: hm.entrySet()){
            System.out.println(x.getKey()+"   " + x.getValue());
        }
    }
    
}
