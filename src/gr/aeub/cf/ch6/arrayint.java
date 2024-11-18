package gr.aeub.cf.ch6;

public class arrayint {

    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5};

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        for (int el : arr3){
            System.out.println(el + " ");
        }
    }
}
