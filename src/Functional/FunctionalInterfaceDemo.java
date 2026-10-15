package Functional;


@FunctionalInterface
interface Calculator1 {
    int calculate(int a, int b);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Calculator1 add = (a, b) -> a + b;

        Calculator1 multiply = (a, b) -> a * b;

        System.out.println(add.calculate(10, 5));

        System.out.println(multiply.calculate(10, 5));
    }
}


