package Binary_Search;

public class bin_search {

    public static int search(int key, int arr[]){
        int start=0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid + 1;
            }
            else if(arr[mid]>key){
                end = mid - 1;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
        }

     return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int key = 6;

        int print = search(key, arr);
        System.out.println("Element : " + key + "\nPresent at location : " + print);
    }
}
