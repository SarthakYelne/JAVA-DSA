package Arrays_2D.Diagonal_Sum;

// Time Complexity : O(n^2)

public class bruteforce {
    public static int diagonal_sum(int matrix[][]) {
         int sum = 0;

         for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (i==j) {
                    sum += matrix[i][j];
                }
                else if (i+j == matrix.length-1) {
                    sum += matrix[i][j]; 
                }
            }
         }
         return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
                
        System.out.println();
        System.out.println("Diagonal Matrix Sum : "+diagonal_sum(matrix));
    }
}

// Output :

// 1 2 3 4 
// 5 6 7 8 
// 9 10 11 12 
// 13 14 15 16 

// Diagonal Matrix Sum : 68