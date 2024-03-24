package Sorting_Algorithms.Selection_Sort;

public class Selectionsort {
    public static void SelectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int curr = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[curr] > arr[j]) {
                    curr = j;
                }
            }
            int temp = arr[curr];
            arr[curr] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,9,4,3,1};

        SelectionSort(arr);
        printarr(arr);
    }
}

// Output :

// 1 3 4 6 9 