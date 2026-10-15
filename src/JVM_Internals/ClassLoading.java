package JVM_Internals;

class Student {

    static {
        System.out.println("Student class loaded");
    }

    Student() {
        System.out.println("Student object created");
    }
}

public class ClassLoading {

    public static void main(String[] args) {

        System.out.println("Program started");

        Student s = new Student();
    }
}




