package HomeWork11;



import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;

import java.util.NoSuchElementException;



public class DefaultMyList implements MyList<Object> {

     List states= new ArrayList<>();

    Iterator<Object> Iter = states.iterator();

    private boolean g = false;

    private boolean g1 = false;

    private boolean g2 = false;

    int cursor=0;

    int lastElement;



    private class IteratorImpl implements Iterator<Object>{

            @Override

            public boolean hasNext() {

                return cursor<states.size();

            }



            @Override

            public Object next() {

                    if(cursor >=states.size()){

                        throw new NoSuchElementException();

                    }

                    String nextElements =(String) states.get(cursor);

                    cursor++;

                    return nextElements;

            }

            @Override

            public void remove(){

                states.remove(lastElement-1);

            }

        }



    @Override

    public void add(Object e) {

        states.add(e);

        lastElement++;

    }

    @Override

    public int sizes() {

        return states.size();

    }



    @Override

    public boolean contains(Object o) {

        if(states.contains(o)){

            g=true;

        }

        return g;

    }



    @Override

    public boolean containsAll(List c) {

        if(states.equals(c)){ //Если воспользоваться методом containsAll нужный результат не получится(( Видимо

                               //если хоть один элемент из списка №1 будет совпадать с элементом из списка №2

                                //Вернется true...

            g1 = true;

        }

        else{

            g1 = false;

        }

        return g1;

    }



    @Override

    public boolean remove(Object o) {

        states.indexOf(o);

        states.remove(o);

        return g2;

    }



    @Override

    public void clears() {

        states.clear();

    }



    @Override

    public Object[] toArrays() {

        return states.toArray();

    }



    public Iterator<Object> iterator(){

        return new IteratorImpl();

    }



}
