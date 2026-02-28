package arrays;

public class E2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Access element
        System.out.println(arr[1]);

        // Modify element
        arr[1] = 40;
        System.out.println(arr[1]);

        // Normal for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Enhanced for loop
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Using Object reference
        for (Object o : arr) {
            System.out.print(o + " ");
        }

        System.out.println();

        // String example
        String name = "java";
        System.out.println(name.length());
    }
}