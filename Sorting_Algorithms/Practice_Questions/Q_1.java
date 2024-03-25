package Sorting_Algorithms.Practice_Questions;

// Question : Use the following sorting algorithms to sort an array in DESCENDING order :
// a. Bubble Sort
// b. Selection Sort
// c. Insertion Sort
// d. Counting Sort

public class Q_1 {
    
    public static void Bubble_Desc(int arr[]) {
        int n = arr.length;

        for (int i=0; i<n-1; i++) { //turns
            for (int j=0; j<n-1-i; j++) { //loops
                if(arr[j] < arr[j+1]) { //swaps
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void Selection_Desc(int arr[]) {
        int n = arr.length;

        for(int i=0; i<n-1; i++) {
            int curr = i;

            for(int j=i+1; j<n; j++) {
                if(arr[curr] < arr[j]) {
                    curr = j;
                }
            }

            int temp = arr[curr];
            arr[curr] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Insertion_Desc(int arr[]) {
        int n = arr.length;

        for (int i = 0; i<n; i++) {
            int curr = arr[i];
            int prev = i-1;
    
            while (prev>=0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void Counting_Desc(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        //Finds Largest 
        for (int i=0; i<n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        //find the Counts frequency
        int counts[] = new int [largest+1];
        for (int j=0; j<n; j++) {
            counts[arr[j]]++;
        }

        //Prints sorted arr[] loop
        int j=0;
        for (int i=counts.length-1; i>=0; i--) {
            while (counts[i] > 0) {
                arr[j] = i;
                j++;
                counts[i]--;
            }
        }

    }
    
    public static void prints(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1,8, 7, 4, 5, 3, 1};
        
        System.out.print("Unsorted Array : ");
        prints(arr);
        System.out.println("\n");

        Bubble_Desc(arr);
        prints(arr);
        System.out.println();

        Selection_Desc(arr);
        prints(arr);
        System.out.println();

        Insertion_Desc(arr);
        prints(arr);
        System.out.println();

        Counting_Desc(arr);
        prints(arr);

    }
}

// Output : 

// Unsorted Array : 3 6 2 1 8 7 4 5 3 1 

// 8 7 6 5 4 3 3 2 1 1
// 8 7 6 5 4 3 3 2 1 1
// 8 7 6 5 4 3 3 2 1 1
// 8 7 6 5 4 3 3 2 1 1 
