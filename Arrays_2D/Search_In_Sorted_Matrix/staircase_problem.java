package Arrays_2D.Search_In_Sorted_Matrix;

// Staircase problem
// Time Complexity : O(n+m)

public class staircase_problem {
    public static boolean StairCase_problem (int matrix[][], int key) {   
        // int row = matrix.length-1, col = 0; // for bottom to top
        int row = 0, col = matrix[0].length-1; // for top to bottom

        // This Logic for top to bottom
        while (row <= matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            else if (key<matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }

        // This logic for bottom to top 
        // while(row >= 0 && col <= matrix.length) {
        //     if(key == matrix[row][col]){
        //         System.out.println("Key Found");
        //         return true;
        //     }
        //     else if (key < matrix[row][col]) {
        //         row--;
        //     }
        //     else {
        //         col++;
        //     }
        // }

        System.out.println("Key not found...");
        return false;

    }

    public static void main(String[] args) {
          int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
          System.out.println(StairCase_problem(matrix,33));
    }
}
