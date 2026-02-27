package exceptions;

public class E3 {
    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Eligible - Acess Granted");
        } else {
            throw new RuntimeException("Not eligible - Acess Denied");
        }

    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
