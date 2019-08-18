package java8Interface;

public interface ExponentialInterface {



    default void add(int a, int b) {
        System.out.println(a+b);
    }
}
