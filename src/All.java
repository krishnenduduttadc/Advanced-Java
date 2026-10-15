import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// Immutable data representation
record Employee(int id, String name, double salary) {

    public Employee {

        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }

        if (salary < 0) {
            throw new IllegalArgumentException("Invalid salary");
        }
    }
}

public class All {

    public static void main(String[] args) {

        // HashMap
        Map<Integer, Employee> employees = new HashMap<>();

        employees.put(
                1,
                new Employee(1, "Rahul", 50000)
        );

        employees.put(
                2,
                new Employee(2, "Amit", 70000)
        );

        employees.put(
                3,
                new Employee(3, "Priya", 90000)
        );

        // Predicate functional interface
        Predicate<Employee> highSalary =
                employee -> employee.salary() > 60000;

        // Streams + lambda
        List<Employee> filteredEmployees =
                employees.values()
                        .stream()
                        .filter(highSalary)
                        .sorted(
                                Comparator.comparing(Employee::name)
                        )
                        .toList();

        // Display result
        filteredEmployees.forEach(System.out::println);

        // Calculate total salary
        double totalSalary =
                employees.values()
                        .stream()
                        .mapToDouble(Employee::salary)
                        .sum();

        System.out.println("Total Salary: " + totalSalary);
    }
}


