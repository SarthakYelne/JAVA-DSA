package Arrays.Max_Sum_SubArrays;

public class Brute_Force {

    public static void Max_Subarray_sum(int arr[]){ 

        int curr;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
             curr = 0;
             for (int k = i; k <= j; k++) {
                 curr += arr[k];
                 if (max_sum < curr) {
                     max_sum = curr;
                 }
                }
                System.out.println(curr);
            }
        }
        System.out.println("Max Sum = " + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        Max_Subarray_sum(arr);
    }
}

/*
Output :
-1
5
4
7
4
3
6
5
8
2
Max Sum = 8
 */
