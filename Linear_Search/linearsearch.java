package Linear_Search;

import java.util.Scanner;

public class linearsearch {

    public static void find(int num, int arr[]){
        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                System.out.println("The element "+num+" is located at "+(i+1));
                break;
            }
            else{
                System.out.println("Element not present...");
            }
            
        }
        
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input Array Elements : ");
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Key Element : ");
            int num = sc.nextInt();
            find(num,arr);
        }
    }
}





