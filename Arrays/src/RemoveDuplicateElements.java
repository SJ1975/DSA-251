//Remove Duplicates Element from Sorted Array
//implement a two pointer strategy to optimize the space. Since the array is sorted, we know that all the duplicate values will be adjacent to each other.
//        Begin at the first position, which will always be part of the final unique list.
//        Move through the list one item at a time, comparing the current item with the most recently kept unique item.
//        If the current item is the same as the last kept one, skip it because it’s a duplicate.
//        If it’s different, place it right after the last kept unique item to keep all unique values grouped at the front.
//        Continue until every element in the list has been checked. The first part of the list now contains all the unique values in their original order, and the rest can be ignored.

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class RemoveDuplicateElements {

    public int removeElements(int @NotNull [] arr){
        int n = arr.length;
        if(n==0)
            return 0;;


         int i =0;
         for(int j = 1; j < n; j++){

             if(arr[j] != arr[i])
                 i++;

             arr[i] = arr[j];
         }

         return i + 1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

//        int[] expectedNum = new int[n];


        RemoveDuplicateElements sol = new RemoveDuplicateElements();
        int k = sol.removeElements(arr);

        System.out.println("Unique Element = " + k);
        System.out.print("Arrays after removing duplication: ");
        for(int x = 0; x < k; x++){
            System.out.println(arr[x] + " ");
        }
    }

}
