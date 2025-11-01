import java.util.Scanner;

public class MoveAllZeros {

    //Brute Force Algorithm
//    The extremely naive solution, we can think of, involves the use of an extra array. The algorithm is as follows.
//    Suppose, there are N-X zeros and X non-zero elements in the array. We will first copy those X non-zero elements from the original array to a temporary array.
//    Then, we will copy the elements from the temporary array one by one and fill the first X places of the original array.
//    The last N-X places of the original array will be then filled with zero. Now, our task is completed.

    // TC-- O(n) && SC-- O(n)

//    public static int[] moveZeros(int[] arr){
//        int n = arr.length;
//
//        int[] temp = new int[n];
//
//        int index = 0;
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] != 0){
//                temp[index] = arr[i];
//                index++;
//            }
//        }
//
//        for(int i = 0; i < n; i++){
//            arr[i] = temp[i];
//        }
//
//        return arr;
//    }

    //Optimal Approach
    public static void moveZeros(int[] arr){
        int j = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i = j + 1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        //8int[] result = moveZeros(arr);
        System.out.println("Array after moving zeros to left: ");
        moveZeros(arr);
        for(int result : arr){
            System.out.println(result + " ");
        }
        System.out.println();
    }
}
