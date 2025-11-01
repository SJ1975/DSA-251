public class LeftRotateArrayOne {

    //Brute Force                         -- TC: O(n) and SC: O(n)
//    static void leftRotate(int[] arr, int n){
//           int temp[] = new int[n];
//           for(int i = 1; i < n; i++){
//               temp[i-1] = arr[i];
//           }
//
//           temp[n-1] = arr[0];
//           for(int i = 0; i < n; i++){
//               System.out.print(temp[i] + " ");
//           }
//    }

    //Optimal Approach                 -- TC: O(n) and SC: O(1)
    static void leftRotate(int[] arr, int n){
        int temp = arr[0];              //store the first element of array in a variable
        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;                //assigned the value of variable at the last index
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 4, 8, 3, 2};
        leftRotate(arr, n);
    }
}
