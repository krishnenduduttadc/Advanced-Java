package Functional;


import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> printer =
                name -> System.out.println(name);

        printer.accept("Spring Boot");
    }
}

