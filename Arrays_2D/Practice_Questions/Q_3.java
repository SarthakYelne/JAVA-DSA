package Arrays_2D.Practice_Questions;

// Question : Write a program to FindTranspose ofa Matrix
            // Transpose of a matrix is the process ofswapping the rows to columns. For a 2x3 matrix,
            // Matrix
            // a11    a12    a13
            // a21    a22    a23
            // Transposed Matrix
            // a11    a21
            // a12    a22
            // a13    a23

public class Q_3 {
    public static void transpose(int matrix[][]) {
        int row = 2, col = 3;

        // first print orignal matrix
        prints(matrix);

        int transpose[][] = new int [col][row];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println();
        // print transpose matrix
        prints(transpose);
    }
    public static void prints(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{11, 12, 13},
                          {21, 22, 23}};
        transpose(matrix);
    }
}

// Output : 

// 11 12 13 
// 21 22 23 

// 11 21    
// 12 22    
// 13 23  
