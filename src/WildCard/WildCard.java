package WildCard;


import java.util.*;

public class WildCard {

    static void printList(List<?> list) {

        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        printList(List.of("Java", "Python"));

        printList(List.of(10, 20,30,40));
    }
}

