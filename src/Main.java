import java8Interface.ExponentialInterface;
import java8Interface.TestInterface;

import java.util.*;
import java.util.function.Consumer;

public class Main implements ExponentialInterface,TestInterface {

    public static void main(String args[])
    {
        Consumer consumer = new ConsumerImplementation();
        List<Integer> arrayOfIntegers = Arrays.asList(1,2,3,4,5);
        arrayOfIntegers.stream();
        //arrayOfIntegers.forEach(consumer);
        //Parent parent=new Child();
        //Parent.display();
    }

    @Override
    public void subtract(int a) {

    }

    @Override
    public void subtract(int a, int b) {

    }
}


//
//        List<Integer> collectionOfIntegers = Arrays.asList(1,2,3,4,5);
//        ListIterator<Integer> iterator=collectionOfIntegers.listIterator();
//        //interfaces implementations
//        Main main=new Main();
//        main.add(1,2);
//        System.out.println("----------------------");
//        //forEach
//        collectionOfIntegers.forEach(i -> System.out.println(i));
//        System.out.println("----------------------");
//        //list-iterators
//        while(iterator.hasNext())
//        {
//            iterator.set(iterator.next()+1);
//        }
//        collectionOfIntegers.forEach(i -> System.out.println(i));
//
//        //lambda
////        TestInterface testInterface = (int x) -> System.out.println(x);
////        testInterface.subtract(6);
//        System.out.println("----------------------");
////        TestInterface testInterface1= (int a,int b) -> b!=0? a/b : b ;
////        System.out.println(testInterface1.safeDivide(1,0));
//
//        TestInterface testInterface2 = new TestInterface() {
//            @Override
//            public void subtract(int a) {
//                System.out.println(a);
//            }
//
//            @Override
//            public int safeDivide(int a, int b) {
//                return a+b;
//            }
//        };
//
//        testInterface2.subtract(10);
//
//
//
