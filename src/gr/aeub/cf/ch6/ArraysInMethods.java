package gr.aeub.cf.ch6;

public class ArraysInMethods {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int el : arr){
            System.out.println(el + " ");
        }
    }


}