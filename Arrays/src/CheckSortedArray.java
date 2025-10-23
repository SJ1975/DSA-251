// Check Array is sorted or Not

public class CheckSortedArray {

    //Brut Force
//    static private boolean isArraySorted(int[] arr){
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            for(int j = i + 1; j < n; j++){
//                if(arr[j] < arr[i]){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }

    //Optimal Solution
    static private boolean isArraySorted(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,8,15};
        System.out.println(isArraySorted(arr));
    }
}
