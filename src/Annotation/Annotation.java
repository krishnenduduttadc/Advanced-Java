package Annotation;


import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}


class Student {
    @MyAnnotation("Important method")
    public void study() {
        System.out.println("Studying Java");
    }
}

public class Annotation {
    public static void main(String[] args) throws Exception {

        Method method =
                Student.class.getMethod("study");

        MyAnnotation annotation =
                method.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.value());
    }
}
