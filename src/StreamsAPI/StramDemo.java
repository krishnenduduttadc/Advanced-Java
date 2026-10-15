package StreamsAPI;


import java.util.*;

public class StramDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}

