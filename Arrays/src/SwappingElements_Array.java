import java.util.ArrayList;
import java.util.Scanner;

public class SwappingElements_Array {

    //    public static void rotate(int[] arr, int k){
//        int n = arr.length;
//        k = Math.min(k, n/2);
//        for(int i = 0; i < k; i++){
//            int temp = arr[i];
//            arr[i] = arr[n-i-1];
//            arr[n-i-1] = temp;
//        }
//    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();

        k = Math.min(k, n / 2);

        for (int i = 0; i < k; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(n - i - 1));
            arr.set(n - i - 1, temp);
        }

        return arr;
    }

//    public static void printArray(int[] arr) {
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of an array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            System.out.println("Enter the element at" + i + "th index ");
//            arr[i] = sc.nextInt();
//        }
//
//        int k = sc.nextInt();
//
//        rotate(arr, k);
//
//        printArray(arr);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter the number of swaps to perform (k): ");
        int k = sc.nextInt();

        ArrayList<Integer> rotatedArray = rotateArray(arr, k);

        System.out.println(rotatedArray);

    }
}
