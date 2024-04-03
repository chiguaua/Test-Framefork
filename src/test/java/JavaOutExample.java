import java.util.Scanner;

public class JavaOutExample {
    public static Object add(Object a, Object b) {
        return (((Number) (((Number) a).doubleValue() + ((Number) b).doubleValue())).doubleValue() + ((Number) a).doubleValue());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object input1 = scanner.nextInt();
        Object input2 = scanner.nextInt();
        System.out.println(add(input1, input2));
        System.out.println("CALL JAVA FROM LISP");
        scanner.close();
    }
}