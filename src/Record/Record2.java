package Record;



record Employee(int id, String name) {
    public Employee {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID: Must be greater than 0");
        }
        if (name == null || name.strip().isEmpty()) {
            throw new IllegalArgumentException("Name required: Cannot be null or blank");
        }
    }
}

public class Record2 {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(101, "Rahul");
            System.out.println("✅ Success: " + emp1);
            System.out.println("Employee ID: " + emp1.id());
            System.out.println("Employee Name: " + emp1.name());
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        System.out.println("\n--- Running Validation Tests ---");
        try {
            Employee emp2 = new Employee(0, "Amit");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Caught expected error: " + e.getMessage());
        }
        try {
            Employee emp3 = new Employee(102, null);
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Caught expected error: " + e.getMessage());
        }
    }
}


