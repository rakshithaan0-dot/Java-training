package arrays;

public class E3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrix rows: " + matrix.length);
        System.out.println("Matrix columns: " + matrix[0].length);

        int[][] jagged = {
                {1, 2, 3, 4, 5},
                {1, 2},
                {1}
        };

        System.out.println("\nJagged array:");
        for (int[] a : jagged) {
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        // Char jagged array
        char[][] names = {
                {'r','a','k','s','h','i'},
                {'g','o','w','d','a'}
        };

        System.out.println("\nChar jagged array:");
        for (char[] name : names) {
            for (char ch : name) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}