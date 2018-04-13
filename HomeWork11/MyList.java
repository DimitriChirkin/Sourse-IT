package HomeWork11;

import java.lang.Iterable;



import java.util.List;



public interface MyList<Object> extends Iterable<Object> {

    public void add(Object e);



    public int sizes();



    public Object[] toArrays();



    public boolean contains(Object o);



    boolean containsAll (List c);



    boolean remove(Object o);



    void clears();

}