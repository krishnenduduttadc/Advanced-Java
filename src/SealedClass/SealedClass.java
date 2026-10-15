package SealedClass;


sealed class Vehicle permits Car, Bike {
    void start() {
        System.out.println("Vehicle starting");
    }
}

final class Car extends Vehicle {}

final class Bike extends Vehicle {}

public class SealedClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
    }
}
