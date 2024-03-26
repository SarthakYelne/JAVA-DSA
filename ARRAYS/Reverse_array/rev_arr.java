package Arrays.Reverse_array;

// Reverse an Array

public class rev_arr {
    public static void reverse(int arr[]){
      
        int start = 0, end = arr.length - 1;

        while (start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 12, 14, 16};

        reverse(arr);
        System.out.print("Reversed Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


/*Output :
Reversed Array : 16 14 12 8 6 4 2*/