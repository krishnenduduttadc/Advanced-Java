package Generics;


class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GnrericsDemo {

    public static void main(String[] args) {

        Box<String> box1 = new Box<>();

        box1.setValue("Hello");

        System.out.println(box1.getValue());

        Box<Integer> box2 = new Box<>();

        box2.setValue(100);

        System.out.println(box2.getValue());
    }
}

