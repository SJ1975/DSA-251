//Find Second Smallest and Second Largest Element in an array

import java.util.Arrays;

public class SecondElement {

    //Brute Force Approach
//    static private void secondElement(int[] arr, int n){
//        if(n==0 || n==1){
//            System.out.println("1");
//            System.out.println(" ");
//            System.out.println("-1");
//            System.out.println("/n");
//        }
//        Arrays.sort(arr);
//        int small = arr[1];
//        int secondLargest = arr[n-2];
//        System.out.println(small+ " and " + secondLargest);
//    }

    //Better Approach
//    static private void secondElement(int[] arr, int n){
//        if(n == 0 || n == 1){
//            System.out.println("1");
//            System.out.println(" ");
//            System.out.println("-1");
//            System.out.println("/n");
//        }
//        int small = Integer.MAX_VALUE;
//        int secondSmall = Integer.MAX_VALUE;
//        int large = Integer.MIN_VALUE;
//        int secondLarge = Integer.MIN_VALUE;
//
//        for(int i = 0; i < n; i++){
//            small = Math.min(small, arr[i]);
//            large = Math.max(large, arr[i]);
//        }
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] < secondSmall && arr[i] != small){
//                secondSmall = arr[i];
//            }
//
//            if(arr[i] > secondLarge && arr[i] != large){
//                secondLarge = arr[i];
//            }
//        }
//
//        System.out.println(secondSmall + " and " + secondLarge);
//
//    }


    //Better Approach
    static private int secondSmallest(int[] arr, int n){

        if(n < 2){
            return -1;
        }

       int small = Integer.MAX_VALUE;
       int secondSmallest = Integer.MAX_VALUE;
       for(int i = 0; i < n; i++){
          if(arr[i] < small){
              secondSmallest = small;
              small = arr[i];
          }
          else if(arr[i] < secondSmallest && arr[i] != small){
              secondSmallest = arr[i];
          }
        }

       return secondSmallest;
    }

    static private int secondLargest(int[] arr, int n){

        if(n < 2){
            return -1;
        }

        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > large){
                secondLargest = large;
                large = arr[i];
            }

            else if(arr[i] > secondLargest && arr[i] != large){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 6, 9, 0, 8, 6};
        int n = arr.length;
//        secondElement(arr, n);

        int secondSmall = secondSmallest(arr, n);
        int secondLarge = secondLargest(arr, n);

        System.out.println(secondSmall + " and " + secondLarge);
    }
}
