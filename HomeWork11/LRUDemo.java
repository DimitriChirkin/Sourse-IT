
package HomeWork11;



import java.util.TreeMap;



public class LRUDemo {

    public static void main(String[] args){



        TreeMap<String, String> tm = new TreeMap<>();

        tm.put("z", "");

        tm.put("c", "aloo");

        tm.put("b"," alo");

        System.out.println(tm.firstEntry());

        System.out.println(tm.entrySet());

        System.out.println(tm.keySet());

    }

}