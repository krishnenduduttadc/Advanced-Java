package StreamsAPI;


import java.util.*;

public class ReduceDemo {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}

