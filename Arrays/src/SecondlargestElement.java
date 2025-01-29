import java.util.* ;
import java.io.*;

public class SecondlargestElement {

    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);

        for(int i = n-2; i >= 0; i--){
            if(arr[i] != arr[n-1]){
                return arr[i];
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the element at" + i + "th index ");
            arr[i] = sc.nextInt();
        }
        int result = findSecondLargest(n, arr);
        System.out.println(result);
    }

}
