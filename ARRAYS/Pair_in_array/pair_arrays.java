package Arrays.Pair_in_array;

// Pairs in an Array
public class pair_arrays {
    
    public static void pairs(int arr[]){
        int tp=0;
        for(int i=0; i<arr.length; i++){
            
            //pairs of single no. 2,4,6,8,10
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 10, 16, 17};

        pairs(arr);
    }
}

/* Output : 
(2,4) (2,8) (2,10) (2,12) (2,16) (2,17) 
(4,8) (4,10) (4,12) (4,16) (4,17)
(8,10) (8,12) (8,16) (8,17)
(10,12) (10,16) (10,17)
(12,16) (12,17)
(16,17)

Total Pairs : 21
 */ 


