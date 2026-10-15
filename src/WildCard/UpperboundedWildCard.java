package WildCard;

import java.util.*;

public class UpperboundedWildCard {

    static double calculateSum(
            List<? extends Number> numbers) {

        double sum = 0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integers = List.of(10, 20, 30);

        System.out.println(calculateSum(integers));
    }
}

