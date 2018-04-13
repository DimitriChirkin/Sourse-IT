package HomeWork11;



import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;



public class Demo {

    public static void main(String[] args) {



                DefaultMyList s = new DefaultMyList();

            List p = new ArrayList();

            p.add("Hi");

            p.add("Privet");

            s.add("Hi");

            s.add("Privet");

            s.add("Lol");



           System.out.println(s.contains("H"));

           System.out.println(s.sizes());

           System.out.println(s.contains("Privet"));

           System.out.println(s.containsAll(p));

           s.remove("Hi");

            s.clears();

            Iterator<Object> it = s.iterator();

            while (it.hasNext()){

                System.out.println(it.next());

            }









    }

}