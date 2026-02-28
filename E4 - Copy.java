package arrays;

public class E4 {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] createarray() {
        int[] arr = {10, 20, 30, 40, 50};
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        int[] result = createarray();

        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
        printArray(new int[]{100, 200, 300});
    }
}