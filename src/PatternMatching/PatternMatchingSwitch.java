package PatternMatching;


public class PatternMatchingSwitch {

    static String check(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Null value";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        System.out.println(check(100));
        System.out.println(check("Java"));
    }
}


