package exceptions;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 0;

        try {
            k = i / j;

            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[9]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
            e.printStackTrace(); // Details

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index");

        } catch (Exception e) {
            System.out.println("Something unexpected happens");
        }

        finally {
            System.out.println("End of Execution");
            System.out.println("Turn DB");
            System.out.println("Turn Internet");
            System.out.println("Turn Files");
            System.out.println("Turn Docker-Kubernetes");
        }
    }
}