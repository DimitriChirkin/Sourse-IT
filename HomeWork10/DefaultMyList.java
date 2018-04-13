package HomeWork10;



import java.util.*;



public class DefaultMyList implements MyList {





    List list = new ArrayList<>();

    Iterator<Object> it = list.iterator();



    int cursor;

    int lastElement;







    @Override

    public void add(Object e) {

        list.add(e);

        lastElement++;

    }

    @Override

    public int size() {

        return list.size();

    }



    @Override

    public boolean contains(Object o) {

        if(list.contains(o)){

           return  true;

        }

        return false;

    }



    @Override

    public boolean containsAll(MyList c) {

        if(list.equals(c)){

            return true;

        }



        return false;

    }



    @Override

    public boolean remove(Object o) {

        list.indexOf(o);

        list.remove(o);

        return false;

    }



    @Override

    public boolean clear() {

        list.clear();

        return false;

    }



    @Override

    public Object[] toArray() {

        return list.toArray();

    }



    public Iterator<Object> iterator(){

        return new IteratorImpl();

    }



    private class IteratorImpl implements Iterator<Object>{

        @Override

        public boolean hasNext() {

            return cursor != list.size();

        }



        @Override

        public Object next() {

            int i = cursor;

            if(i >= list.size()){

                throw new NoSuchElementException();

            }

            Object nextElement = list.get(cursor);

            cursor = i + 1;

            return nextElement;

        }

        @Override

        public void remove(){

            list.remove(lastElement-1);

        }

    }



    public static void main(String[] args) {







       DefaultMyList dML = new DefaultMyList();

       for(int i = 0; i < 10; i++){

           dML.add(i);

       }



        Iterator<Object> it = dML.iterator();

        while (it.hasNext()){

            System.out.print(it.next() + " ");

        }

        System.out.println(dML.contains(10));











    }

}