package java8Interface;

public interface ExponentialInterface {

    void subtract(int a);

    default void add(int a, int b) {
        System.out.println(a+b);
    }
}
