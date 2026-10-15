package Record;

record Student(int id, String name) {}
public class Record {
    public static void main(String[] args) {

        Student student = new Student(1, "Rahul");

        System.out.println(student.id());

        System.out.println(student.name());

        System.out.println(student);
    }
}
