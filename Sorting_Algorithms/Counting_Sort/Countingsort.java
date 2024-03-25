package Sorting_Algorithms.Counting_Sort;

public class Countingsort {
    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }

        // counts frequnecy
        int count[] = new int [largest+1];
        for(int i=0; i<arr.length; i++) {
             count[arr[i]]++;
        }

        int j = 0;
        //Count Number of Counts present int arr[]
        for(int i=0; i<count.length; i++){
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void prints(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,1,2,4,3,7};

        CountingSort(arr);
        prints(arr);
    }
}

// Output : 

// 1 1 2 3 3 4 4 7 