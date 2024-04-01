package Arrays_2D.Spiral_Matrix;

// Spiral Matrix Problem
// Time Complexity : O(n*m)

public class spiral {
    public static void Spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startCol<=endCol && startRow<=endRow) {
            
            //top
            for (int i=startCol; i<=endCol; i++) {
                System.out.print(matrix[startRow][i]+" ");
            }
    
            //right
            for (int j=startRow+1; j<=endRow; j++) {
                System.out.print(matrix[j][endCol]+" ");
            }
    
            //bottom
            for (int i=endCol-1; i>=startCol; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
    
            //left 
            for (int j=endRow-1; j>=startRow+1; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }
    
            startRow++;
            startCol++;
            endCol--;
            endRow--;
    
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8,},
                          {9,10,11,12},
                          {13,14,15,16}};

        Spiral(matrix);
    }
}

// Output : 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 