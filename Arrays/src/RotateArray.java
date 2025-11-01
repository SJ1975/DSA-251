import java.util.ArrayList;
import java.util.Scanner;

public class RotateArray {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        k = k%n;
        ArrayList<Integer> rotatedArr = new ArrayList<>();

        for(int i = k; i < n; i++){
            rotatedArr.add(arr.get(i));
        }

        for(int i = 0; i < k; i++){
            rotatedArr.add(arr.get(i));
        }

        return rotatedArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the elements of the ArrayList:" + " ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter the number of swaps to perform (k): ");
        int k = sc.nextInt();

        ArrayList<Integer> rotatedArray = rotateArray(arr, k);

        System.out.println(rotatedArray);

    }
}
