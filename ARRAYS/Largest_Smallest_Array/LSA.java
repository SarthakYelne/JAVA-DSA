package Arrays.Largest_Smallest_Array;

public class LSA {

    public static int getsize(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element : " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 12};

        System.out.println("Largest element : " + getsize(arr));
    }
}

/*Output :
  Smallest element : 2
  Largest element : 12
 */