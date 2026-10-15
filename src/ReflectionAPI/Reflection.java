package ReflectionAPI;

import java.lang.reflect.Method;


    class Student {
        public void study() {
            System.out.println("Student is studying");
        }
    }

    public class Reflection {

        public static void main(String[] args) throws Exception {
            Student student = new Student();
            Class<?> clazz = student.getClass();
            System.out.println(clazz.getName());
            Method method = clazz.getMethod("study");
            method.invoke(student);
        }

}
