package Sorting_Algorithms.Bubble_Sort;

public class Bubblesort {
    public static void BubbleSort(int arr[]) {
        int n = arr.length;
        // int swap = 0;

        for(int turns=0; turns<n-1; turns++) {
            // swap++;
            for(int i=0; i<n-1-turns; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        // System.out.println(swap);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};

        BubbleSort(arr);
        printarr(arr);
    }
}

// Output : 

// 1 2 3 4 5
