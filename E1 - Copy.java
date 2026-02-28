package arrays;

public class E1 {
    public static void main(String[] args) {
        int [] arr1;
        arr1 = new int[5];
        //memory allocation[20 bytes]
        //declaration 1 memory Allocation in single line
        //if we dont provide value
        //the JVM uses "Fullback mechanisim"
        //it uses the default value of the data types
        //method2
        int[] arr2=new int[5];
        System.out.println(arr2[4]);
        System.out.println(arr1[3]);
        //method 3
int[]arr3={1,2,3,4,5};
//method4
        int[] arr4= new int[]{1,2,3,4,5};
}
}
