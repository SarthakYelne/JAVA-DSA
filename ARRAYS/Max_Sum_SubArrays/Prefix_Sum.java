package Arrays.Max_Sum_SubArrays;

public class Prefix_Sum {
    public static void prefix_sum(int arr[]){
        int curr = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i+1; j < arr.length; j++) {
                int end = j;
                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if (max_sum < curr) {
                    max_sum = curr;
                }
                System.out.println(curr);
            }
        }
        System.out.println("Max_Sum : " + max_sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        prefix_sum(arr);
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