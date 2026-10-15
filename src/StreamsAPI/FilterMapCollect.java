package StreamsAPI;


import java.util.*;
import java.util.stream.*;

public class FilterMapCollect {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

