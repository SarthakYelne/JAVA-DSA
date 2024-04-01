package Arrays_2D.Search_In_Sorted_Matrix;

// Staircase problem
// Time Complexity : O(n+m)

public class staircase_problem {
    public static boolean StairCase_problem (int matrix[][], int key) {   
        int row = 0, col = matrix[0].length-1;

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
