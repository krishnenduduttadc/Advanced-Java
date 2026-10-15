package ObjectDesign;


final class Student1 {

    private final String name;

    public Student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ImmutableDemo {

    public static void main(String[] args) {

        Student1 student = new Student1("Rahul");

        System.out.println(student.getName());
    }
}

