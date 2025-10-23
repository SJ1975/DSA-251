public class EquilibriumIndex {
    public static void main(String[] args) {

    }

    public static int arrayEquilibriumIndex(int[] arr){
        //Your code goes here
        int n = arr.length;

        for(int i = 0; i<n; i++){

            int leftSum = 0;
            for(int j = 0; j < i; j++){
                leftSum += arr[j];
            }

            int rightSum = 0;
            for(int j = i+1; j < n; j++){
                rightSum += arr[j];
            }

            if(leftSum==rightSum){
                return i;
            }
        }

        return -1;

    }
}
