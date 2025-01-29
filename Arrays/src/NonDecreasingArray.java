import java.util.Scanner;

public class NonDecreasingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the element at" + i + "th index ");
            arr[i] = sc.nextInt();
        }

        System.out.println(isPossible(arr, n));
    }

   static boolean isPossible(int[] arr, int n) {
        // Write your code here.
        int count = 0;
        int index = -1;

        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
                index = i;
            }
        }

        if(count == 0){
            return true;
        }

        if(count > 1){
            return false;
        }

        if(index == 0 || arr[index - 1] <= arr[index+1]){
            return true;
        }

        if(index + 2 >= n || arr[index] <= arr[index+2]){
            return true;
        }

        return false;

    }

}
