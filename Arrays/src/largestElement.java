import java.util.Scanner;

public class largestElement {

    public static int largest(int[] arr){
        int n = arr.length;
        int k = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }

        return k;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        int result = largest(arr);
        System.out.println(result);

    }
}
