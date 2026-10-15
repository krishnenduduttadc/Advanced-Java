package Generics;


import java.util.ArrayList;

public class Eraser {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(names.getClass());
        System.out.println(numbers.getClass());

        System.out.println(
                names.getClass() == numbers.getClass()
        );
    }
}


