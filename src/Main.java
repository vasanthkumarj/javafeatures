import java8Interface.ExponentialInterface;

import java.util.*;

public class Main implements ExponentialInterface {

    public static void main(String args[])
    {
        List<Integer> collectionOfIntegers = Arrays.asList(1,2,3,4,5);
        ListIterator<Integer> iterator=collectionOfIntegers.listIterator();
        //interfaces implementations
        Main main=new Main();
        main.add(1,2);
        System.out.println("----------------------");
        //forEach
        collectionOfIntegers.forEach(i -> System.out.println(i));
        System.out.println("----------------------");
        //list-iterators
        while(iterator.hasNext())
        {
            iterator.set(iterator.next()+1);
        }
        collectionOfIntegers.forEach(i -> System.out.println(i));
    }



}
