package java8Interface;

public interface TestInterface {


    void subtract(int a);

    int safeDivide(int a,int b);

    static void sub(int a,int b)
    {
        System.out.println(a-b);
    }

}
